package com.e.tugaslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String[] items={"1\t72140020\tBrayen Chanzezar Saroinsong","2\t72140048\tArnold Stanley Rivaldy Tato"
        ,"3\t72150019\tVerina Kristanti Wiyono","4\t72150043\tYubelince Naomi Wakum","5\t72150066\tHendry Masiku"
        ,"6\t72160033\tBaskoro Adi Wicaksono","7\t72170092\tYos Rafel Kristanto","8\t72170106\tAlfadeo Melody Jeremy Bulin"
        ,"9\t72170110\tYashinta Novita Dewi","10\t72170112\tYalina Hosea","11\t72170125\tAdrian Paskalis"
        ,"12\t72170126\tDesta Siwi P","13\t72170131\tCindy Claudya","14\t72170146\tAngkie Octovaldo Elias Wangkay"
        ,"15\t72170148\tChristian Dorra","16\t72170154\tTita Marita Simangunsong","17\t72170155\tAngga Dwi Kaharap"
        ,"18\t72170158\tFransiska Ayu Gloria","19\t72170160\tMika Havennia Sirait","20\t72170166\tMarni Eva Kristina Saragih"
        ,"21\t72170168\tAristyo Rahadian Agung Nugroho","22\t72170170\tLaurentia Yulia Cristi"
        ,"23\t72170172\tPutu Abdi Setiawan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener tambahButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TambahActivity.class);
                startActivity(intent);
            }
        };
        Button tambahBtn = (Button)findViewById(R.id.btnTambah);
        tambahBtn.setOnClickListener(tambahButtonListener);

        View.OnClickListener updateButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UpdateActivity.class);
                startActivity(intent);
            }
        };
        Button updateBtn = (Button)findViewById(R.id.btnUpdate);
        updateBtn.setOnClickListener(updateButtonListener);

        ListView lv = (ListView)findViewById(R.id.list);
        lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,items));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Anda memilih " + items[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
