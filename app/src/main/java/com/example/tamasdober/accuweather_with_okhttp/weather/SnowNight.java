
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class SnowNight implements Parcelable
{

    @SerializedName("in")
    @Expose
    private double in;
    @SerializedName("cm")
    @Expose
    private double cm;
    public final static Parcelable.Creator<SnowNight> CREATOR = new Creator<SnowNight>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SnowNight createFromParcel(Parcel in) {
            SnowNight instance = new SnowNight();
            instance.in = ((double) in.readValue((double.class.getClassLoader())));
            instance.cm = ((double) in.readValue((double.class.getClassLoader())));
            return instance;
        }

        public SnowNight[] newArray(int size) {
            return (new SnowNight[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The in
     */
    public double getIn() {
        return in;
    }

    /**
     * 
     * @param in
     *     The in
     */
    public void setIn(double in) {
        this.in = in;
    }

    /**
     * 
     * @return
     *     The cm
     */
    public double getCm() {
        return cm;
    }

    /**
     * 
     * @param cm
     *     The cm
     */
    public void setCm(double cm) {
        this.cm = cm;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(in);
        dest.writeValue(cm);
    }

    public int describeContents() {
        return  0;
    }

}
