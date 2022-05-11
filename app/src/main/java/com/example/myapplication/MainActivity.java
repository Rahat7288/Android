package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   /* TextView text;
    TextView text2;

    Button button;
    EditText name;
    String userName;
    ImageView image;
    CheckBox male;
    CheckBox female;
    ToggleButton  togglebutton;

    ListView listView;
    String countries[];
    ArrayAdapter<String> adapter;*/

    private RecyclerView recyclerView;

    private recyclerAdapter adapter;

    private ArrayList<String> countryNameList = new ArrayList<String>();
    private ArrayList<String>detaisList = new ArrayList<String>();
    private ArrayList<Integer>imageList = new ArrayList<Integer>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryNameList.add("Bangladesh");
        countryNameList.add("Germany");
        countryNameList.add("Canada");

        detaisList.add("this is bangladesh");
        detaisList.add("this is Germany");
        detaisList.add("this is Canada");

        imageList.add(R.drawable.bd);
        imageList.add(R.drawable.germany);
        imageList.add(R.drawable.canada);


        adapter = new recyclerAdapter(countryNameList,detaisList,imageList,MainActivity.this);
        recyclerView.setAdapter(adapter);



























        
       /* listView = findViewById(R.id.list);
        countries = getResources().getStringArray(R.array.Countries);


        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countries);

        listView.setAdapter(adapter);*/

         
































      /*  name = findViewById(R.id.name);
        button = findViewById(R.id.button);
        text = findViewById(R.id.textname);

        image = findViewById(R.id.imageView);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        togglebutton = findViewById(R.id.toggleButton);

        togglebutton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    image.setVisibility(View.INVISIBLE);
                    text.setText("Image is hidden");
                }
                else {
                    image.setVisibility(View.VISIBLE);
                    text.setText("iamge is showed");
                }
            }
        });*/





        /*male.setOnClickListener(new View.OnClickListener() {

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
        });*/
    }
}