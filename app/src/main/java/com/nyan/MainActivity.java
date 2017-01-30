package com.nyan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Intent intent = getIntent();
        String nyan = intent.getStringExtra("nyan");

        RecyclerView rv = (RecyclerView)findViewById(R.id.nyan_rv);

        // layout manager
        rv.setLayoutManager(new LinearLayoutManager(this));

        // adapter
        rv.setAdapter(new NyanAdapter());

    }
}
