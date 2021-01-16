package com.movieapp.dependencyinjectionapp;

import com.movieapp.dependencyinjectionapp.enginecontents.Block;
import com.movieapp.dependencyinjectionapp.enginecontents.Cylinders;
import com.movieapp.dependencyinjectionapp.enginecontents.SparkPlugs;

import javax.inject.Inject;

public interface Engine {

//    private Block block;
//    private Cylinders cylinders;
//    private SparkPlugs sparkPlugs;

//    public Engine(Block block, Cylinders cylinders, SparkPlugs sparkPlugs) {
//        this.block = block;
//        this.cylinders = cylinders;
//        this.sparkPlugs = sparkPlugs;
//    }


//    @Inject
//    public Engine() {
//    }

    void start();

}
