
package com.example.admin.weatherinfo.model.HourlyWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Features {

    @SerializedName("hourly10day")
    @Expose
    private Integer hourly10day;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Features() {
    }

    /**
     * 
     * @param hourly10day
     */
    public Features(Integer hourly10day) {
        super();
        this.hourly10day = hourly10day;
    }

    public Integer getHourly10day() {
        return hourly10day;
    }

    public void setHourly10day(Integer hourly10day) {
        this.hourly10day = hourly10day;
    }

}
