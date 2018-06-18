package com.potsane.weatherapp.entity.apiresponse;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PMohale on 2018/06/18.
 */

public class ApiResult {

    @SerializedName("channel")
    private Channel channel;

    public ApiResult() {
    }

    public ApiResult(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
