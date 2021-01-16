package com.movieapp.dependencyinjectionapp.modules;

import com.movieapp.dependencyinjectionapp.Wheels;
import com.movieapp.dependencyinjectionapp.wheelscontents.Rims;
import com.movieapp.dependencyinjectionapp.wheelscontents.Tirs;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    /** we use module when i need class but i can't annotate it by inject as classes made by android
    the code run without static */
    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tirs provideTirs(){
        Tirs tirs = new Tirs();
        tirs.inflate();
        return tirs;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tirs tirs){
        return new Wheels(rims, tirs);
    }
}
