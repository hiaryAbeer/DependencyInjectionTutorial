package com.movieapp.dependencyinjectionapp.modules;

import com.movieapp.dependencyinjectionapp.Engine;
import com.movieapp.dependencyinjectionapp.EngineDiesel;

import dagger.Module;
import dagger.Provides;

@Module
public class EngineDieselModule {

    @Provides
    Engine provideEngine(EngineDiesel diesel){
        return diesel;
    }
}
