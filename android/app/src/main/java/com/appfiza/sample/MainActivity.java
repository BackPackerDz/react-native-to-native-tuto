package com.appfiza.sample;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.appfiza.myreactlib.MyReactActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.appfiza.sample.R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v -> startActivity(new Intent(getBaseContext(), MyReactActivity.class)));
    }

}