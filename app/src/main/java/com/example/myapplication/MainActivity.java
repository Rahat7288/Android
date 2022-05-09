package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    //TextView text2;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        text = findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                button.setBackgroundColor(Color.BLACK);
                text.setText("Rahat");

            }

        });

        //text = findViewById(R.id.text);
       // text2 = findViewById(R.id.text2);

       // text.setText("testing the text file");
        //text.setTextColor(Color.RED);

        //text2.setTextColor(Color.RED);
    }
}