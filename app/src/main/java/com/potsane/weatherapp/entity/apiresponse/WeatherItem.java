package com.potsane.weatherapp.entity.apiresponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by PMohale on 2018/06/18.
 */

public class WeatherItem {

    @SerializedName("condition")
    private Condition condition;

    @SerializedName("forecast")
    private List<Forecast> forecast;

}
