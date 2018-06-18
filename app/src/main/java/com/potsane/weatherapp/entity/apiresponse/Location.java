package com.potsane.weatherapp.entity.apiresponse;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PMohale on 2018/06/18.
 */

public class Location {

    @SerializedName("city")
    private String city;

    @SerializedName("country")
    private String country;

    @SerializedName("region")
    private String region;

    public Location() {
    }

    public Location(String city, String country, String region) {
        this.city = city;
        this.country = country;
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
