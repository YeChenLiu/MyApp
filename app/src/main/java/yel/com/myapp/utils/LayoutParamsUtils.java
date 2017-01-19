package yel.com.myapp.utils;

import android.support.annotation.FloatRange;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import yel.com.myapp.MyApplication;

/**
 * Created by xxb on 2017/1/10.
 */

public class LayoutParamsUtils {
    /**
     * @param view
     * @param wPercent 0不变 其他事屏幕的百分之 0-1
     * @param hPercent 0不变 其他事屏幕的百分之 0-1
     */
    public static void rLPScreen(View view, @FloatRange(from = 0, to = 1) float wPercent, @FloatRange(from = 0, to = 1) float hPercent) {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        if (hPercent > 0) {
            int screenHeight = ScreenUtils.getScreenHeight(MyApplication.getInstance());
            params.height = (int) (screenHeight * hPercent + 0.5f);
        }
        if (wPercent > 0) {
            int screenWidth = ScreenUtils.getScreenWidth(MyApplication.getInstance());
            params.width = (int) (screenWidth * wPercent + 0.5f);
        }
        view.setLayoutParams(params);
    }

    public static void rLPWwScreen(View view, @FloatRange(from = 0, to = 1) float wPercent, @FloatRange(from = 0, to = 1) float hPercent) {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        int screenWidth = ScreenUtils.getScreenWidth(MyApplication.getInstance());
        if (hPercent > 0) {
            params.height = (int) (screenWidth * hPercent + 0.5f);
        }
        if (wPercent > 0) {
            params.width = (int) (screenWidth * wPercent + 0.5f);
        }
        view.setLayoutParams(params);
    }

    /**
     * @param view
     * @param wPercent 0不变 其他事屏幕的百分之 0-1
     * @param hPercent 0不变 其他事屏幕的百分之 0-1
     */
    public static void lLPScreen(View view, float wPercent, float hPercent) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        if (hPercent > 0) {
            int screenHeight = ScreenUtils.getScreenHeight(MyApplication.getInstance());
            params.height = (int) (screenHeight * hPercent + 0.5);
        }
        if (wPercent > 0) {
            int screenWidth = ScreenUtils.getScreenWidth(MyApplication.getInstance());
            params.width = (int) (screenWidth * wPercent + 0.5f);
        }
        view.setLayoutParams(params);
    }
}
