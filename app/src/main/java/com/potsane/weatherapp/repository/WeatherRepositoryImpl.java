package com.potsane.weatherapp.repository;

import com.potsane.weatherapp.entity.apiresponse.ApiResultObject;

import retrofit2.Call;

/**
 * Created by PMohale on 2018/06/29.
 */

public class WeatherRepositoryImpl implements WeatherRepository {

    @Override
    public Call<ApiResultObject> getCurrentWeather() {
        return null;
    }
}
