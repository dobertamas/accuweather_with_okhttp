
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import javax.validation.Valid;

@Generated("org.jsonschema2pojo")
public class Forecast implements Parcelable
{

    @SerializedName("txt_forecast")
    @Expose
    @Valid
    private TxtForecast txtForecast;
    @SerializedName("simpleforecast")
    @Expose
    @Valid
    private Simpleforecast simpleforecast;
    public final static Parcelable.Creator<Forecast> CREATOR = new Creator<Forecast>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Forecast createFromParcel(Parcel in) {
            Forecast instance = new Forecast();
            instance.txtForecast = ((TxtForecast) in.readValue((TxtForecast.class.getClassLoader())));
            instance.simpleforecast = ((Simpleforecast) in.readValue((Simpleforecast.class.getClassLoader())));
            return instance;
        }

        public Forecast[] newArray(int size) {
            return (new Forecast[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The txtForecast
     */
    public TxtForecast getTxtForecast() {
        return txtForecast;
    }

    /**
     * 
     * @param txtForecast
     *     The txt_forecast
     */
    public void setTxtForecast(TxtForecast txtForecast) {
        this.txtForecast = txtForecast;
    }

    /**
     * 
     * @return
     *     The simpleforecast
     */
    public Simpleforecast getSimpleforecast() {
        return simpleforecast;
    }

    /**
     * 
     * @param simpleforecast
     *     The simpleforecast
     */
    public void setSimpleforecast(Simpleforecast simpleforecast) {
        this.simpleforecast = simpleforecast;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(txtForecast);
        dest.writeValue(simpleforecast);
    }

    public int describeContents() {
        return  0;
    }

}
