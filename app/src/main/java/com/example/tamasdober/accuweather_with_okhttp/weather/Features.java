
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Features implements Parcelable
{

    @SerializedName("forecast10day")
    @Expose
    private int forecast10day;
    public final static Parcelable.Creator<Features> CREATOR = new Creator<Features>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Features createFromParcel(Parcel in) {
            Features instance = new Features();
            instance.forecast10day = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public Features[] newArray(int size) {
            return (new Features[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The forecast10day
     */
    public int getForecast10day() {
        return forecast10day;
    }

    /**
     * 
     * @param forecast10day
     *     The forecast10day
     */
    public void setForecast10day(int forecast10day) {
        this.forecast10day = forecast10day;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(forecast10day);
    }

    public int describeContents() {
        return  0;
    }

}
