package com.potsane.weatherapp.entity.apiresponse;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PMohale on 2018/06/18.
 */

public class ApiResultObject {

    @SerializedName("query")
    private ApiResultQuery query;

    public ApiResultObject() {
    }

    public ApiResultObject(ApiResultQuery query) {
        this.query = query;
    }

    public ApiResultQuery getQuery() {
        return query;
    }

    public void setQuery(ApiResultQuery query) {
        this.query = query;
    }
}
