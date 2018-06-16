package com.potsane.weatherapp.injection;

import com.potsane.weatherapp.WeatherApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by PMohale on 2018/06/16.
 */

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,
        WeatherAppModule.class,
        ActivityModule.class})
public interface WeatherAppComponent {

    void inject(WeatherApp weatherApp);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(WeatherApp weatherApp);

        WeatherAppComponent build();
    }
}
