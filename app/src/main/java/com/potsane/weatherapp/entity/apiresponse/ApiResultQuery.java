package com.potsane.weatherapp.entity.apiresponse;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PMohale on 2018/06/18.
 */

public class ApiResultQuery {

    @SerializedName("results")
    private ApiResult result;

    public ApiResultQuery() {
    }

    public ApiResultQuery(ApiResult result) {
        this.result = result;
    }

    public ApiResult getResult() {
        return result;
    }

    public void setResult(ApiResult result) {
        this.result = result;
    }
}
