package com.example.sala_bd.taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myWebView = (WebView)findViewById(R.id.web);
        myWebView.loadUrl("http://www.google.com");
    }
}
