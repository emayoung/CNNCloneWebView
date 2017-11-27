package com.example.root.samepagewebapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private String postUrl = "http://edition.cnn.com/";
    private WebView webView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        progressBar = findViewById(R.id.progressBar);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(postUrl);
        webView.setHorizontalScrollBarEnabled(false);

    }
}
