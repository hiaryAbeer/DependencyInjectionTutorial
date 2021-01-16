package com.movieapp.dependencyinjectionapp;

import android.util.Log;

import javax.inject.Inject;

public class EnginePetrol implements Engine {

    private static final String TAG = "Car";

    @Inject
    public EnginePetrol() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: engine petrol started");

    }
}
