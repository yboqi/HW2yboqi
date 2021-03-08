package com.example.hw2_yboqi;

import android.content.Context;

public class Clock implements Runnable {
    public static final long MILLIS_TO_MINUTES = 60000;
    public static final long MILLIS_TO_HOURS = 3600000;
    private Context time;
    private long startTime;
    private boolean isRunning;
    public Clock(Context context){
        time = context;
    }

    public void start(){
        startTime = System.currentTimeMillis();
        isRunning = true;
    }

    public void stop(){
        isRunning = false;
    }
    @Override
    public void run() {
        while(isRunning){
            long since = System.currentTimeMillis() - startTime;
            int seconds = (int) ((since/1000) %60);
            int minutes = (int) (((since/MILLIS_TO_MINUTES))%60);
            int hours = (int) ((since/ MILLIS_TO_HOURS)%24);
            ((MainActivity)time).updateText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
        }
    }
}
