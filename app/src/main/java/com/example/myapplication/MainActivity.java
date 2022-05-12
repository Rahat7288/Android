package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("Message", "onCreate");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Message", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Message", "onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Message", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Message", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Message", "onRestart");
    }
}