package com.rohan.user.myofflinerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 11/13/2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    String[] capital,country;

    public RecyclerAdapter(String[] capital, String[] country) {
        this.capital = capital;
        this.country = country;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item_row, parent, false);
        return new RecyclerViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
            holder.mItemDate.setText(country[position]);
        holder.mItemDescription.setText(capital[position]);
    }

    @Override
    public int getItemCount() {
        return country.length;
    }
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //2
        private TextView mItemDate;
        private TextView mItemDescription;


        //3
        private static final String PHOTO_KEY = "Simple Example";

        //4
        public RecyclerViewHolder(View v) {
            super(v);
            mItemDate = (TextView) v.findViewById(R.id.item_date);
            mItemDescription = (TextView) v.findViewById(R.id.item_description);
            v.setOnClickListener(this);
        }

        //5
        @Override
        public void onClick(View v) {
            Log.d("RecyclerView", "CLICK!");
        }

    }
}
