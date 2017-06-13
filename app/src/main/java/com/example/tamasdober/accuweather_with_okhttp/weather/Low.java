
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Low implements Parcelable
{

    @SerializedName("fahrenheit")
    @Expose
    private String fahrenheit;
    @SerializedName("celsius")
    @Expose
    private String celsius;
    public final static Parcelable.Creator<Low> CREATOR = new Creator<Low>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Low createFromParcel(Parcel in) {
            Low instance = new Low();
            instance.fahrenheit = ((String) in.readValue((String.class.getClassLoader())));
            instance.celsius = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Low[] newArray(int size) {
            return (new Low[size]);
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
