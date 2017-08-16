package com.example.sala_bd.taller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText user;
    Button boton;
    Button boton2;
    Button boton3;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button)findViewById(R.id.Bweb);
        user = (EditText) findViewById(R.id.name);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });

        spinner = (Spinner) findViewById(R.id.cursos);

        boton2 = (Button)findViewById(R.id.frame);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u = user.getText().toString();
                String nivel = (String) spinner.getSelectedItem();
                String enviar = u+" "+nivel;
                Intent intent = new Intent(getApplicationContext(),Main22Activity.class);
                intent.putExtra("todo",enviar);
                startActivity(intent);
            }
        });

        boton3 = (Button)findViewById(R.id.lista);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main23Activity.class);
                startActivity(intent);
            }
        });
    }




}
