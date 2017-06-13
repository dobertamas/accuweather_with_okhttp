
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.validation.Valid;

@Generated("org.jsonschema2pojo")
public class Simpleforecast implements Parcelable
{

    @SerializedName("forecastday")
    @Expose
    @Valid
    private List<Forecastday_> forecastday = new ArrayList<Forecastday_>();
    public final static Parcelable.Creator<Simpleforecast> CREATOR = new Creator<Simpleforecast>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Simpleforecast createFromParcel(Parcel in) {
            Simpleforecast instance = new Simpleforecast();
            in.readList(instance.forecastday, (com.example.tamasdober.accuweather_with_okhttp.weather.Forecastday_.class.getClassLoader()));
            return instance;
        }

        public Simpleforecast[] newArray(int size) {
            return (new Simpleforecast[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The forecastday
     */
    public List<Forecastday_> getForecastday() {
        return forecastday;
    }

    /**
     * 
     * @param forecastday
     *     The forecastday
     */
    public void setForecastday(List<Forecastday_> forecastday) {
        this.forecastday = forecastday;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(forecastday);
    }

    public int describeContents() {
        return  0;
    }

}
