package com.panha.asus.yoempanha;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.panha.asus.yoempanha.activity.MainActivity;

public class StartUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotoMainActivity = new Intent(StartUpActivity.this,MainActivity.class);
                startActivity(gotoMainActivity);
                finish();
            }
        },3000);
    }
}
