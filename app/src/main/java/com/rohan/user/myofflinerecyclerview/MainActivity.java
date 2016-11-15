package com.rohan.user.myofflinerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private RecyclerView.Adapter adapter;
    String[] country ={"Japn","India","China","USA","Russia","Mexico","Sri Lanka","Bangladesh","Pakistan","Afghanistan","Iraq","Turkey"};
    String[] capital = {"Tokyo","New Delhi","Beijing","Washington DC","Moscow","New Mexico","Colombo","Dhaka","Karachi","Kabul","Bhagdad","Istanbul"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLinearLayoutManager = new LinearLayoutManager(this);
        adapter = new RecyclerAdapter(capital,country);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(adapter);
    }

}
