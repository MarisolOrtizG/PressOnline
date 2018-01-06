package com.example.andreina.mpressonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView miweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configurarPagina();
    }

    private void configurarPagina(){

       miweb = (WebView) findViewById(R.id.miViewID);
        WebSettings misetting =  miweb.getSettings();
        misetting.setJavaScriptEnabled(true);
        miweb.loadUrl("http://www.google.com/");
        miweb.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {

        if(miweb.canGoBack())
            miweb.goBack();
        else
                super.onBackPressed();
    }
}
