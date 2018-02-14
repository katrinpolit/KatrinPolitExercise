package com.example.katrinpolitexercise.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by Катюша on 13.02.2018.
 */

public interface MvpView {

    void onError(String message);

    void onError(@StringRes int resId);
}
