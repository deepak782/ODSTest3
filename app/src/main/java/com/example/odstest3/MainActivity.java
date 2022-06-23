package com.example.odstest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1,spinner2;
    String[] gender;
    String genderStr,countryStr;

    String[] Countries={"-- Select Country --","India","Usa","Uk","China",
            "India","Usa","Uk","China","India","Usa","Uk","China",
            "India","Usa","Uk","China",
            "India","Usa","Uk","China","Others"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);

        //arrayAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Countries);
        arrayAdapter=new ArrayAdapter<>(MainActivity.this, R.layout.text_layout,R.id.myText,Countries);
        spinner2.setAdapter(arrayAdapter);
       // gender=getResources().getStringArray(R.array.gender);

        /*spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, ""+gender[i]+"-"+i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/

       /* spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+Countries[i]+"-"+i, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/
    }

    public void submit(View view) {

        genderStr=spinner1.getSelectedItem().toString();
        countryStr=spinner2.getSelectedItem().toString();

        if(genderStr.equals("-- Select Gender --"))
        {
            Toast.makeText(this, "Please Select Gender", Toast.LENGTH_SHORT).show();
        }

        else if(countryStr.equals("-- Select Country --"))
        {
            Toast.makeText(this, "Please Select Country", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this, ""+genderStr+"\n"+countryStr, Toast.LENGTH_SHORT).show();

        }
    }
}