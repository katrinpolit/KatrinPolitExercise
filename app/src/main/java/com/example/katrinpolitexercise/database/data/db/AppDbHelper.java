package com.example.katrinpolitexercise.database.data.db;

import com.example.katrinpolitexercise.database.data.greenDAOclasses.DaoMaster;
import com.example.katrinpolitexercise.database.data.greenDAOclasses.DaoSession;
import com.example.katrinpolitexercise.database.data.greenDAOclasses.LoginData;

import javax.inject.Inject;

/**
 * Created by Катюша on 13.02.2018.
 */
@javax.inject.Singleton
public class AppDbHelper implements DbHelper {

   private final DaoSession mDaoSession;



   @Inject
   public AppDbHelper(DbOpenHelper dbOpenHelper){
       mDaoSession = new DaoMaster(dbOpenHelper.getWritableDb()).newSession();
   }

    @Override
    public Long insertUser(LoginData loginData) {
        return mDaoSession.getLoginDataDao().insert(loginData);
    }

    @Override
    public LoginData getUsers(String email) {
       return mDaoSession.getLoginDataDao().load(email);
    }

    @Override
    public void deleteUser(String email) {
        mDaoSession.getLoginDataDao().deleteByKey(email);
    }


}
