package com.codepath.android.themeswitcher.app;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

public class Utils {
    private static int sTheme;
    public static final String TAG = "Utils";

    public final static int THEME_MATERIAL_LIGHT = 0;
    public final static int THEME_BULLDOGS = 1;

    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
            case THEME_MATERIAL_LIGHT:
                activity.setTheme(R.style.Theme_Material_Light);
                Log.i(TAG, "we have theme material light turned on");
                break;
            case THEME_BULLDOGS:
                activity.setTheme(R.style.Theme_Bulldogs);
                Log.i(TAG, "we have theme bulldogs turned on");
                break;
        }
    }
}
