package com.example.admin.weatherinfo.view.main;

/**
 * Created by Admin on 12/4/2017.
 */


import com.example.admin.weatherinfo.model.CurrentWeather.CurrentWeatherResponse;
import com.example.admin.weatherinfo.model.HourlyWeather.HourlyWeatherResponse;
import com.example.admin.weatherinfo.util.BasePresenter;
import com.example.admin.weatherinfo.util.BaseView;


/**
 * Created by Admin on 11/29/2017.
 */

public interface MainContract
{
    //methods for main activity
    interface View extends BaseView
    {
        void setHourlyWeather(HourlyWeatherResponse weatherResponse);
        void setCurrentWeather(CurrentWeatherResponse weatherResponse);
        void showProgress(String progress);
    }

    interface Presenter extends BasePresenter<View>
    {
        void getHourlyWeather(String zip);
        void getCurrentWeather(String zip);
    }
}
