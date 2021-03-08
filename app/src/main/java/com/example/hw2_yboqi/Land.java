package com.example.hw2_yboqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;

public class Land extends AppCompatActivity {
    mainFragment mainFragment;
    LapFragment LapFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);


        //Check if we are at the land mode
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }
        mainFragment= (mainFragment) getSupportFragmentManager().findFragmentById(R.id.mainfrag);
        LapFragment= (LapFragment) getSupportFragmentManager().findFragmentById(R.id.lapfrag);


    }
}