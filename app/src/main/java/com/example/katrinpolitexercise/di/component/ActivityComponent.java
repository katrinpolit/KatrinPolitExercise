package com.example.katrinpolitexercise.di.component;

import com.example.katrinpolitexercise.di.PerActivity;
import com.example.katrinpolitexercise.di.modules.ActivityModule;
import com.example.katrinpolitexercise.ui.login.LoginActivity;
import com.example.katrinpolitexercise.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by Катюша on 13.02.2018.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
    void inject(LoginActivity activity);
}
