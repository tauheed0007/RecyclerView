package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    int[] arr = {R.drawable.ic_atm, R.drawable.ic_bus_station, R.drawable.ic_cafe,
            R.drawable.ic_doctor, R.drawable.ic_hotel, R.drawable.ic_school,
            R.drawable.ic_shopping, R.drawable.ic_spa, R.drawable.ic_university, R.drawable.ic_atm, R.drawable.ic_bus_station, R.drawable.ic_cafe,
            R.drawable.ic_doctor, R.drawable.ic_hotel, R.drawable.ic_school,
            R.drawable.ic_shopping, R.drawable.ic_spa, R.drawable.ic_university};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(arr);


        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);

    }
}