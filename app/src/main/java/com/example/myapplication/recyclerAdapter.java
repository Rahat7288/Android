package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.CountryViewHolder> {

    private ArrayList<String> countryNameList;
    private ArrayList<String>detaisList;
    private ArrayList<Integer>imageList;

    private Context context;

    public recyclerAdapter(ArrayList<String> countryNameList, ArrayList<String> detaisList, ArrayList<Integer> imageList, Context context) {
        this.countryNameList = countryNameList;
        this.detaisList = detaisList;
        this.imageList = imageList;
        this.context = context;
    }


    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new CountryViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        holder.textViewCountryName.setText(countryNameList.get(position));
        holder.textViewDetaislist.setText(detaisList.get(position));
        holder.imageView.setImageResource(imageList.get(position));

    }


    @Override
    public int getItemCount() {

        return countryNameList.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewCountryName, textViewDetaislist;
        private ImageView imageView;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewCountryName = itemView.findViewById(R.id.countryName);
            textViewDetaislist = itemView.findViewById(R.id.textViewDetails);

            imageView = itemView.findViewById(R.id.profile_image);
        }
    }
}
