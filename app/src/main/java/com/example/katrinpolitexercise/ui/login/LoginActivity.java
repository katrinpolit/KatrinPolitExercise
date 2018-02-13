package com.example.katrinpolitexercise.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.example.katrinpolitexercise.R;
import com.example.katrinpolitexercise.ui.base.BaseActivity;
import com.example.katrinpolitexercise.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity implements LoginMvpView {


    @Inject
    LoginMvpPresenter<LoginMvpView> mPresenter;

    @BindView(R.id.email)
     AutoCompleteTextView mEmailView;

    @BindView(R.id.password)
     EditText mPasswordView;
    //  private View mProgressView;
    //  private View mLoginFormView;


    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mPresenter.onAttach(LoginActivity.this);
    }

    @OnClick
    void onLoginClicked(View v) {
        mPresenter.onLoginBtnClicked(mEmailView.getText().toString(), mPasswordView.getText().toString());
    }


  /*  public LoginData getLoginData(){
        LoginData loginData = new LoginData();
        loginData.setEmail(mEmailView.getText().toString());
        loginData.setPass(mPasswordView.getText().toString());
        return loginData;
    }*/

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(LoginActivity.this);
        intent.putExtra("Email", mEmailView.getText().toString());
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }
}

