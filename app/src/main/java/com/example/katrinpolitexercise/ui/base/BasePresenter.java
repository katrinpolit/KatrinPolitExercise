package com.example.katrinpolitexercise.ui.base;

import com.example.katrinpolitexercise.database.data.DataManager;

import javax.inject.Inject;

/**
 * Created by Катюша on 13.02.2018.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private final DataManager mDataManager;

    private V mMvpView;


    @Inject
    public BasePresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mMvpView = null;
    }

    public V getMvpView() {
        return mMvpView;
    }


    public DataManager getDataManager() {
        return mDataManager;
    }

}
