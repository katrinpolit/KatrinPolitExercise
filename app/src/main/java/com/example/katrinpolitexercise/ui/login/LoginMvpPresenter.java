package com.example.katrinpolitexercise.ui.login;

import com.example.katrinpolitexercise.di.PerActivity;
import com.example.katrinpolitexercise.ui.base.MvpPresenter;

/**
 * Created by Катюша on 13.02.2018.
 */
@PerActivity
public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void onLoginBtnClicked(String email, String pass);

}
