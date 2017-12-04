
package com.example.admin.weatherinfo.model.CurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ObservationLocation {

    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_iso3166")
    @Expose
    private String countryIso3166;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("elevation")
    @Expose
    private String elevation;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObservationLocation() {
    }

    /**
     * 
     * @param countryIso3166
     * @param full
     * @param elevation
     * @param state
     * @param longitude
     * @param latitude
     * @param country
     * @param city
     */
    public ObservationLocation(String full, String city, String state, String country, String countryIso3166, String latitude, String longitude, String elevation) {
        super();
        this.full = full;
        this.city = city;
        this.state = state;
        this.country = country;
        this.countryIso3166 = countryIso3166;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryIso3166() {
        return countryIso3166;
    }

    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

}
