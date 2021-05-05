package com.example.monidome1.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.monidome1.R;

public class WebViewActivity extends AppCompatActivity{
    private LinearLayout linearLayout;
    private WebView mwebView;
    private  String mtitle;
    private  String murl;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        getIntentinfo();
        mwebView = findViewById(R.id.webview);
        mwebView.getSettings().setJavaScriptEnabled(true);
        mwebView.setWebViewClient(new WebViewClient());
        mwebView.loadUrl(murl);

//        linearLayout = (LinearLayout) findViewById(R.id.web_content);
//        mAgentWeb = AgentWeb.with(this)
//                .setAgentWebParent(mLinearLayout, new LinearLayout.LayoutParams(-1, -1))
//                .useDefaultIndicator()
//                .createAgentWeb()
//                .ready()
//                .go(mUrl);
    }
    private void getIntentinfo(){
        Intent intent = getIntent();
         mtitle = intent.getStringExtra("title");
         murl = intent.getStringExtra("url");
        Log.e("传输的url", "getIntentinfo: "+murl);
    }


}
