package com.example.tamasdober.accuweather_with_okhttp.weather;

public class SimpleForecast {

    // Example: http://api.wunderground.com/api/0c88855782df71ca//forecast10day/q/CA/San_Francisco.json

    // simpleforecast | forecastday | date | epoch
    private long mDate;
    private int mHighCelsius;
    private int mHighFahrenheit;
    private int mLowCelsius;
    private int mLowFahrenheit;
    private String mIcon;

    public long getDate() {
        return mDate;
    }

    public void setDate(long date) {
        mDate = date;
    }

    public int getHighCelsius() {
        return mHighCelsius;
    }

    public void setHighCelsius(int highCelsius) {
        mHighCelsius = highCelsius;
    }

    public int getHighFahrenheit() {
        return mHighFahrenheit;
    }

    public void setHighFahrenheit(int highFahrenheit) {
        mHighFahrenheit = highFahrenheit;
    }

    public int getLowCelsius() {
        return mLowCelsius;
    }

    public void setLowCelsius(int lowCelsius) {
        mLowCelsius = lowCelsius;
    }

    public int getLowFahrenheit() {
        return mLowFahrenheit;
    }

    public void setLowFahrenheit(int lowFahrenheit) {
        mLowFahrenheit = lowFahrenheit;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }






}
