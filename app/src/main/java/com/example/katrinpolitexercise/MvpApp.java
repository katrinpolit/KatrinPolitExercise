package com.example.katrinpolitexercise;

import android.app.Application;

import com.example.katrinpolitexercise.database.data.DataManager;
import com.example.katrinpolitexercise.di.component.ApplicationComponent;
import com.example.katrinpolitexercise.di.component.DaggerApplicationComponent;
import com.example.katrinpolitexercise.di.modules.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by Катюша on 13.02.2018.
 */

public class MvpApp extends Application {

    @Inject
    DataManager mDataManager;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

mApplicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this)).build();
   mApplicationComponent.inject(this);
    }


    public ApplicationComponent getmApplicationComponent() {
        return mApplicationComponent;
    }

    /*public void setmApplicationComponent(ApplicationComponent mApplicationComponent) {
        this.mApplicationComponent = mApplicationComponent;
    }*/
}
