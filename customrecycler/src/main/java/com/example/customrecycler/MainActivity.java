package com.example.customrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.customrecycler.adapter.GameAdapter;
import com.example.customrecycler.adapter.UserAdapter;
import com.example.customrecycler.model.GameModel;
import com.example.customrecycler.model.UserModel;
import com.example.customrecycler.myinterface.OnItemClick;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements OnItemClick {

    RecyclerView recyclerView_h,recyclerView_h1,recyclerView_h2,recyclerView_v;
    //Horizontal
    UserModel userModel;
    UserAdapter userAdapter;
    List<UserModel> userModelList=new ArrayList<>();

    //Vertical
    GameModel gameModel;
    GameAdapter gameAdapter;
    List<GameModel> gameModelList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView_h=findViewById(R.id.recycler_h);
        recyclerView_h1=findViewById(R.id.recycler_h1);
        recyclerView_h2=findViewById(R.id.recycler_h2);
        recyclerView_v=findViewById(R.id.recycler_v);

        recyclerView_h.setHasFixedSize(true);
        recyclerView_h1.setHasFixedSize(true);
        recyclerView_h2.setHasFixedSize(true);
        recyclerView_v.setHasFixedSize(true);
        //Layout Manger
        recyclerView_h.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView_h1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView_h2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView_v.setLayoutManager(new LinearLayoutManager(this));

        userAdapter=new UserAdapter(getApplicationContext(),userModelList);
        recyclerView_h.setAdapter(userAdapter);
        recyclerView_h1.setAdapter(userAdapter);
        recyclerView_h2.setAdapter(userAdapter);

        //Vertical Adapter
        gameAdapter=new GameAdapter(getApplicationContext(),gameModelList,this);
        recyclerView_v.setAdapter(gameAdapter);

        loadHorizontalMethod();
        loadVerticalMethod();

    }

    private void loadVerticalMethod() {
        gameModel=new GameModel("Game1","Country1","11");
        gameModelList.add(gameModel);
        gameModel=new GameModel("Game2","Country2","12");
        gameModelList.add(gameModel);
        gameModel=new GameModel("Game3","Country3","13");
        gameModelList.add(gameModel);
        gameModel=new GameModel("Game4","Country4","14");
        gameModelList.add(gameModel);
        gameModel=new GameModel("Game5","Country5","15");
        gameModelList.add(gameModel);
        gameModel=new GameModel("Game6","Country6","16");
        gameModelList.add(gameModel);
        gameAdapter.notifyDataSetChanged();
    }


    private void loadHorizontalMethod() {
        userModel=new UserModel(R.drawable.img_1,"User1");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_2,"User2");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_3,"User3");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_4,"User4");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_5,"User5");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_6,"User6");
        userModelList.add(userModel);

        userAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(int position) {

        Toast.makeText(this, ""+gameModelList.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}