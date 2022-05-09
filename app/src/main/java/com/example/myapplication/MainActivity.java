package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    //TextView text2;

    Button button;
    EditText name;

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        button = findViewById(R.id.button);
        text = findViewById(R.id.textname);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                userName = name.getText().toString();
                text.setText(userName);

            }
        });
    }
}