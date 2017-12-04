
package com.example.admin.weatherinfo.model.HourlyWeather;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HourlyWeatherResponse {

    @SerializedName("response")
    @Expose
    private Response response;
    @SerializedName("hourly_forecast")
    @Expose
    private List<HourlyForecast> hourlyForecast = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HourlyWeatherResponse() {
    }


    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public List<HourlyForecast> getHourlyForecast() {
        return hourlyForecast;
    }

    public void setHourlyForecast(List<HourlyForecast> hourlyForecast) {
        this.hourlyForecast = hourlyForecast;
    }
    @Override
    public String toString()
    {
        return "HourlyWeatherResponse{" +
                "response=" + response +
                ", hourlyForecast=" + hourlyForecast +
                '}';
    }

}
