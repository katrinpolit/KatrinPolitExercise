package com.example.katrinpolitexercise;

import android.app.Application;

import com.example.katrinpolitexercise.database.data.greenDAOclasses.DaoMaster;
import com.example.katrinpolitexercise.database.data.greenDAOclasses.DaoSession;

import org.greenrobot.greendao.database.Database;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Катюша on 12.02.2018.
 */
@Module
public class App extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "users_db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    @Provides
    public DaoSession getDaoSession() {
        return daoSession;
    }
}
