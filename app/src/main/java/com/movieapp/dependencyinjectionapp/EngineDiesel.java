package com.movieapp.dependencyinjectionapp;

import android.util.Log;

import javax.inject.Inject;

public class EngineDiesel implements Engine{

    private static final String TAG = "Car";

    @Inject
    public EngineDiesel() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: engine diesel started");

    }
}
