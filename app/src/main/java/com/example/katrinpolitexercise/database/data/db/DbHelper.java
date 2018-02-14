package com.example.katrinpolitexercise.database.data.db;

import com.example.katrinpolitexercise.database.data.greenDAOclasses.LoginData;

/**
 * Created by Катюша on 12.02.2018.
 */

public interface DbHelper {
    Long insertUser(final LoginData loginData);
    LoginData getUsers(String email);
    void deleteUser(String email);

}
