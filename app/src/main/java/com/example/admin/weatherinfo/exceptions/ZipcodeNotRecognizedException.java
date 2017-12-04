package com.example.admin.weatherinfo.exceptions;

/**
 * Created by Admin on 12/4/2017.
 */


public class ZipcodeNotRecognizedException extends Exception
{
    public ZipcodeNotRecognizedException()
    {
        super("Zipcode must be 5 digits.");
    }
}