package com.example.monidome1.util;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.monidome1.Activity.WebViewActivity;

public class JumpWebUtils {
    public static void startWebView(Context context, String title, String url){
        Intent intent = new Intent();
        intent.setClass(context, WebViewActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("url", url);
        Log.e("hhhhh+++", "startWebView: "+url );
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public static void startWebView(Context context, String title, String url, int articleId, boolean isCollect){
        Intent intent = new Intent();
        intent.setClass(context, WebViewActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("url", url);
        intent.putExtra("articleid", articleId);
        intent.putExtra("iscollect", isCollect);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
