package com.nyan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lucy.choi on 2017. 1. 29..
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        Button btnNyan = (Button)findViewById(R.id.btn_nyan);

        btnNyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                intent.putExtra("nyan", "gyuha");
                startActivity(intent);
            }
        });

    }
}
