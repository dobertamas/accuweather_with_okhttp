
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class QpfNight implements Parcelable
{

    @SerializedName("in")
    @Expose
    private double in;
    @SerializedName("mm")
    @Expose
    private int mm;
    public final static Parcelable.Creator<QpfNight> CREATOR = new Creator<QpfNight>() {


        @SuppressWarnings({
            "unchecked"
        })
        public QpfNight createFromParcel(Parcel in) {
            QpfNight instance = new QpfNight();
            instance.in = ((double) in.readValue((double.class.getClassLoader())));
            instance.mm = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public QpfNight[] newArray(int size) {
            return (new QpfNight[size]);
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
     *     The mm
     */
    public int getMm() {
        return mm;
    }

    /**
     * 
     * @param mm
     *     The mm
     */
    public void setMm(int mm) {
        this.mm = mm;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(in);
        dest.writeValue(mm);
    }

    public int describeContents() {
        return  0;
    }

}
