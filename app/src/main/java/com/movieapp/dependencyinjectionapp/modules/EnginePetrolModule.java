package com.movieapp.dependencyinjectionapp.modules;

import com.movieapp.dependencyinjectionapp.Engine;
import com.movieapp.dependencyinjectionapp.EnginePetrol;

import dagger.Module;
import dagger.Provides;

@Module
public class EnginePetrolModule {

    @Provides
    Engine provideEngine(EnginePetrol petrol){
        return petrol;
    }
}
