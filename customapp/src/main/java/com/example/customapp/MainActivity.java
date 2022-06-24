package com.example.customapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView customlist;
    UserPojo userPojo;
    UserAdapter userAdapter;
    List<UserPojo> userPojoList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customlist=findViewById(R.id.customList);
        userAdapter=new UserAdapter(this,userPojoList);
        customlist.setAdapter(userAdapter);

        //loadUserData();
        loadUserData1();

        customlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("namekey",userPojoList.get(i).getName());
                intent.putExtra("mailkey",userPojoList.get(i).getMail());
                intent.putExtra("mobilekey",userPojoList.get(i).getMobile());
                intent.putExtra("addresskey",userPojoList.get(i).getAddress());
                startActivity(intent);
            }
        });



    }

    private void loadUserData1() {
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Deepak","deepak@gmail.com","1234567890","Hyd");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Sai","Sai@gmail.com","9876543123","Mumbai");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Pavan","Pavan@gmail.com","09876234523","Delhi");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Sanjay","Sanjay@gmail.com","2345876543","Hyd");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Ram","Ram@gmail.com","7654123409","kochi");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Ravi","Ravi@gmail.com","345698734232","Pune");
        userPojoList.add(userPojo);

        userAdapter.notifyDataSetChanged();

    }

    private void loadUserData() {

        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Deepak","deepak@gmail.com","1234567890");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Sai","Sai@gmail.com","9876543123");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Pavan","Pavan@gmail.com","09876234523");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Sanjay","Sanjay@gmail.com","2345876543");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Ram","Ram@gmail.com","7654123409");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.ic_launcher_background,"Ravi","Ravi@gmail.com","345698734232");
        userPojoList.add(userPojo);

        userAdapter.notifyDataSetChanged();


    }
}