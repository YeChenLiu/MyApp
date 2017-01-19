package yel.com.myapp.utils;

import android.util.Log;

/**
 * Created by xxb on 2016/12/13.
 */

public class LogUtil {
    public static void logE(String tag, String content) {
        int p = 2000;
        long length = content.length();
        if (length < p || length == p)
            Log.e(tag, content);
        else {
            while (content.length() > p) {
                String logContent = content.substring(0, p);
                content = content.replace(logContent, "");
                Log.e(tag, logContent);
            }
            Log.e(tag, content);
        }
    }

    public static void logW(String tag, String content) {
        int p = 2000;
        long length = content.length();
        if (length < p || length == p)
            Log.w(tag, content);
        else {
            while (content.length() > p) {
                String logContent = content.substring(0, p);
                content = content.replace(logContent, "");
                Log.w(tag, logContent);
            }
            Log.w(tag, content);
        }
    }

}
