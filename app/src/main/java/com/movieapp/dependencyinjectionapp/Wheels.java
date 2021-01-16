package com.movieapp.dependencyinjectionapp;

import com.movieapp.dependencyinjectionapp.wheelscontents.Rims;
import com.movieapp.dependencyinjectionapp.wheelscontents.Tirs;

import javax.inject.Inject;

public class Wheels {

    private Rims rims;
    private Tirs tirs;

    public Wheels(Rims rims, Tirs tirs) {
        /** lets suppose this class is read only and i need to inject
         him then i use it as module(@WheelModule) in the component class
         */
        this.rims = rims;
        this.tirs = tirs;
    }

    @Inject
    public Wheels() {
    }
}
