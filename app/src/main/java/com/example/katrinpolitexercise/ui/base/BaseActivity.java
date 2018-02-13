package com.example.katrinpolitexercise.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.katrinpolitexercise.di.component.ActivityComponent;

/**
 * Created by Катюша on 13.02.2018.
 */

public class BaseActivity extends AppCompatActivity implements MvpView {

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public void onError(String message) {

    }
}
