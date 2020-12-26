package com.example.monidome1.Activity;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

public class MyAppcation extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(this);
    }
    public static Context getContext(){
        return context;
    }
}
