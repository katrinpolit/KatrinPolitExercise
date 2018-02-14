package com.example.katrinpolitexercise.ui.main;

import com.example.katrinpolitexercise.ui.base.MvpPresenter;

/**
 * Created by Катюша on 13.02.2018.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    void  onLogoutClicked(String email);
    void onMainViewCreated(String email);


}
