package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button buttonStart;
    Button buttonStop;

    int counter = 0;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),ServicesExample.class);
                startActivity(i);

            }

        });

        buttonStop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });



        Log.d("Message", "First Activity onCreate");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message", "First Activity onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Message", "First Activity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Message", "First Activity onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Message", "First Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Message", "First Activity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Message", "First Activity onRestart");
    }
}