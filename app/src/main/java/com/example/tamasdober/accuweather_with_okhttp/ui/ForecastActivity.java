package com.example.tamasdober.accuweather_with_okhttp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tamasdober.accuweather_with_okhttp.R;
import com.example.tamasdober.accuweather_with_okhttp.adapters.ForecastAdapter;
import com.example.tamasdober.accuweather_with_okhttp.weather.Forecastday;

import java.util.Arrays;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ForecastActivity extends AppCompatActivity {

    @InjectView(R.id.recyclerView) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        ButterKnife.inject(this);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.FORECAST_ARRAY);
        Forecastday[] forecastdays = Arrays.copyOf(parcelables, parcelables.length, Forecastday[].class);

        ForecastAdapter adapter = new ForecastAdapter(forecastdays);
        mRecyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

    }
}
