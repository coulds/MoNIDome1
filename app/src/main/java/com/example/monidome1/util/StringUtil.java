package com.example.monidome1.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.util.TypedValue;

import androidx.core.content.ContextCompat;

import com.example.monidome1.R;

public class StringUtil {

    public static boolean isEmpty(String str){
        if (str ==null || str.length()<=0){
            return true;
        }else {
            return false;
        }
    }

    public static int dpToPx(Context context, int dp) {
        float density;
        density = context.getResources().getDisplayMetrics().density;
        return Math.round((float) dp * density);
    }

    public static int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        int height = resources.getDimensionPixelSize(resourceId);
        return height;
    }
    public static int getActionBarHeight(Context context) {
        TypedValue tv = new TypedValue();
        int actionBarHeight = 0;
        if (context.getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true)) {
            actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data, context.getResources().getDisplayMetrics());
        }
        return actionBarHeight;
    }

    public static int getColor(Context context) {
        SharedPreferences setting = PreferenceManager.getDefaultSharedPreferences(context);
        int defaultColor = ContextCompat.getColor(context, R.color.colorPrimary);
        int color = setting.getInt("color", defaultColor);
        if (color != 0 && Color.alpha(color) != 255) {
            return defaultColor;
        } else {
            return color;
        }
    }
}
