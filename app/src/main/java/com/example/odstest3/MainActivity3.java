package com.example.odstest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {


    GridView gridView;

    ArrayAdapter<String> arrayAdapter;

    String[] Countries={"India","Usa","Uk","China",
            "India","Usa","Uk","China","India","Usa","Uk","China",
            "India","Usa","Uk","China",
            "India","Usa","Uk","China","Others"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        gridView=findViewById(R.id.SimpleGrid);

       // arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,Countries);
        arrayAdapter=new ArrayAdapter<>(MainActivity3.this, R.layout.text_layout,R.id.myText,Countries);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity3.this, ""+Countries[i], Toast.LENGTH_SHORT).show();
            }
        });

        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity3.this, ""+i, Toast.LENGTH_SHORT).show();

                return true;
            }
        });
    }
}