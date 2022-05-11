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
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    GridView gridView;

    ArrayList<String> text = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //grideView

        gridView = findViewById(R.id.gridView);

        fillArray();





    }

    public void fillArray(){
        text.add("bird");
        text.add("cat");
        text.add("chicken");
        text.add("dog");
        text.add("fish");
        text.add("monky");
        text.add("rabbit");
        text.add("sheep");
        text.add("lion");

        image.add(R.drawable.bird);
        image.add(R.drawable.cat);
        image.add(R.drawable.chicken);
        image.add(R.drawable.dog);
        image.add(R.drawable.fish);
        image.add(R.drawable.monky);
        image.add(R.drawable.rabbit);
        image.add(R.drawable.sheep);
        image.add(R.drawable.lion);
    }
}