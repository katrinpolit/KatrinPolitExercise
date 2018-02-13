package com.example.katrinpolitexercise.database.data;

import android.content.Context;

import com.example.katrinpolitexercise.database.data.db.DbHelper;
import com.example.katrinpolitexercise.database.data.greenDAOclasses.LoginData;
import com.example.katrinpolitexercise.di.ApplicationContext;
import com.example.katrinpolitexercise.di.Singleton;

import javax.inject.Inject;

/**
 * Created by Катюша on 13.02.2018.
 */
@Singleton
public class AppDataManager implements DataManager {

    private final Context mContext;
    private final DbHelper mDbHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context, DbHelper dbHelper){
        mContext = context;
        mDbHelper = dbHelper;
    }
    @Override
    public Long insertUser(LoginData loginData) {
        return mDbHelper.insertUser(loginData);
    }

    @Override
    public LoginData getUsers(String email) {
        return mDbHelper.getUsers(email);
    }

    @Override
    public void deleteUser(String email) {
        mDbHelper.deleteUser(email);
    }
}
