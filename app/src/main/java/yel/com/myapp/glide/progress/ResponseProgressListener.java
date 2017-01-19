package yel.com.myapp.glide.progress;

import okhttp3.HttpUrl;

/**
 * Created by xxb on 2017/1/11.
 */

public interface ResponseProgressListener {
    void update(HttpUrl url, long bytesRead, long contentLength);
}
