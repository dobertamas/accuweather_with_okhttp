
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Maxwind implements Parcelable
{

    @SerializedName("mph")
    @Expose
    private int mph;
    @SerializedName("kph")
    @Expose
    private int kph;
    @SerializedName("dir")
    @Expose
    private String dir;
    @SerializedName("degrees")
    @Expose
    private int degrees;
    public final static Parcelable.Creator<Maxwind> CREATOR = new Creator<Maxwind>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Maxwind createFromParcel(Parcel in) {
            Maxwind instance = new Maxwind();
            instance.mph = ((int) in.readValue((int.class.getClassLoader())));
            instance.kph = ((int) in.readValue((int.class.getClassLoader())));
            instance.dir = ((String) in.readValue((String.class.getClassLoader())));
            instance.degrees = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public Maxwind[] newArray(int size) {
            return (new Maxwind[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The mph
     */
    public int getMph() {
        return mph;
    }

    /**
     * 
     * @param mph
     *     The mph
     */
    public void setMph(int mph) {
        this.mph = mph;
    }

    /**
     * 
     * @return
     *     The kph
     */
    public int getKph() {
        return kph;
    }

    /**
     * 
     * @param kph
     *     The kph
     */
    public void setKph(int kph) {
        this.kph = kph;
    }

    /**
     * 
     * @return
     *     The dir
     */
    public String getDir() {
        return dir;
    }

    /**
     * 
     * @param dir
     *     The dir
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * 
     * @return
     *     The degrees
     */
    public int getDegrees() {
        return degrees;
    }

    /**
     * 
     * @param degrees
     *     The degrees
     */
    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(mph);
        dest.writeValue(kph);
        dest.writeValue(dir);
        dest.writeValue(degrees);
    }

    public int describeContents() {
        return  0;
    }

}
