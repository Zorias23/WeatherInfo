
package com.example.admin.weatherinfo.model.CurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentObservation {

    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("display_location")
    @Expose
    private DisplayLocation displayLocation;
    @SerializedName("observation_location")
    @Expose
    private ObservationLocation observationLocation;
    @SerializedName("estimated")
    @Expose
    private Estimated estimated;
    @SerializedName("station_id")
    @Expose
    private String stationId;
    @SerializedName("observation_time")
    @Expose
    private String observationTime;
    @SerializedName("observation_time_rfc822")
    @Expose
    private String observationTimeRfc822;
    @SerializedName("observation_epoch")
    @Expose
    private String observationEpoch;
    @SerializedName("local_time_rfc822")
    @Expose
    private String localTimeRfc822;
    @SerializedName("local_epoch")
    @Expose
    private String localEpoch;
    @SerializedName("local_tz_short")
    @Expose
    private String localTzShort;
    @SerializedName("local_tz_long")
    @Expose
    private String localTzLong;
    @SerializedName("local_tz_offset")
    @Expose
    private String localTzOffset;
    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("temperature_string")
    @Expose
    private String temperatureString;
    @SerializedName("temp_f")
    @Expose
    private Double tempF;
    @SerializedName("temp_c")
    @Expose
    private Double tempC;
    @SerializedName("relative_humidity")
    @Expose
    private String relativeHumidity;
    @SerializedName("wind_string")
    @Expose
    private String windString;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("wind_degrees")
    @Expose
    private Integer windDegrees;
    @SerializedName("wind_mph")
    @Expose
    private Double windMph;
    @SerializedName("wind_gust_mph")
    @Expose
    private Double windGustMph;
    @SerializedName("wind_kph")
    @Expose
    private Double windKph;
    @SerializedName("wind_gust_kph")
    @Expose
    private Double windGustKph;
    @SerializedName("pressure_mb")
    @Expose
    private String pressureMb;
    @SerializedName("pressure_in")
    @Expose
    private String pressureIn;
    @SerializedName("pressure_trend")
    @Expose
    private String pressureTrend;
    @SerializedName("dewpoint_string")
    @Expose
    private String dewpointString;
    @SerializedName("dewpoint_f")
    @Expose
    private Integer dewpointF;
    @SerializedName("dewpoint_c")
    @Expose
    private Integer dewpointC;
    @SerializedName("heat_index_string")
    @Expose
    private String heatIndexString;
    @SerializedName("heat_index_f")
    @Expose
    private String heatIndexF;
    @SerializedName("heat_index_c")
    @Expose
    private String heatIndexC;
    @SerializedName("windchill_string")
    @Expose
    private String windchillString;
    @SerializedName("windchill_f")
    @Expose
    private String windchillF;
    @SerializedName("windchill_c")
    @Expose
    private String windchillC;
    @SerializedName("feelslike_string")
    @Expose
    private String feelslikeString;
    @SerializedName("feelslike_f")
    @Expose
    private String feelslikeF;
    @SerializedName("feelslike_c")
    @Expose
    private String feelslikeC;
    @SerializedName("visibility_mi")
    @Expose
    private String visibilityMi;
    @SerializedName("visibility_km")
    @Expose
    private String visibilityKm;
    @SerializedName("solarradiation")
    @Expose
    private String solarradiation;
    @SerializedName("UV")
    @Expose
    private String uV;
    @SerializedName("precip_1hr_string")
    @Expose
    private String precip1hrString;
    @SerializedName("precip_1hr_in")
    @Expose
    private String precip1hrIn;
    @SerializedName("precip_1hr_metric")
    @Expose
    private String precip1hrMetric;
    @SerializedName("precip_today_string")
    @Expose
    private String precipTodayString;
    @SerializedName("precip_today_in")
    @Expose
    private String precipTodayIn;
    @SerializedName("precip_today_metric")
    @Expose
    private String precipTodayMetric;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("forecast_url")
    @Expose
    private String forecastUrl;
    @SerializedName("history_url")
    @Expose
    private String historyUrl;
    @SerializedName("ob_url")
    @Expose
    private String obUrl;
    @SerializedName("nowcast")
    @Expose
    private String nowcast;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CurrentObservation() {
    }

    /**
     * 
     * @param feelslikeC
     * @param historyUrl
     * @param iconUrl
     * @param localTzOffset
     * @param precipTodayIn
     * @param stationId
     * @param precipTodayMetric
     * @param estimated
     * @param localTzLong
     * @param pressureTrend
     * @param visibilityKm
     * @param weather
     * @param dewpointC
     * @param pressureIn
     * @param dewpointF
     * @param windKph
     * @param displayLocation
     * @param image
     * @param solarradiation
     * @param windGustMph
     * @param windDegrees
     * @param localTimeRfc822
     * @param precip1hrMetric
     * @param heatIndexString
     * @param forecastUrl
     * @param windDir
     * @param feelslikeF
     * @param windString
     * @param observationEpoch
     * @param heatIndexF
     * @param localTzShort
     * @param heatIndexC
     * @param visibilityMi
     * @param localEpoch
     * @param observationLocation
     * @param precipTodayString
     * @param windGustKph
     * @param feelslikeString
     * @param tempC
     * @param observationTime
     * @param obUrl
     * @param icon
     * @param relativeHumidity
     * @param pressureMb
     * @param precip1hrString
     * @param temperatureString
     * @param dewpointString
     * @param windMph
     * @param nowcast
     * @param observationTimeRfc822
     * @param windchillString
     * @param precip1hrIn
     * @param uV
     * @param windchillF
     * @param windchillC
     * @param tempF
     */
    public CurrentObservation(Image image, DisplayLocation displayLocation, ObservationLocation observationLocation, Estimated estimated, String stationId, String observationTime, String observationTimeRfc822, String observationEpoch, String localTimeRfc822, String localEpoch, String localTzShort, String localTzLong, String localTzOffset, String weather, String temperatureString, Double tempF, Double tempC, String relativeHumidity, String windString, String windDir, Integer windDegrees, Double windMph, Double windGustMph, Double windKph, Double windGustKph, String pressureMb, String pressureIn, String pressureTrend, String dewpointString, Integer dewpointF, Integer dewpointC, String heatIndexString, String heatIndexF, String heatIndexC, String windchillString, String windchillF, String windchillC, String feelslikeString, String feelslikeF, String feelslikeC, String visibilityMi, String visibilityKm, String solarradiation, String uV, String precip1hrString, String precip1hrIn, String precip1hrMetric, String precipTodayString, String precipTodayIn, String precipTodayMetric, String icon, String iconUrl, String forecastUrl, String historyUrl, String obUrl, String nowcast) {
        super();
        this.image = image;
        this.displayLocation = displayLocation;
        this.observationLocation = observationLocation;
        this.estimated = estimated;
        this.stationId = stationId;
        this.observationTime = observationTime;
        this.observationTimeRfc822 = observationTimeRfc822;
        this.observationEpoch = observationEpoch;
        this.localTimeRfc822 = localTimeRfc822;
        this.localEpoch = localEpoch;
        this.localTzShort = localTzShort;
        this.localTzLong = localTzLong;
        this.localTzOffset = localTzOffset;
        this.weather = weather;
        this.temperatureString = temperatureString;
        this.tempF = tempF;
        this.tempC = tempC;
        this.relativeHumidity = relativeHumidity;
        this.windString = windString;
        this.windDir = windDir;
        this.windDegrees = windDegrees;
        this.windMph = windMph;
        this.windGustMph = windGustMph;
        this.windKph = windKph;
        this.windGustKph = windGustKph;
        this.pressureMb = pressureMb;
        this.pressureIn = pressureIn;
        this.pressureTrend = pressureTrend;
        this.dewpointString = dewpointString;
        this.dewpointF = dewpointF;
        this.dewpointC = dewpointC;
        this.heatIndexString = heatIndexString;
        this.heatIndexF = heatIndexF;
        this.heatIndexC = heatIndexC;
        this.windchillString = windchillString;
        this.windchillF = windchillF;
        this.windchillC = windchillC;
        this.feelslikeString = feelslikeString;
        this.feelslikeF = feelslikeF;
        this.feelslikeC = feelslikeC;
        this.visibilityMi = visibilityMi;
        this.visibilityKm = visibilityKm;
        this.solarradiation = solarradiation;
        this.uV = uV;
        this.precip1hrString = precip1hrString;
        this.precip1hrIn = precip1hrIn;
        this.precip1hrMetric = precip1hrMetric;
        this.precipTodayString = precipTodayString;
        this.precipTodayIn = precipTodayIn;
        this.precipTodayMetric = precipTodayMetric;
        this.icon = icon;
        this.iconUrl = iconUrl;
        this.forecastUrl = forecastUrl;
        this.historyUrl = historyUrl;
        this.obUrl = obUrl;
        this.nowcast = nowcast;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public DisplayLocation getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation(DisplayLocation displayLocation) {
        this.displayLocation = displayLocation;
    }

    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    public void setObservationLocation(ObservationLocation observationLocation) {
        this.observationLocation = observationLocation;
    }

    public Estimated getEstimated() {
        return estimated;
    }

    public void setEstimated(Estimated estimated) {
        this.estimated = estimated;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    public void setObservationTimeRfc822(String observationTimeRfc822) {
        this.observationTimeRfc822 = observationTimeRfc822;
    }

    public String getObservationEpoch() {
        return observationEpoch;
    }

    public void setObservationEpoch(String observationEpoch) {
        this.observationEpoch = observationEpoch;
    }

    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    public void setLocalTimeRfc822(String localTimeRfc822) {
        this.localTimeRfc822 = localTimeRfc822;
    }

    public String getLocalEpoch() {
        return localEpoch;
    }

    public void setLocalEpoch(String localEpoch) {
        this.localEpoch = localEpoch;
    }

    public String getLocalTzShort() {
        return localTzShort;
    }

    public void setLocalTzShort(String localTzShort) {
        this.localTzShort = localTzShort;
    }

    public String getLocalTzLong() {
        return localTzLong;
    }

    public void setLocalTzLong(String localTzLong) {
        this.localTzLong = localTzLong;
    }

    public String getLocalTzOffset() {
        return localTzOffset;
    }

    public void setLocalTzOffset(String localTzOffset) {
        this.localTzOffset = localTzOffset;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperatureString() {
        return temperatureString;
    }

    public void setTemperatureString(String temperatureString) {
        this.temperatureString = temperatureString;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getWindString() {
        return windString;
    }

    public void setWindString(String windString) {
        this.windString = windString;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(Integer windDegrees) {
        this.windDegrees = windDegrees;
    }

    public Double getWindMph() {
        return windMph;
    }

    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    public Double getWindGustMph() {
        return windGustMph;
    }

    public void setWindGustMph(Double windGustMph) {
        this.windGustMph = windGustMph;
    }

    public Double getWindKph() {
        return windKph;
    }

    public void setWindKph(Double windKph) {
        this.windKph = windKph;
    }

    public Double getWindGustKph() {
        return windGustKph;
    }

    public void setWindGustKph(Double windGustKph) {
        this.windGustKph = windGustKph;
    }

    public String getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
    }

    public String getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(String pressureIn) {
        this.pressureIn = pressureIn;
    }

    public String getPressureTrend() {
        return pressureTrend;
    }

    public void setPressureTrend(String pressureTrend) {
        this.pressureTrend = pressureTrend;
    }

    public String getDewpointString() {
        return dewpointString;
    }

    public void setDewpointString(String dewpointString) {
        this.dewpointString = dewpointString;
    }

    public Integer getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(Integer dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Integer getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(Integer dewpointC) {
        this.dewpointC = dewpointC;
    }

    public String getHeatIndexString() {
        return heatIndexString;
    }

    public void setHeatIndexString(String heatIndexString) {
        this.heatIndexString = heatIndexString;
    }

    public String getHeatIndexF() {
        return heatIndexF;
    }

    public void setHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    public String getHeatIndexC() {
        return heatIndexC;
    }

    public void setHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    public String getWindchillString() {
        return windchillString;
    }

    public void setWindchillString(String windchillString) {
        this.windchillString = windchillString;
    }

    public String getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(String windchillF) {
        this.windchillF = windchillF;
    }

    public String getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(String windchillC) {
        this.windchillC = windchillC;
    }

    public String getFeelslikeString() {
        return feelslikeString;
    }

    public void setFeelslikeString(String feelslikeString) {
        this.feelslikeString = feelslikeString;
    }

    public String getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(String feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public String getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(String feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public String getVisibilityMi() {
        return visibilityMi;
    }

    public void setVisibilityMi(String visibilityMi) {
        this.visibilityMi = visibilityMi;
    }

    public String getVisibilityKm() {
        return visibilityKm;
    }

    public void setVisibilityKm(String visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    public String getUV() {
        return uV;
    }

    public void setUV(String uV) {
        this.uV = uV;
    }

    public String getPrecip1hrString() {
        return precip1hrString;
    }

    public void setPrecip1hrString(String precip1hrString) {
        this.precip1hrString = precip1hrString;
    }

    public String getPrecip1hrIn() {
        return precip1hrIn;
    }

    public void setPrecip1hrIn(String precip1hrIn) {
        this.precip1hrIn = precip1hrIn;
    }

    public String getPrecip1hrMetric() {
        return precip1hrMetric;
    }

    public void setPrecip1hrMetric(String precip1hrMetric) {
        this.precip1hrMetric = precip1hrMetric;
    }

    public String getPrecipTodayString() {
        return precipTodayString;
    }

    public void setPrecipTodayString(String precipTodayString) {
        this.precipTodayString = precipTodayString;
    }

    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    public void setPrecipTodayIn(String precipTodayIn) {
        this.precipTodayIn = precipTodayIn;
    }

    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    public void setPrecipTodayMetric(String precipTodayMetric) {
        this.precipTodayMetric = precipTodayMetric;
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

    public String getForecastUrl() {
        return forecastUrl;
    }

    public void setForecastUrl(String forecastUrl) {
        this.forecastUrl = forecastUrl;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public void setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
    }

    public String getObUrl() {
        return obUrl;
    }

    public void setObUrl(String obUrl) {
        this.obUrl = obUrl;
    }

    public String getNowcast() {
        return nowcast;
    }

    public void setNowcast(String nowcast) {
        this.nowcast = nowcast;
    }

}
