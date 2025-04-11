package com.example.myfit;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // open within app

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // enable JS if used in your web app

        webView.loadUrl("https://just-a-engineer.netlify.app/"); // <- replace with your actual web app URL
    }

    // Back button should go to previous web page
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
