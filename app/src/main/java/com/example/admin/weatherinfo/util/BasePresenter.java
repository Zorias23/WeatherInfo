package com.example.admin.weatherinfo.util;

/**
 * Created by Admin on 12/4/2017.
 */


public interface BasePresenter <V extends BaseView>
{
    void attachView(V view);
    void detachView();
}