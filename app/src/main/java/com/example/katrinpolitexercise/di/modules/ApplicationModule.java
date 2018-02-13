package com.example.katrinpolitexercise.di.modules;

import android.app.Application;
import android.content.Context;

import com.example.katrinpolitexercise.database.data.AppDataManager;
import com.example.katrinpolitexercise.database.data.DataManager;
import com.example.katrinpolitexercise.database.data.db.AppDbHelper;
import com.example.katrinpolitexercise.database.data.db.DbHelper;
import com.example.katrinpolitexercise.di.ApplicationContext;
import com.example.katrinpolitexercise.di.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Катюша on 13.02.2018.
 */
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

@Provides
@ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager){
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper){
        return appDbHelper;
    }



}
