package com.example.katrinpolitexercise.di.modules;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.katrinpolitexercise.di.ActivityContext;
import com.example.katrinpolitexercise.di.PerActivity;
import com.example.katrinpolitexercise.ui.login.LoginMvpPresenter;
import com.example.katrinpolitexercise.ui.login.LoginMvpView;
import com.example.katrinpolitexercise.ui.login.LoginPresenter;
import com.example.katrinpolitexercise.ui.main.MainMvpPresenter;
import com.example.katrinpolitexercise.ui.main.MainMvpView;
import com.example.katrinpolitexercise.ui.main.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Катюша on 13.02.2018.
 */


@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mActivity;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }





}
