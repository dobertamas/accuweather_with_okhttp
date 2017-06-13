
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class SnowAllday implements Parcelable
{

    @SerializedName("in")
    @Expose
    private double in;
    @SerializedName("cm")
    @Expose
    private double cm;
    public final static Parcelable.Creator<SnowAllday> CREATOR = new Creator<SnowAllday>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SnowAllday createFromParcel(Parcel in) {
            SnowAllday instance = new SnowAllday();
            instance.in = ((double) in.readValue((double.class.getClassLoader())));
            instance.cm = ((double) in.readValue((double.class.getClassLoader())));
            return instance;
        }

        public SnowAllday[] newArray(int size) {
            return (new SnowAllday[size]);
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
