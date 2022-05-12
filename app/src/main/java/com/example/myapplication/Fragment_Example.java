package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Example extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.i("fragment","onCreateView");
        return inflater.inflate(R.layout.fragment_new,container,false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("fragment","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fragment","onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("fragment","onActivityCreated");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("fragment","onStop");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("fragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("fragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("fragment","onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fragment","onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("fragment","onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("fragment","onDetach");
    }
}
