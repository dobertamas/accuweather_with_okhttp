package com.example.tamasdober.accuweather_with_okhttp.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tamasdober.accuweather_with_okhttp.R;
import com.example.tamasdober.accuweather_with_okhttp.weather.Forecastday_;
import com.example.tamasdober.accuweather_with_okhttp.weather.Response;

public class SimpleforecastAdapter extends RecyclerView.Adapter<SimpleforecastAdapter.SimpleforecastViewHolder> {

    private static final String TAG = SimpleforecastAdapter.class.getSimpleName();

    private Response mResponse;

    public SimpleforecastAdapter(Response response) {
        mResponse = response;
    }

    @Override
    public SimpleforecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.forecast_list_item, parent, false);
        return new SimpleforecastAdapter.SimpleforecastViewHolder(view);

    }

    @Override
    public void onBindViewHolder(SimpleforecastViewHolder holder, int position) {
        holder.bindSimpleforecast(mResponse.getForecast().getSimpleforecast().getForecastday().get(position));
        Log.i(TAG, " inside onBindViewHolder ");

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class SimpleforecastViewHolder extends RecyclerView.ViewHolder {

        TextView mTitleTextView;
        ImageView mIconImageView;

        SimpleforecastViewHolder(View itemView) {
            super(itemView);
            mTitleTextView = (TextView) itemView.findViewById(R.id.titleTextView);
            mIconImageView = (ImageView) itemView.findViewById(R.id.iconImageView);
        }

        void bindSimpleforecast(Forecastday_ forecastday_) {
            mTitleTextView.setText(forecastday_.getDate().getWeekday());
            Log.i(TAG, " week day: ");
            //mIconImageView.setImageResource(Forecastday.getIconId(forecastday.getIcon()));

        }
    }
}
