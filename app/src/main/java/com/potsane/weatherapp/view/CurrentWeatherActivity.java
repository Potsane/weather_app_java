package com.potsane.weatherapp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.potsane.weatherapp.R;

import dagger.android.AndroidInjection;

public class CurrentWeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }
}
