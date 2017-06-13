
package com.example.tamasdober.accuweather_with_okhttp.weather;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import javax.validation.Valid;

@Generated("org.jsonschema2pojo")
public class Response_ implements Parcelable
{

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("termsofService")
    @Expose
    private String termsofService;
    @SerializedName("features")
    @Expose
    @Valid
    private Features features;
    public final static Parcelable.Creator<Response_> CREATOR = new Creator<Response_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Response_ createFromParcel(Parcel in) {
            Response_ instance = new Response_();
            instance.version = ((String) in.readValue((String.class.getClassLoader())));
            instance.termsofService = ((String) in.readValue((String.class.getClassLoader())));
            instance.features = ((Features) in.readValue((Features.class.getClassLoader())));
            return instance;
        }

        public Response_[] newArray(int size) {
            return (new Response_[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The termsofService
     */
    public String getTermsofService() {
        return termsofService;
    }

    /**
     * 
     * @param termsofService
     *     The termsofService
     */
    public void setTermsofService(String termsofService) {
        this.termsofService = termsofService;
    }

    /**
     * 
     * @return
     *     The features
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * 
     * @param features
     *     The features
     */
    public void setFeatures(Features features) {
        this.features = features;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(version);
        dest.writeValue(termsofService);
        dest.writeValue(features);
    }

    public int describeContents() {
        return  0;
    }

}
