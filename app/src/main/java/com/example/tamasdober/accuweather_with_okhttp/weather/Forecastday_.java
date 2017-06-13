
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import javax.validation.Valid;

@Generated("org.jsonschema2pojo")
public class Forecastday_ implements Parcelable
{

    @SerializedName("date")
    @Expose
    @Valid
    private Date date;
    @SerializedName("period")
    @Expose
    private int period;
    @SerializedName("high")
    @Expose
    @Valid
    private High high;
    @SerializedName("low")
    @Expose
    @Valid
    private Low low;
    @SerializedName("conditions")
    @Expose
    private String conditions;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("skyicon")
    @Expose
    private String skyicon;
    @SerializedName("pop")
    @Expose
    private int pop;
    @SerializedName("qpf_allday")
    @Expose
    @Valid
    private QpfAllday qpfAllday;
    @SerializedName("qpf_day")
    @Expose
    @Valid
    private QpfDay qpfDay;
    @SerializedName("qpf_night")
    @Expose
    @Valid
    private QpfNight qpfNight;
    @SerializedName("snow_allday")
    @Expose
    @Valid
    private SnowAllday snowAllday;
    @SerializedName("snow_day")
    @Expose
    @Valid
    private SnowDay snowDay;
    @SerializedName("snow_night")
    @Expose
    @Valid
    private SnowNight snowNight;
    @SerializedName("maxwind")
    @Expose
    @Valid
    private Maxwind maxwind;
    @SerializedName("avewind")
    @Expose
    @Valid
    private Avewind avewind;
    @SerializedName("avehumidity")
    @Expose
    private int avehumidity;
    @SerializedName("maxhumidity")
    @Expose
    private int maxhumidity;
    @SerializedName("minhumidity")
    @Expose
    private int minhumidity;
    public final static Parcelable.Creator<Forecastday_> CREATOR = new Creator<Forecastday_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Forecastday_ createFromParcel(Parcel in) {
            Forecastday_ instance = new Forecastday_();
            instance.date = ((Date) in.readValue((Date.class.getClassLoader())));
            instance.period = ((int) in.readValue((int.class.getClassLoader())));
            instance.high = ((High) in.readValue((High.class.getClassLoader())));
            instance.low = ((Low) in.readValue((Low.class.getClassLoader())));
            instance.conditions = ((String) in.readValue((String.class.getClassLoader())));
            instance.icon = ((String) in.readValue((String.class.getClassLoader())));
            instance.iconUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.skyicon = ((String) in.readValue((String.class.getClassLoader())));
            instance.pop = ((int) in.readValue((int.class.getClassLoader())));
            instance.qpfAllday = ((QpfAllday) in.readValue((QpfAllday.class.getClassLoader())));
            instance.qpfDay = ((QpfDay) in.readValue((QpfDay.class.getClassLoader())));
            instance.qpfNight = ((QpfNight) in.readValue((QpfNight.class.getClassLoader())));
            instance.snowAllday = ((SnowAllday) in.readValue((SnowAllday.class.getClassLoader())));
            instance.snowDay = ((SnowDay) in.readValue((SnowDay.class.getClassLoader())));
            instance.snowNight = ((SnowNight) in.readValue((SnowNight.class.getClassLoader())));
            instance.maxwind = ((Maxwind) in.readValue((Maxwind.class.getClassLoader())));
            instance.avewind = ((Avewind) in.readValue((Avewind.class.getClassLoader())));
            instance.avehumidity = ((int) in.readValue((int.class.getClassLoader())));
            instance.maxhumidity = ((int) in.readValue((int.class.getClassLoader())));
            instance.minhumidity = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public Forecastday_[] newArray(int size) {
            return (new Forecastday_[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The date
     */
    public Date getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(Date date) {
        this.date = date;
    }

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
     *     The high
     */
    public High getHigh() {
        return high;
    }

    /**
     * 
     * @param high
     *     The high
     */
    public void setHigh(High high) {
        this.high = high;
    }

    /**
     * 
     * @return
     *     The low
     */
    public Low getLow() {
        return low;
    }

    /**
     * 
     * @param low
     *     The low
     */
    public void setLow(Low low) {
        this.low = low;
    }

    /**
     * 
     * @return
     *     The conditions
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * 
     * @param conditions
     *     The conditions
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
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
     *     The skyicon
     */
    public String getSkyicon() {
        return skyicon;
    }

    /**
     * 
     * @param skyicon
     *     The skyicon
     */
    public void setSkyicon(String skyicon) {
        this.skyicon = skyicon;
    }

    /**
     * 
     * @return
     *     The pop
     */
    public int getPop() {
        return pop;
    }

    /**
     * 
     * @param pop
     *     The pop
     */
    public void setPop(int pop) {
        this.pop = pop;
    }

    /**
     * 
     * @return
     *     The qpfAllday
     */
    public QpfAllday getQpfAllday() {
        return qpfAllday;
    }

    /**
     * 
     * @param qpfAllday
     *     The qpf_allday
     */
    public void setQpfAllday(QpfAllday qpfAllday) {
        this.qpfAllday = qpfAllday;
    }

    /**
     * 
     * @return
     *     The qpfDay
     */
    public QpfDay getQpfDay() {
        return qpfDay;
    }

    /**
     * 
     * @param qpfDay
     *     The qpf_day
     */
    public void setQpfDay(QpfDay qpfDay) {
        this.qpfDay = qpfDay;
    }

    /**
     * 
     * @return
     *     The qpfNight
     */
    public QpfNight getQpfNight() {
        return qpfNight;
    }

    /**
     * 
     * @param qpfNight
     *     The qpf_night
     */
    public void setQpfNight(QpfNight qpfNight) {
        this.qpfNight = qpfNight;
    }

    /**
     * 
     * @return
     *     The snowAllday
     */
    public SnowAllday getSnowAllday() {
        return snowAllday;
    }

    /**
     * 
     * @param snowAllday
     *     The snow_allday
     */
    public void setSnowAllday(SnowAllday snowAllday) {
        this.snowAllday = snowAllday;
    }

    /**
     * 
     * @return
     *     The snowDay
     */
    public SnowDay getSnowDay() {
        return snowDay;
    }

    /**
     * 
     * @param snowDay
     *     The snow_day
     */
    public void setSnowDay(SnowDay snowDay) {
        this.snowDay = snowDay;
    }

    /**
     * 
     * @return
     *     The snowNight
     */
    public SnowNight getSnowNight() {
        return snowNight;
    }

    /**
     * 
     * @param snowNight
     *     The snow_night
     */
    public void setSnowNight(SnowNight snowNight) {
        this.snowNight = snowNight;
    }

    /**
     * 
     * @return
     *     The maxwind
     */
    public Maxwind getMaxwind() {
        return maxwind;
    }

    /**
     * 
     * @param maxwind
     *     The maxwind
     */
    public void setMaxwind(Maxwind maxwind) {
        this.maxwind = maxwind;
    }

    /**
     * 
     * @return
     *     The avewind
     */
    public Avewind getAvewind() {
        return avewind;
    }

    /**
     * 
     * @param avewind
     *     The avewind
     */
    public void setAvewind(Avewind avewind) {
        this.avewind = avewind;
    }

    /**
     * 
     * @return
     *     The avehumidity
     */
    public int getAvehumidity() {
        return avehumidity;
    }

    /**
     * 
     * @param avehumidity
     *     The avehumidity
     */
    public void setAvehumidity(int avehumidity) {
        this.avehumidity = avehumidity;
    }

    /**
     * 
     * @return
     *     The maxhumidity
     */
    public int getMaxhumidity() {
        return maxhumidity;
    }

    /**
     * 
     * @param maxhumidity
     *     The maxhumidity
     */
    public void setMaxhumidity(int maxhumidity) {
        this.maxhumidity = maxhumidity;
    }

    /**
     * 
     * @return
     *     The minhumidity
     */
    public int getMinhumidity() {
        return minhumidity;
    }

    /**
     * 
     * @param minhumidity
     *     The minhumidity
     */
    public void setMinhumidity(int minhumidity) {
        this.minhumidity = minhumidity;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(date);
        dest.writeValue(period);
        dest.writeValue(high);
        dest.writeValue(low);
        dest.writeValue(conditions);
        dest.writeValue(icon);
        dest.writeValue(iconUrl);
        dest.writeValue(skyicon);
        dest.writeValue(pop);
        dest.writeValue(qpfAllday);
        dest.writeValue(qpfDay);
        dest.writeValue(qpfNight);
        dest.writeValue(snowAllday);
        dest.writeValue(snowDay);
        dest.writeValue(snowNight);
        dest.writeValue(maxwind);
        dest.writeValue(avewind);
        dest.writeValue(avehumidity);
        dest.writeValue(maxhumidity);
        dest.writeValue(minhumidity);
    }

    public int describeContents() {
        return  0;
    }

}
