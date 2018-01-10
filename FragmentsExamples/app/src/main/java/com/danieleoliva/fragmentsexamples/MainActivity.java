package com.danieleoliva.fragmentsexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements ListFrag.ChessPieceListener {

    TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        tvDetails = (TextView) findViewById(R.id.tvDetails);

    }

    @Override
    public void onChessPieceSelected(int index) {

        String [] descriptions = getResources().getStringArray(R.array.descriptions);

        tvDetails.setText(descriptions[index]);

    }
}
