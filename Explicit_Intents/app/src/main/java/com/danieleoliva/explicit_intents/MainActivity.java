package com.danieleoliva.explicit_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnActivity2, btnActivity3;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        etName = (EditText) findViewById(R.id.etName);
        tvMessage = (TextView) findViewById(R.id.tvMessage);

        btnActivity2 = (Button) findViewById(R.id.btnActivity2);
        btnActivity3 = (Button) findViewById(R.id.btnActivity3);

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = etName.getText().toString().trim();
                //.trim trims whitespace

                Intent intent = new Intent(MainActivity.this, com.danieleoliva.explicit_intents.Activity2.class
                );

                intent.putExtra("username", name);
                //name and value of data are passed through

                startActivity(intent);
                //this takes us to activity 2
            }
        });

        btnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
