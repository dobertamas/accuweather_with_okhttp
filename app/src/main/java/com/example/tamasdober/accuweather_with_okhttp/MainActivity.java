package com.example.tamasdober.accuweather_with_okhttp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    public static final String FORECAST_ARRAY = "FORECAST_ARRAY";

    private Forecastday[] mForecastArray;

    final String apiKey = "0c88855782df71ca";
    //String currentConditionsUrl = "http://api.wunderground.com/api/" + apiKey + "/conditions/q/CA/San_Francisco.json";
    final String tenDaysForecastUrl = "http://api.wunderground.com/api/" + apiKey + "/forecast10day/q/CA/San_Francisco.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        // TODO: check that network is available with ConnectivityMAnager (also add new permission)
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(tenDaysForecastUrl).build();

        Call call = client.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {

            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {

                try {

                    if (response.isSuccessful()) {
                        String jsonData = response.body().string();
                        Log.d(TAG, " response body: " + jsonData);
                        try {
                            mForecastArray = getForecastDetails(jsonData);
                            Log.i(TAG, "first forecast back " + mForecastArray[0].getTitle());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    } else {
                        alertUserAboutError();
                    }

                } catch (IOException e) {
                    Log.i(TAG, " Exception caught: " + e);
                }
            }

        });


    }

    private Forecastday[] getForecastDetails(String jsonData) throws JSONException {

        JSONObject responseJson = new JSONObject(jsonData);
        JSONObject forecastPart = responseJson.getJSONObject("forecast");
        JSONObject txtForecastJson = forecastPart.getJSONObject("txt_forecast");

        JSONArray forecastArray = txtForecastJson.getJSONArray("forecastday");
        //Log.d(TAG, " forecastArray : " + forecastArray.toString());

        Forecastday[] forecasts = new Forecastday[forecastArray.length()];

        for (int x = 0; x < forecastArray.length(); x++) {

            JSONObject forecastItem = forecastArray.getJSONObject(x);
            Forecastday forecastdayLoopItem = new Forecastday();

            forecastdayLoopItem.setPeriod(forecastItem.getInt("period"));
            forecastdayLoopItem.setIcon(forecastItem.getString("icon"));
            forecastdayLoopItem.setIconUrl(forecastItem.getString("icon_url"));
            forecastdayLoopItem.setTitle(forecastItem.getString("title"));
            forecastdayLoopItem.setFcttext(forecastItem.getString("fcttext"));
            forecastdayLoopItem.setFcttextMetric(forecastItem.getString("fcttext_metric"));

            forecasts[x] = forecastdayLoopItem;
        }

        return forecasts;

    }

    private void alertUserAboutError() {
        // TODO: add an alert dialog
    }

    @OnClick (R.id.forecastButton)
    public void startForecastActivity(View view) {
        Intent forecastIntent = new Intent(this, ForecastActivity.class);
        forecastIntent.putExtra(FORECAST_ARRAY, mForecastArray);
        startActivity(forecastIntent);
    }

}

