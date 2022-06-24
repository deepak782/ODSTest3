package com.example.customapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name,mail,mobile,address;

    String nameStr,mailStr,mobileStr,addressStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.name);
        mail=findViewById(R.id.mail);
        mobile=findViewById(R.id.mobile);
        address=findViewById(R.id.address);

        nameStr=getIntent().getStringExtra("namekey");
        mailStr=getIntent().getStringExtra("mailkey");
        mobileStr=getIntent().getStringExtra("mobilekey");
        addressStr=getIntent().getStringExtra("addresskey");

        name.setText(""+nameStr);
        mail.setText(""+mailStr);
        mobile.setText(""+mobileStr);
        address.setText(""+addressStr);

    }
}