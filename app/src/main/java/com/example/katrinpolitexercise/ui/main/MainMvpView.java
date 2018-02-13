package com.example.katrinpolitexercise.ui.main;

import com.example.katrinpolitexercise.ui.base.MvpView;

/**
 * Created by Катюша on 13.02.2018.
 */

public interface MainMvpView extends MvpView {

    void openLoginActivity();
    void showUserEmail(String currEmail);
    void showUserPass(String currPass);
}
