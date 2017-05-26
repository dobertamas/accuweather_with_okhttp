package com.example.tamasdober.accuweather_with_okhttp;

import android.os.Parcel;
import android.os.Parcelable;

public class Forecastday implements Parcelable {

    private int mPeriod;
    private String mIcon;
    private String mIconUrl;
    private String mTitle;

    public Forecastday() { }

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


    @Override
    public int describeContents() {
        return 0; // ignore
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mPeriod);
        dest.writeString(mIcon);
        dest.writeString(mIconUrl);
        dest.writeString(mTitle);
        dest.writeString(mFcttext);
        dest.writeString(mFcttextMetric);

    }

    private Forecastday(Parcel in) {
        mPeriod = in.readInt();
        mIcon = in.readString();
        mIconUrl = in.readString();
        mTitle = in.readString();
        mFcttext = in.readString();
        mFcttextMetric = in.readString();

    }

    public static final Creator<Forecastday> CREATOR = new Creator<Forecastday>() {
        @Override
        public Forecastday createFromParcel(Parcel source) {
            return new Forecastday(source);
        }

        @Override
        public Forecastday[] newArray(int size) {
            return new Forecastday[size];
        }
    };

}
