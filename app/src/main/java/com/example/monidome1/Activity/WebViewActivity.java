package com.example.monidome1.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.monidome1.R;

import java.lang.reflect.Method;

public class WebViewActivity extends AppCompatActivity{
    private LinearLayout linearLayout;
    private WebView mwebView;
    private String mtitle;
    private TextView webtitle;
    private Toolbar toolbar;
    private  String murl;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        getIntentinfo();
        setToolbar();

        mwebView = findViewById(R.id.webview);
        mwebView.getSettings().setJavaScriptEnabled(true);
        mwebView.setWebViewClient(new WebViewClient());
        mwebView.loadUrl(murl);

    }

    /**
     *
     * 加载menu布局页面
     *
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }



    private void getIntentinfo(){
        Intent intent = getIntent();
         mtitle = intent.getStringExtra("title");
         murl = intent.getStringExtra("url");
        Log.e("传输的url", "getIntentinfo: "+murl);
    }

    private void setToolbar(){
        webtitle = findViewById(R.id.web_title);
        toolbar = findViewById(R.id.web_toolbar);
//        toolbar.setNavigationIcon(R.drawable.ic_back1);
        this.setSupportActionBar(toolbar);
        toolbar.setTitle(mtitle);
//        toolbar.inflateMenu(R.menu.menu_toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        webtitle.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        webtitle.setSingleLine(true);
        webtitle.setSelected(true);
        webtitle.setFocusable(true);
        webtitle.setFocusableInTouchMode(true);
        webtitle.setText(mtitle);
//        this.getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }



    /**
     * 让icon和title同时显示出来
     * @param featureId
     * @param menu
     * @return
     */
    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        if (menu != null) {
            if (menu.getClass().getSimpleName().equalsIgnoreCase("MenuBuilder")) {
                try {
                    Method method = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
                    method.setAccessible(true);
                    method.invoke(menu, true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return super.onMenuOpened(featureId, menu);
    }





}
