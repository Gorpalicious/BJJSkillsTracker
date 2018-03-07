package com.bjjskillstracker;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.trainingapp.bjjskillstracker.R;

public class MainScreen extends AppCompatActivity {

    public ImageButton button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        button1 = findViewById(R.id.button_PositionControl);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
            Toast.makeText(MainScreen.this, "It works", Toast.LENGTH_LONG).show();
            }
        });
    }
}
