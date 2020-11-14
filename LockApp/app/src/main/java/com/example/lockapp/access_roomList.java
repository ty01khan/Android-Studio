package com.example.lockapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.example.first_app.Adapter.roomAdapter;

import java.util.ArrayList;

public class access_roomList extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private roomAdapter roomAdapter;
    private ArrayList<String> roomname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_room_list);
        roomname = new ArrayList<>();
        roomname.add("Class Room-1");
        roomname.add("Class Room-2");
        roomname.add("Auditorium");
        roomname.add("Mech Lab-1");
        roomname.add("Elec Lab-1");

        recyclerView=findViewById(R.id.recycleView);

        layoutManager= new LinearLayoutManager(access_roomList.this);
        recyclerView.setLayoutManager(layoutManager);
        roomAdapter=new roomAdapter(access_roomList.this,roomname);
        recyclerView.setAdapter(roomAdapter);
    }
}

