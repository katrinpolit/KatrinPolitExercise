package com.example.katrinpolitexercise.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.katrinpolitexercise.R;
import com.example.katrinpolitexercise.ui.base.BaseActivity;
import com.example.katrinpolitexercise.ui.login.LoginActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainMvpView {

    String email;
    @Inject
    MainPresenter<MainMvpView> mPresenter;

    @BindView(R.id.tv_currEmail)
    TextView mCurrEmail;

    @BindView(R.id.tv_currPass)
    TextView mCurrPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(MainActivity.this);
     //   email = MainActivity.getStartIntent(MainActivity.this).getStringExtra("Email");
      Intent intent = getIntent();
       email = intent.getStringExtra("Email");
        mPresenter.onMainViewCreated(email);

    }

    @OnClick(R.id.btn_logout)
    void onLogoutClicked(View v) {
       /// email = MainActivity.getStartIntent(MainActivity.this).getStringExtra("Email");
        mPresenter.onLogoutClicked(email);
    }

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.getStringExtra("Email");
        return intent;
    }

    @Override
    public void openLoginActivity() {
       // Intent intent = LoginActivity.getStartIntent(MainActivity.this);
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void showUserEmail(String currEmail) {
        mCurrEmail.setText(currEmail);
    }

    @Override
    public void showUserPass(String currPass) {
        mCurrPass.setText(currPass);
    }
}
