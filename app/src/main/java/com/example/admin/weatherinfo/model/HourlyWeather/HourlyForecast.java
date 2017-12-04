
package com.example.admin.weatherinfo.model.HourlyWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HourlyForecast {

    @SerializedName("FCTTIME")
    @Expose
    private FCTTIME fCTTIME;
    @SerializedName("temp")
    @Expose
    private Temp temp;
    @SerializedName("dewpoint")
    @Expose
    private Dewpoint dewpoint;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("fctcode")
    @Expose
    private String fctcode;
    @SerializedName("sky")
    @Expose
    private String sky;
    @SerializedName("wspd")
    @Expose
    private Wspd wspd;
    @SerializedName("wdir")
    @Expose
    private Wdir wdir;
    @SerializedName("wx")
    @Expose
    private String wx;
    @SerializedName("uvi")
    @Expose
    private String uvi;
    @SerializedName("humidity")
    @Expose
    private String humidity;
    @SerializedName("windchill")
    @Expose
    private Windchill windchill;
    @SerializedName("heatindex")
    @Expose
    private Heatindex heatindex;
    @SerializedName("feelslike")
    @Expose
    private Feelslike feelslike;
    @SerializedName("qpf")
    @Expose
    private Qpf qpf;
    @SerializedName("snow")
    @Expose
    private Snow snow;
    @SerializedName("pop")
    @Expose
    private String pop;
    @SerializedName("mslp")
    @Expose
    private Mslp mslp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HourlyForecast() {
    }

    /**
     * 
     * @param uvi
     * @param mslp
     * @param icon
     * @param heatindex
     * @param condition
     * @param iconUrl
     * @param wspd
     * @param pop
     * @param fctcode
     * @param feelslike
     * @param wdir
     * @param wx
     * @param qpf
     * @param humidity
     * @param sky
     * @param snow
     * @param dewpoint
     * @param temp
     * @param fCTTIME
     * @param windchill
     */
    public HourlyForecast(FCTTIME fCTTIME, Temp temp, Dewpoint dewpoint, String condition, String icon, String iconUrl, String fctcode, String sky, Wspd wspd, Wdir wdir, String wx, String uvi, String humidity, Windchill windchill, Heatindex heatindex, Feelslike feelslike, Qpf qpf, Snow snow, String pop, Mslp mslp) {
        super();
        this.fCTTIME = fCTTIME;
        this.temp = temp;
        this.dewpoint = dewpoint;
        this.condition = condition;
        this.icon = icon;
        this.iconUrl = iconUrl;
        this.fctcode = fctcode;
        this.sky = sky;
        this.wspd = wspd;
        this.wdir = wdir;
        this.wx = wx;
        this.uvi = uvi;
        this.humidity = humidity;
        this.windchill = windchill;
        this.heatindex = heatindex;
        this.feelslike = feelslike;
        this.qpf = qpf;
        this.snow = snow;
        this.pop = pop;
        this.mslp = mslp;
    }

    public FCTTIME getFCTTIME() {
        return fCTTIME;
    }

    public void setFCTTIME(FCTTIME fCTTIME) {
        this.fCTTIME = fCTTIME;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public Dewpoint getDewpoint() {
        return dewpoint;
    }

    public void setDewpoint(Dewpoint dewpoint) {
        this.dewpoint = dewpoint;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getFctcode() {
        return fctcode;
    }

    public void setFctcode(String fctcode) {
        this.fctcode = fctcode;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public Wspd getWspd() {
        return wspd;
    }

    public void setWspd(Wspd wspd) {
        this.wspd = wspd;
    }

    public Wdir getWdir() {
        return wdir;
    }

    public void setWdir(Wdir wdir) {
        this.wdir = wdir;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getUvi() {
        return uvi;
    }

    public void setUvi(String uvi) {
        this.uvi = uvi;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Windchill getWindchill() {
        return windchill;
    }

    public void setWindchill(Windchill windchill) {
        this.windchill = windchill;
    }

    public Heatindex getHeatindex() {
        return heatindex;
    }

    public void setHeatindex(Heatindex heatindex) {
        this.heatindex = heatindex;
    }

    public Feelslike getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Feelslike feelslike) {
        this.feelslike = feelslike;
    }

    public Qpf getQpf() {
        return qpf;
    }

    public void setQpf(Qpf qpf) {
        this.qpf = qpf;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public Mslp getMslp() {
        return mslp;
    }

    public void setMslp(Mslp mslp) {
        this.mslp = mslp;
    }

}
