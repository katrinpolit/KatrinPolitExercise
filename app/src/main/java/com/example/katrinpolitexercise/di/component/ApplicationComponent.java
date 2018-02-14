package com.example.katrinpolitexercise.di.component;

import android.app.Application;
import android.content.Context;

import com.example.katrinpolitexercise.MvpApp;
import com.example.katrinpolitexercise.database.data.DataManager;
import com.example.katrinpolitexercise.di.ApplicationContext;
import com.example.katrinpolitexercise.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Катюша on 13.02.2018.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MvpApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();

}
