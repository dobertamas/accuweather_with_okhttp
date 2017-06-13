
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Forecastday implements Parcelable
{

    @SerializedName("period")
    @Expose
    private int period;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("fcttext")
    @Expose
    private String fcttext;
    @SerializedName("fcttext_metric")
    @Expose
    private String fcttextMetric;
    @SerializedName("pop")
    @Expose
    private String pop;
    public final static Parcelable.Creator<Forecastday> CREATOR = new Creator<Forecastday>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Forecastday createFromParcel(Parcel in) {
            Forecastday instance = new Forecastday();
            instance.period = ((int) in.readValue((int.class.getClassLoader())));
            instance.icon = ((String) in.readValue((String.class.getClassLoader())));
            instance.iconUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.fcttext = ((String) in.readValue((String.class.getClassLoader())));
            instance.fcttextMetric = ((String) in.readValue((String.class.getClassLoader())));
            instance.pop = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Forecastday[] newArray(int size) {
            return (new Forecastday[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The period
     */
    public int getPeriod() {
        return period;
    }

    /**
     * 
     * @param period
     *     The period
     */
    public void setPeriod(int period) {
        this.period = period;
    }

    /**
     * 
     * @return
     *     The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return
     *     The iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 
     * @param iconUrl
     *     The icon_url
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The fcttext
     */
    public String getFcttext() {
        return fcttext;
    }

    /**
     * 
     * @param fcttext
     *     The fcttext
     */
    public void setFcttext(String fcttext) {
        this.fcttext = fcttext;
    }

    /**
     * 
     * @return
     *     The fcttextMetric
     */
    public String getFcttextMetric() {
        return fcttextMetric;
    }

    /**
     * 
     * @param fcttextMetric
     *     The fcttext_metric
     */
    public void setFcttextMetric(String fcttextMetric) {
        this.fcttextMetric = fcttextMetric;
    }

    /**
     * 
     * @return
     *     The pop
     */
    public String getPop() {
        return pop;
    }

    /**
     * 
     * @param pop
     *     The pop
     */
    public void setPop(String pop) {
        this.pop = pop;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(period);
        dest.writeValue(icon);
        dest.writeValue(iconUrl);
        dest.writeValue(title);
        dest.writeValue(fcttext);
        dest.writeValue(fcttextMetric);
        dest.writeValue(pop);
    }

    public int describeContents() {
        return  0;
    }

}
