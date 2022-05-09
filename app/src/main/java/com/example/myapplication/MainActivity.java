package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    //TextView text2;

    Button button;
    EditText name;
    String userName;
    ImageView image;
    CheckBox male;
    CheckBox female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        button = findViewById(R.id.button);
        text = findViewById(R.id.textname);

        image = findViewById(R.id.imageView);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        male.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(male.isChecked()){
                    text.setText("male");
                    female.setChecked(false);
                }
                else {
                    text.setText("What is your gender");
                }
            }
        });

        female.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(female.isChecked()){
                    text.setText("female");
                    male.setChecked(false);
                }
                else {
                    text.setText("What is your gender");
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.a);

            }
        });
    }
}