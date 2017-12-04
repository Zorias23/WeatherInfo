
package com.example.admin.weatherinfo.model.CurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentWeatherResponse {

    @SerializedName("response")
    @Expose
    private Response response;
    @SerializedName("current_observation")
    @Expose
    private CurrentObservation currentObservation;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CurrentWeatherResponse() {
    }

    /**
     * 
     * @param currentObservation
     * @param response
     */
    public CurrentWeatherResponse(Response response, CurrentObservation currentObservation) {
        super();
        this.response = response;
        this.currentObservation = currentObservation;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    public void setCurrentObservation(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }

}
