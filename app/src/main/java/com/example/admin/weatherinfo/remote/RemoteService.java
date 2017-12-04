package com.example.admin.weatherinfo.remote;



import com.example.admin.weatherinfo.model.CurrentWeather.CurrentWeatherResponse;
import com.example.admin.weatherinfo.model.HourlyWeather.HourlyWeatherResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Admin on 11/29/2017.
 */

public interface RemoteService {

    @GET(RemoteDataSource.API_KEY + "/conditions/q/{zipCode}.json")
    Observable<CurrentWeatherResponse> getCurrentWeather(@Path("zipCode") String zipCode);

    @GET(RemoteDataSource.API_KEY +"/hourly/q/{zipCode}.json")
    Observable<HourlyWeatherResponse> getHourlyWeather(@Path("zipCode") String zipCode);
}
