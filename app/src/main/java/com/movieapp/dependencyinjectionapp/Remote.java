package com.movieapp.dependencyinjectionapp;

import android.util.Log;

import javax.inject.Inject;

class Remote {

    private static final String TAG = "Car";

     @Inject
     public Remote() {
     }

     public void setListener(Car car){
         Log.d(TAG, "setListener: remote connected");// 2

     }
 }
