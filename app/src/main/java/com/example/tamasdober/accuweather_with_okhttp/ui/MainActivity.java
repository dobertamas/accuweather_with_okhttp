package com.example.tamasdober.accuweather_with_okhttp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.tamasdober.accuweather_with_okhttp.R;
import com.example.tamasdober.accuweather_with_okhttp.weather.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    public static final String FORECAST_DATA = "FORECAST_DATA";


    final String apiKey = "0c88855782df71ca";
    //String currentConditionsUrl = "http://api.wunderground.com/api/" + apiKey + "/conditions/q/CA/San_Francisco.json";
    final String tenDaysForecastUrl = "http://api.wunderground.com/api/" + apiKey + "/forecast10day/q/CA/San_Francisco.json";
    Response mResponse;

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
            public void onResponse(@NonNull Call call, @NonNull okhttp3.Response response) throws IOException {

                try {

                    if (response.isSuccessful()) {
                        String jsonData = response.body().string();
                        Log.d(TAG, " response body: " + jsonData);

                        mResponse = processJsonWithGson(jsonData);

                    } else {
                        alertUserAboutError();
                    }

                } catch (IOException e) {
                    Log.i(TAG, " Exception caught: " + e);
                }
            }

        });

    }


    private Response processJsonWithGson(String jsonData) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Response response = gson.fromJson(jsonData, Response.class);
        Log.i(TAG, " got response ");
        return response;

    }

    private void alertUserAboutError() {
        // TODO: add an alert dialog
    }

    @OnClick(R.id.forecastButton)
    public void startForecastActivity(View view) {
        Intent forecastIntent = new Intent(this, ForecastActivity.class);
        forecastIntent.putExtra(FORECAST_DATA, mResponse);
        startActivity(forecastIntent);
    }

}

