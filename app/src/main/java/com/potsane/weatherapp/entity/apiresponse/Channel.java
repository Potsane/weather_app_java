package com.potsane.weatherapp.entity.apiresponse;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PMohale on 2018/06/18.
 */

public class Channel {

    @SerializedName("location")
    private Location location;

    @SerializedName("atmosphere")
    private Atmosphere atmosphere;

    @SerializedName("item")
    private WeatherItem item;

    public Channel() {
    }

    public Channel(Location location, Atmosphere atmosphere, WeatherItem item) {
        this.location = location;
        this.atmosphere = atmosphere;
        this.item = item;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public WeatherItem getItem() {
        return item;
    }

    public void setItem(WeatherItem item) {
        this.item = item;
    }
}
