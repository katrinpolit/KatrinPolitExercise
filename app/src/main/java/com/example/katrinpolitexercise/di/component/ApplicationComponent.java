package com.example.katrinpolitexercise.di.component;

import android.app.Application;
import android.content.Context;

import com.example.katrinpolitexercise.database.data.DataManager;
import com.example.katrinpolitexercise.di.ApplicationContext;
import com.example.katrinpolitexercise.di.Singleton;
import com.example.katrinpolitexercise.di.modules.ApplicationModule;

import dagger.Component;

/**
 * Created by Катюша on 13.02.2018.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {


    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();

}
