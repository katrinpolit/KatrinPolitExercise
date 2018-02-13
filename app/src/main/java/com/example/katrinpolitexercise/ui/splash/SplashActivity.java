package com.example.katrinpolitexercise.ui.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.katrinpolitexercise.R;

import butterknife.BindView;

public class SplashActivity extends AppCompatActivity {

@BindView(R.id.welcome)
    TextView welcomeText;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
