package com.example.lockapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class inside_room_button extends Activity {
    TextView currentStatus,insideRoom;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_room_button);
        Intent intent = getIntent();
        String str = intent.getStringExtra("room_code");
       // Toast.makeText(inside_room_button.this,str,Toast.LENGTH_SHORT).show();
        currentStatus=findViewById(R.id.current_status);
        aSwitch=findViewById(R.id.simpleSwitch);
        insideRoom=findViewById(R.id.inside_room);
        insideRoom.setText(str);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    currentStatus.setText("Locked");
                    currentStatus.setTextColor(ContextCompat.getColor(inside_room_button.this,R.color.red));
                }else {
                    currentStatus.setText("Unlocked");
                    currentStatus.setTextColor(ContextCompat.getColor(inside_room_button.this,R.color.green));

                }
            }
        });

    }
}

