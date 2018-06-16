package com.potsane.weatherapp.injection;

import dagger.Module;
import dagger.android.AndroidInjectionModule;

/**
 * Created by PMohale on 2018/06/16.
 */

@Module(includes = {AndroidInjectionModule.class, ViewModelModule.class})
public class WeatherAppModule {
}
