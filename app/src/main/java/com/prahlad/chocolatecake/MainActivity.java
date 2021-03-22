package com.prahlad.chocolatecake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    WebView webcake;

    String pr_url = "file:///android_asset/index.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webcake = findViewById(R.id.cake);

        WebSettings websettings = webcake.getSettings();
        websettings.setJavaScriptEnabled(true);


        webcake.loadUrl(pr_url);
        Toast.makeText(MainActivity.this, "Order Please", Toast.LENGTH_LONG).show();




    }

    @Override
    public void onBackPressed() {
        if(webcake.canGoBack()) {
            webcake.goBack();
        } else {
            Toast.makeText(this, "Thank You! Visit Again!!!", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }
    }
}
