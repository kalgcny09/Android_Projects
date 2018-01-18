package com.danieleoliva.actionbarvideo;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.mipmap.chrome);
        actionBar.setTitle("Welcome");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        //shows picture in action bar

        actionBar.setDisplayHomeAsUpEnabled(true);


    }
}
