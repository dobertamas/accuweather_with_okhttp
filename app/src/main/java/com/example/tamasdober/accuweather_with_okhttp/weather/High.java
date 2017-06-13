
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class High implements Parcelable
{

    @SerializedName("fahrenheit")
    @Expose
    private String fahrenheit;
    @SerializedName("celsius")
    @Expose
    private String celsius;
    public final static Parcelable.Creator<High> CREATOR = new Creator<High>() {


        @SuppressWarnings({
            "unchecked"
        })
        public High createFromParcel(Parcel in) {
            High instance = new High();
            instance.fahrenheit = ((String) in.readValue((String.class.getClassLoader())));
            instance.celsius = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public High[] newArray(int size) {
            return (new High[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The fahrenheit
     */
    public String getFahrenheit() {
        return fahrenheit;
    }

    /**
     * 
     * @param fahrenheit
     *     The fahrenheit
     */
    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    /**
     * 
     * @return
     *     The celsius
     */
    public String getCelsius() {
        return celsius;
    }

    /**
     * 
     * @param celsius
     *     The celsius
     */
    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(fahrenheit);
        dest.writeValue(celsius);
    }

    public int describeContents() {
        return  0;
    }

}
