package com.movieapp.dependencyinjectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.movieapp.dependencyinjectionapp.enginecontents.Block;
import com.movieapp.dependencyinjectionapp.enginecontents.Cylinders;
import com.movieapp.dependencyinjectionapp.enginecontents.SparkPlugs;
import com.movieapp.dependencyinjectionapp.wheelscontents.Rims;
import com.movieapp.dependencyinjectionapp.wheelscontents.Tirs;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //    private Engine engine;
//    private Wheels wheels;
//    private Block block;
//    private Cylinders cylinders;
//    private SparkPlugs sparkPlugs;
//    private Rims rims;
//    private Tirs tirs;
    @Inject
    Car car;
    private CarComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        block = new Block();
//        cylinders = new Cylinders();
//        sparkPlugs = new SparkPlugs();
//        rims = new Rims();
//        tirs = new Tirs();

//        engine = new Engine(block, cylinders, sparkPlugs);
//        wheels = new Wheels(rims, tirs);

//        Car car = new Car(engine, wheels);

//        component = DaggerCarComponent.create();
//        car = component.getCar();
//        car.drive();

        component = DaggerCarComponent.create();
        component.inject(this);
        car.drive();// 3
    }
}