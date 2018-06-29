package com.potsane.weatherapp.injection;

import com.potsane.weatherapp.repository.WeatherRepository;
import com.potsane.weatherapp.repository.WeatherRepositoryImpl;

import dagger.Module;
import dagger.android.AndroidInjectionModule;

/**
 * Created by PMohale on 2018/06/16.
 */

@Module(includes = {AndroidInjectionModule.class, ViewModelModule.class})
public class WeatherAppModule {

    WeatherRepository providesWeatherRepository() {
        return new WeatherRepositoryImpl();
    }
}
