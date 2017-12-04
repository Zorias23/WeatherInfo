package com.example.admin.weatherinfo.remote;



import com.example.admin.weatherinfo.model.CurrentWeather.CurrentWeatherResponse;
import com.example.admin.weatherinfo.model.HourlyWeather.HourlyWeatherResponse;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Admin on 11/29/2017.
 */

public class RemoteDataSource {
    public static final String BASE_URL = "http://api.wunderground.com/api/";
    public static final String API_KEY = "36ef26626932604f";

    public static Retrofit create()
    {
         return  new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
    }

    public static io.reactivex.Observable<CurrentWeatherResponse> getCurrentWeather(String zipCode)
    {
        Retrofit retrofit = create();
        RemoteService remoteService = retrofit.create(RemoteService.class);
        return remoteService.getCurrentWeather(zipCode);
    }

    public static io.reactivex.Observable<HourlyWeatherResponse> getHourlyWeather(String zipCode)
    {
        Retrofit retrofit = create();
        RemoteService remoteService = retrofit.create(RemoteService.class);
        return remoteService.getHourlyWeather(zipCode);
    }
}
