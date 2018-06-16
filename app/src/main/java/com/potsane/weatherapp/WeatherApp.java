package com.potsane.weatherapp;

import android.app.Activity;
import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;
import com.potsane.weatherapp.injection.AppInjector;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import timber.log.Timber;

/**
 * Created by PMohale on 2018/06/16.
 */

public class WeatherApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidThreeTen.init(this);
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
        AppInjector.init(this);

    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}

