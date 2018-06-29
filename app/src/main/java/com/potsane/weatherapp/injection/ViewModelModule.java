package com.potsane.weatherapp.injection;

import android.arch.lifecycle.ViewModel;

import com.potsane.weatherapp.view.CurrentWeatherViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by PMohale on 2018/06/16.
 */

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CurrentWeatherViewModel.class)
    abstract ViewModel bindCurrentWeatherViewModel(CurrentWeatherViewModel currentWeatherViewModel);
}
