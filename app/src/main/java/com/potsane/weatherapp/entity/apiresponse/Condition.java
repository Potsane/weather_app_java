package com.potsane.weatherapp.entity.apiresponse;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PMohale on 2018/06/18.
 */

public class Condition {

    @SerializedName("code")
    private String code;

    @SerializedName("date")
    private String date;

    @SerializedName("temp")
    private String temp;

    @SerializedName("text")
    private String text;

    public Condition() {
    }

    public Condition(String code, String date, String temp, String text) {
        this.code = code;
        this.date = date;
        this.temp = temp;
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
