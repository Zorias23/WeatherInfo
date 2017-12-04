
package com.example.admin.weatherinfo.model.HourlyWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wdir {

    @SerializedName("dir")
    @Expose
    private String dir;
    @SerializedName("degrees")
    @Expose
    private String degrees;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wdir() {
    }

    /**
     * 
     * @param dir
     * @param degrees
     */
    public Wdir(String dir, String degrees) {
        super();
        this.dir = dir;
        this.degrees = degrees;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getDegrees() {
        return degrees;
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

}
