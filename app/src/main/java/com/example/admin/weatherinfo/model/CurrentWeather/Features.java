
package com.example.admin.weatherinfo.model.CurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Features {

    @SerializedName("conditions")
    @Expose
    private Integer conditions;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Features() {
    }

    /**
     * 
     * @param conditions
     */
    public Features(Integer conditions) {
        super();
        this.conditions = conditions;
    }

    public Integer getConditions() {
        return conditions;
    }

    public void setConditions(Integer conditions) {
        this.conditions = conditions;
    }

}
