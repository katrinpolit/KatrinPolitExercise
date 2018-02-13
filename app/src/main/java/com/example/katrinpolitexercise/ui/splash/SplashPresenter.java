package com.example.katrinpolitexercise.ui.splash;

import com.example.katrinpolitexercise.database.data.DataManager;
import com.example.katrinpolitexercise.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by Катюша on 13.02.2018.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V>
        implements SplashMvpPresenter<V>{

    @Inject
    public SplashPresenter(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);

    }
}
