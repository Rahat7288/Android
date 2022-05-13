package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText userMessage;
    Button Counter;
    CheckBox remember;

    int count = 0;
    String name;
    String message;
    boolean  isChecked;


    SharedPreferences sharedPreferences;


    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.editTextName);
        userMessage = findViewById(R.id.editTextMessage);
        Counter = findViewById(R.id.button);
        remember = findViewById(R.id.checkBox);

        Counter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                count = count + 1;
                Counter.setText(""+count);

            }
        });



        retrieveData();


        Log.d("Message", "First Activity onCreate");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message", "First Activity onDestroy");
    }

    @Override
    protected void onPause() {

        saveData();
        super.onPause();

        Log.d("Message", "First Activity onPause");
    }

    /*
    * saving data ot local storage
    * */

    public void saveData(){
        sharedPreferences =getSharedPreferences("saveData", Context.MODE_PRIVATE);
        name = userName.getText().toString();
        message = userMessage.getText().toString();
        if (remember.isChecked()){
            isChecked = true;
        }
        else{
            isChecked = false;
        }

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Key name",name);
        editor.putString("message",message);
        editor.putInt("key count", count);
        editor.putBoolean("key remember",isChecked);
        editor.commit();
        Toast.makeText(getApplicationContext(),"Your data is Saved",Toast.LENGTH_LONG).show();
    }
    /*
    * retrieving data from the memory
    * */

    /*
    *
    * we have to make sure that every keyword are matched otherwise we can't get the value
    *
    * */

    public void retrieveData(){
        sharedPreferences = getSharedPreferences("save data",MODE_PRIVATE);
        name = sharedPreferences.getString("Key name",null);
        message = sharedPreferences.getString("message", null);
        count = sharedPreferences.getInt("key count", 0);
        isChecked = sharedPreferences.getBoolean("key remember", false);


        userName.setText(name);
        userMessage.setText(message);
        Counter.setText(""+ count);

        if(isChecked){
            remember.setChecked(true);
        }
        else {
            remember.setChecked(false);
        }

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