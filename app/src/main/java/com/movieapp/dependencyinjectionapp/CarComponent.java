package com.movieapp.dependencyinjectionapp;

import com.movieapp.dependencyinjectionapp.modules.EnginePetrolModule;
import com.movieapp.dependencyinjectionapp.modules.WheelsModule;

import dagger.Component;

@Component(modules = {EnginePetrolModule.class, WheelsModule.class})//@Component(modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
