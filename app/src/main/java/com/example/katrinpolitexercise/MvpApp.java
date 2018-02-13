package com.example.katrinpolitexercise;

import android.app.Application;

import com.example.katrinpolitexercise.database.data.DataManager;
import com.example.katrinpolitexercise.di.component.ApplicationComponent;

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

    }
}
