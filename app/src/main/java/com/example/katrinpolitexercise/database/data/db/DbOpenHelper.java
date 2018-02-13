package com.example.katrinpolitexercise.database.data.db;

import android.content.Context;

import com.example.katrinpolitexercise.database.data.greenDAOclasses.DaoMaster;
import com.example.katrinpolitexercise.di.ApplicationContext;
import com.example.katrinpolitexercise.di.DatabaseInfo;

import javax.inject.Inject;

/**
 * Created by Катюша on 13.02.2018.
 */

public class DbOpenHelper extends DaoMaster.OpenHelper {
    @Inject
    public DbOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }
}
