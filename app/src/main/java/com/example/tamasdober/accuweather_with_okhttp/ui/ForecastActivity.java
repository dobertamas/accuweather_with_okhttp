package com.example.tamasdober.accuweather_with_okhttp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tamasdober.accuweather_with_okhttp.R;
import com.example.tamasdober.accuweather_with_okhttp.adapters.SimpleforecastAdapter;
import com.example.tamasdober.accuweather_with_okhttp.weather.Response;

import butterknife.ButterKnife;
import butterknife.InjectView;

import static com.example.tamasdober.accuweather_with_okhttp.ui.MainActivity.FORECAST_DATA;

public class ForecastActivity extends AppCompatActivity {

    @InjectView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        ButterKnife.inject(this);

        Intent intent = getIntent();
        Response mResponse = (Response) intent.getExtras().get(FORECAST_DATA);

        SimpleforecastAdapter adapter = new SimpleforecastAdapter(mResponse);
        mRecyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

    }
}
