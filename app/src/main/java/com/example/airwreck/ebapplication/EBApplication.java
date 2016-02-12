package com.example.airwreck.ebapplication;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import java.util.HashMap;

/**
 * Created by airwreck on 2/11/16.
 */



// Singleton:

public class EBApplication extends Application {

    private static EBApplication instance;
    public HashMap<String, String> hashMap = new HashMap<String, String>();

    public EBApplication() {
        if (instance == null) {
            instance = this;
        } else {
            Log.e("ERROR", "only one instance allowed");
        }
    }

    // gives access to instance without crewating a new one
    public static EBApplication getInstance() {
        return instance;
    }


}
