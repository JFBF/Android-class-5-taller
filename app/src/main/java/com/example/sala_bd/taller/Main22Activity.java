package com.example.sala_bd.taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity {
    TextView TEXTO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        String login = getIntent().getStringExtra("todo");
        TEXTO = (TextView) findViewById(R.id.fiboTextView);
        TEXTO.setText(login);


    }
}
