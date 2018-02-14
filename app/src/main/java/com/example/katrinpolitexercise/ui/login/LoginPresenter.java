package com.example.katrinpolitexercise.ui.login;

import com.example.katrinpolitexercise.R;
import com.example.katrinpolitexercise.database.data.DataManager;
import com.example.katrinpolitexercise.database.data.greenDAOclasses.LoginData;
import com.example.katrinpolitexercise.ui.base.BasePresenter;
import com.example.katrinpolitexercise.utils.CommonUtils;

import javax.inject.Inject;

/**
 * Created by Катюша on 13.02.2018.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V>
        implements LoginMvpPresenter<V> {


    @Inject
    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }



    @Override
    public void onLoginBtnClicked(String email, String pass) {
       if(email == null || email.isEmpty()){
           getMvpView().onError(R.string.empty_email);
           return;
       }
        if (!CommonUtils.isEmailValid(email)) {
            getMvpView().onError(R.string.invalid_email);
            return;
        }
        if (pass == null || pass.isEmpty()) {
            getMvpView().onError(R.string.empty_password);
            return;
        }


        getDataManager().insertUser(new LoginData(email, pass));
       getMvpView().openMainActivity();
    }
}
