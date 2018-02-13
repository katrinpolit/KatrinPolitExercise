package com.example.katrinpolitexercise.ui.base;

/**
 * Created by Катюша on 13.02.2018.
 */

public interface MvpPresenter<V extends MvpView>{

    void onAttach(V mvpView);

    void onDetach();
}
