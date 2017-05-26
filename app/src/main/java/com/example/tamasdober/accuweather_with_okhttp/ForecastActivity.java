package com.example.tamasdober.accuweather_with_okhttp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;

public class ForecastActivity extends AppCompatActivity {

    private Forecastday[] mForecastdays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.FORECAST_ARRAY);
        mForecastdays = Arrays.copyOf(parcelables,parcelables.length,Forecastday[].class);



    }
}
