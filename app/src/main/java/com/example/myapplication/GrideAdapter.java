package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class GrideAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> text = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();

    public GrideAdapter(Context context, ArrayList<String> text, ArrayList<Integer> image) {
        this.context = context;
        this.text = text;
        this.image = image;
    }

    @Override
    public int getCount() {
        return text.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        @SuppressLint("ViewHolder")View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grideview_layout,parent,false);
        return null;
    }
}
