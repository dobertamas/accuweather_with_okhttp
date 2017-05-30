package com.example.tamasdober.accuweather_with_okhttp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tamasdober.accuweather_with_okhttp.R;
import com.example.tamasdober.accuweather_with_okhttp.weather.Forecastday;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    private Forecastday[] mForecastdays;

    public ForecastAdapter(Forecastday[] forecastdays) {
        mForecastdays = forecastdays;
    }


    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.forecast_list_item, parent, false);
        return new ForecastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {
        holder.bindForecast(mForecastdays[position]);
    }

    @Override
    public int getItemCount() {
        return mForecastdays.length;
    }

    class ForecastViewHolder extends RecyclerView.ViewHolder {

        TextView mTitleTextView;
        ImageView mIconImageView;

        ForecastViewHolder(View itemView) {
            super(itemView);
            mTitleTextView = (TextView) itemView.findViewById(R.id.titleTextView);
            mIconImageView = (ImageView) itemView.findViewById(R.id.iconImageView);

        }

        void bindForecast(Forecastday forecastday) {
            mTitleTextView.setText(forecastday.getTitle());
            mIconImageView.setImageResource(Forecastday.getIconId(forecastday.getIcon()));

        }

    }


}
