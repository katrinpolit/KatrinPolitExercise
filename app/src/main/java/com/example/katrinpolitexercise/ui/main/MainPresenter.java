package com.example.katrinpolitexercise.ui.main;

import com.example.katrinpolitexercise.database.data.DataManager;
import com.example.katrinpolitexercise.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by Катюша on 13.02.2018.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {


    @Inject
    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }




    @Override
    public void onLogoutClicked(String email) {
        getDataManager().deleteUser(email);
        getMvpView().openLoginActivity();
    }

    @Override
    public void showCurrEmail(String email) {

        final String currUserEmail = getDataManager().getUsers(email).getEmail();
        if (currUserEmail!= null && !currUserEmail.isEmpty()){
            getMvpView().showUserEmail(currUserEmail);
        }

    }

    @Override
    public void showCurrPass(String email) {
        final String currPass = getDataManager().getUsers(email).getPass();
        if(currPass!=null && !currPass.isEmpty()){
            getMvpView().showUserPass(currPass);
        }
    }


}
