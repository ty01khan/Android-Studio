package com.example.first_app.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lockapp.R;
import com.example.lockapp.inside_room_button;

import java.util.ArrayList;

public class roomAdapter extends RecyclerView.Adapter <roomAdapter.room_Model> {
    private ArrayList <String> roomName;
    private Context context;

    public roomAdapter(Context context,ArrayList<String> roomName) {
        this.roomName = roomName;
        this.context=context;
    }

    @NonNull
    @Override
    public room_Model onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_room,parent,false);
        return new room_Model(view);
    }

    @Override
    public void onBindViewHolder(@NonNull room_Model holder, final int position) {
        holder.Room.setText(roomName.get(position));
        holder.Room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, inside_room_button.class);
                intent.putExtra("room_code",roomName.get(position));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return roomName.size();
    }

    public class room_Model extends RecyclerView.ViewHolder {
        Button Room;
        public room_Model(@NonNull View itemView) {
            super(itemView);
            Room = itemView.findViewById(R.id.room_recyclerButton);
        }
    }
}

