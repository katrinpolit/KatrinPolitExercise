package com.example.katrinpolitexercise.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.katrinpolitexercise.MvpApp;
import com.example.katrinpolitexercise.R;
import com.example.katrinpolitexercise.di.component.ActivityComponent;
import com.example.katrinpolitexercise.di.component.DaggerActivityComponent;
import com.example.katrinpolitexercise.di.modules.ActivityModule;

import butterknife.Unbinder;

/**
 * Created by Катюша on 13.02.2018.
 */

public class BaseActivity extends AppCompatActivity implements MvpView {

    private ActivityComponent mActivityComponent;
    private Unbinder mUnBinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

mActivityComponent= DaggerActivityComponent.builder()
        .activityModule(new ActivityModule(this))
        .applicationComponent(((MvpApp) getApplication()).getmApplicationComponent())
        .build();

    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }


    public void setUnBinder(Unbinder unBinder) {
        mUnBinder = unBinder;
    }

    @Override
    protected void onDestroy() {

        if (mUnBinder != null) {
            mUnBinder.unbind();
        }
        super.onDestroy();
    }

    @Override
    public void onError(String message) {
        if (message != null) {
            showSnackBar(message);
        } else {
            showSnackBar(getString(R.string.some_error));
        }
    }

    @Override
    public void onError(@StringRes int resId) {
        onError(getString(resId));
    }

    private void showSnackBar(String message) {
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                message, Snackbar.LENGTH_SHORT);
        View sbView = snackbar.getView();
        TextView textView = (TextView) sbView
                .findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(ContextCompat.getColor(this, R.color.white));
        snackbar.show();
    }
}
