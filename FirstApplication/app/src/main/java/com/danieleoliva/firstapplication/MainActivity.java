package com.danieleoliva.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    String tag = "Life Cycle Event: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(tag,"In OnCreate()");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(tag, "In onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();

        Log.d(tag, "In onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(tag, "In onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(tag, "In onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(tag, "In onRestart()");
    }
}
