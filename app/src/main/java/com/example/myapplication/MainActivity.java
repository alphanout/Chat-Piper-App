package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView =  findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        myWebView.loadUrl("http://chat-piper-v2.herokuapp.com/");

        myWebView.setWebViewClient(new WebViewClient());
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.myWebView.canGoBack()) {
            this.myWebView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}
