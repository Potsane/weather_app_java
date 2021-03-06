package com.potsane.weatherapp.injection;

import com.potsane.weatherapp.view.CurrentWeatherActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by PMohale on 2018/06/16.
 */

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract CurrentWeatherActivity bindCurrentWeatherActivity();
}
