package com.example.hw2_yboqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements mainFragment.OnFragmentInteractionListener {

    mainFragment mainFragment;
    LapFragment LapFragment;
    private Clock clock;
    private Context mContext;
    private Thread mThread;
    MyAsyncTask myAsyncTask;
    //private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainFragment= (mainFragment) getSupportFragmentManager().findFragmentById(R.id.mainfrag);
        LapFragment= (LapFragment) getSupportFragmentManager().findFragmentById(R.id.lapfrag);
    }

    public void updateText(final String time) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mainFragment.timetext.setText(time);
            }
        });
    }

    @Override
    public void onButtonClicked(int infoID) {
        if (infoID == 0){
            if(LapFragment!= null && LapFragment.isInLayout() ){

            }
            else{
                Intent intent = new Intent(this, Lap.class);
                startActivity(intent);
            }
        }
        if (infoID == 1){
            if(clock == null) {
                clock = new Clock(mContext);
                mThread = new Thread(clock);
                mThread.start();
                mThread.start();

            }
        }

    }

    //public void openlap() {

    //}

    private class MyAsyncTask extends AsyncTask<Integer, Integer, Void> {

        @Override
        protected Void doInBackground(Integer... integers) {
            return null;
        }
    }
}