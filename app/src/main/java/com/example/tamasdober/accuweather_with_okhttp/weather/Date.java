
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Date implements Parcelable
{

    @SerializedName("epoch")
    @Expose
    private String epoch;
    @SerializedName("pretty")
    @Expose
    private String pretty;
    @SerializedName("day")
    @Expose
    private int day;
    @SerializedName("month")
    @Expose
    private int month;
    @SerializedName("year")
    @Expose
    private int year;
    @SerializedName("yday")
    @Expose
    private int yday;
    @SerializedName("hour")
    @Expose
    private int hour;
    @SerializedName("min")
    @Expose
    private String min;
    @SerializedName("sec")
    @Expose
    private int sec;
    @SerializedName("isdst")
    @Expose
    private String isdst;
    @SerializedName("monthname")
    @Expose
    private String monthname;
    @SerializedName("monthname_short")
    @Expose
    private String monthnameShort;
    @SerializedName("weekday_short")
    @Expose
    private String weekdayShort;
    @SerializedName("weekday")
    @Expose
    private String weekday;
    @SerializedName("ampm")
    @Expose
    private String ampm;
    @SerializedName("tz_short")
    @Expose
    private String tzShort;
    @SerializedName("tz_long")
    @Expose
    private String tzLong;
    public final static Parcelable.Creator<Date> CREATOR = new Creator<Date>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Date createFromParcel(Parcel in) {
            Date instance = new Date();
            instance.epoch = ((String) in.readValue((String.class.getClassLoader())));
            instance.pretty = ((String) in.readValue((String.class.getClassLoader())));
            instance.day = ((int) in.readValue((int.class.getClassLoader())));
            instance.month = ((int) in.readValue((int.class.getClassLoader())));
            instance.year = ((int) in.readValue((int.class.getClassLoader())));
            instance.yday = ((int) in.readValue((int.class.getClassLoader())));
            instance.hour = ((int) in.readValue((int.class.getClassLoader())));
            instance.min = ((String) in.readValue((String.class.getClassLoader())));
            instance.sec = ((int) in.readValue((int.class.getClassLoader())));
            instance.isdst = ((String) in.readValue((String.class.getClassLoader())));
            instance.monthname = ((String) in.readValue((String.class.getClassLoader())));
            instance.monthnameShort = ((String) in.readValue((String.class.getClassLoader())));
            instance.weekdayShort = ((String) in.readValue((String.class.getClassLoader())));
            instance.weekday = ((String) in.readValue((String.class.getClassLoader())));
            instance.ampm = ((String) in.readValue((String.class.getClassLoader())));
            instance.tzShort = ((String) in.readValue((String.class.getClassLoader())));
            instance.tzLong = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Date[] newArray(int size) {
            return (new Date[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The epoch
     */
    public String getEpoch() {
        return epoch;
    }

    /**
     * 
     * @param epoch
     *     The epoch
     */
    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    /**
     * 
     * @return
     *     The pretty
     */
    public String getPretty() {
        return pretty;
    }

    /**
     * 
     * @param pretty
     *     The pretty
     */
    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    /**
     * 
     * @return
     *     The day
     */
    public int getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * 
     * @return
     *     The month
     */
    public int getMonth() {
        return month;
    }

    /**
     * 
     * @param month
     *     The month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * 
     * @return
     *     The year
     */
    public int getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The yday
     */
    public int getYday() {
        return yday;
    }

    /**
     * 
     * @param yday
     *     The yday
     */
    public void setYday(int yday) {
        this.yday = yday;
    }

    /**
     * 
     * @return
     *     The hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * 
     * @param hour
     *     The hour
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * 
     * @return
     *     The min
     */
    public String getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * 
     * @return
     *     The sec
     */
    public int getSec() {
        return sec;
    }

    /**
     * 
     * @param sec
     *     The sec
     */
    public void setSec(int sec) {
        this.sec = sec;
    }

    /**
     * 
     * @return
     *     The isdst
     */
    public String getIsdst() {
        return isdst;
    }

    /**
     * 
     * @param isdst
     *     The isdst
     */
    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    /**
     * 
     * @return
     *     The monthname
     */
    public String getMonthname() {
        return monthname;
    }

    /**
     * 
     * @param monthname
     *     The monthname
     */
    public void setMonthname(String monthname) {
        this.monthname = monthname;
    }

    /**
     * 
     * @return
     *     The monthnameShort
     */
    public String getMonthnameShort() {
        return monthnameShort;
    }

    /**
     * 
     * @param monthnameShort
     *     The monthname_short
     */
    public void setMonthnameShort(String monthnameShort) {
        this.monthnameShort = monthnameShort;
    }

    /**
     * 
     * @return
     *     The weekdayShort
     */
    public String getWeekdayShort() {
        return weekdayShort;
    }

    /**
     * 
     * @param weekdayShort
     *     The weekday_short
     */
    public void setWeekdayShort(String weekdayShort) {
        this.weekdayShort = weekdayShort;
    }

    /**
     * 
     * @return
     *     The weekday
     */
    public String getWeekday() {
        return weekday;
    }

    /**
     * 
     * @param weekday
     *     The weekday
     */
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    /**
     * 
     * @return
     *     The ampm
     */
    public String getAmpm() {
        return ampm;
    }

    /**
     * 
     * @param ampm
     *     The ampm
     */
    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    /**
     * 
     * @return
     *     The tzShort
     */
    public String getTzShort() {
        return tzShort;
    }

    /**
     * 
     * @param tzShort
     *     The tz_short
     */
    public void setTzShort(String tzShort) {
        this.tzShort = tzShort;
    }

    /**
     * 
     * @return
     *     The tzLong
     */
    public String getTzLong() {
        return tzLong;
    }

    /**
     * 
     * @param tzLong
     *     The tz_long
     */
    public void setTzLong(String tzLong) {
        this.tzLong = tzLong;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(epoch);
        dest.writeValue(pretty);
        dest.writeValue(day);
        dest.writeValue(month);
        dest.writeValue(year);
        dest.writeValue(yday);
        dest.writeValue(hour);
        dest.writeValue(min);
        dest.writeValue(sec);
        dest.writeValue(isdst);
        dest.writeValue(monthname);
        dest.writeValue(monthnameShort);
        dest.writeValue(weekdayShort);
        dest.writeValue(weekday);
        dest.writeValue(ampm);
        dest.writeValue(tzShort);
        dest.writeValue(tzLong);
    }

    public int describeContents() {
        return  0;
    }

}
