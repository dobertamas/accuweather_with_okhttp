package com.example.tamasdober.accuweather_with_okhttp;

/**
 * Created by tamasdober on 5/24/17.
 */

public class Forecastday {

    private int mPeriod;
    private String mIcon;
    private String mIconUrl;
    private String mTitle;

    public int getPeriod() {
        return mPeriod;
    }

    public void setPeriod(int period) {
        mPeriod = period;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getIconUrl() {
        return mIconUrl;
    }

    public void setIconUrl(String iconUrl) {
        mIconUrl = iconUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getFcttext() {
        return mFcttext;
    }

    public void setFcttext(String fcttext) {
        mFcttext = fcttext;
    }

    public String getFcttextMetric() {
        return mFcttextMetric;
    }

    public void setFcttextMetric(String fcttextMetric) {
        mFcttextMetric = fcttextMetric;
    }

    private String mFcttext;
    private String mFcttextMetric;


}
