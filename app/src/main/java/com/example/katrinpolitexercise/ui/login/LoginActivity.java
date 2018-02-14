package com.example.katrinpolitexercise.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.katrinpolitexercise.R;
import com.example.katrinpolitexercise.ui.base.BaseActivity;
import com.example.katrinpolitexercise.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity implements LoginMvpView {


    @Inject
    LoginMvpPresenter<LoginMvpView> mPresenter;

    @BindView(R.id.et_email)
    EditText mEmailEditText;

    @BindView(R.id.et_password)
    EditText mPasswordEditText;
    //  private View mProgressView;
    //  private View mLoginFormView;


    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(LoginActivity.this);
    }

    @OnClick(R.id.btn_login)
    void onLoginClicked(View v) {
        mPresenter.onLoginBtnClicked(mEmailEditText.getText().toString(), mPasswordEditText.getText().toString());
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
        intent.putExtra("Email", mEmailEditText.getText().toString());
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }


}

