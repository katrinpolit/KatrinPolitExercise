package com.example.katrinpolitexercise.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.katrinpolitexercise.R;
import com.example.katrinpolitexercise.ui.base.BaseActivity;
import com.example.katrinpolitexercise.ui.login.LoginActivity;

import butterknife.BindView;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    private static int SPLASH_TIME_OUT = 3000;

@BindView(R.id.welcome)
    TextView welcomeText;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
openLoginActivity();
            }
        }, SPLASH_TIME_OUT);
    }


    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }
}
