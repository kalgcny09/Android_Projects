package com.danieleoliva.dummy_phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.tvMessage);

        if (getIntent().getData() != null)
        {
            tvMessage.setText(getIntent().getData().toString());
        }
        else
        {
            tvMessage.setText("No Number given");
        }
    }
}
