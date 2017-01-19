package yel.com.myapp.glide.progress;

/**
 * Created by xxb on 2017/1/11.
 */

import android.content.Context;

import com.bumptech.glide.load.model.GenericLoaderFactory;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;

import java.io.InputStream;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/**
 * The default factory for {@link OkHttpUrlLoader}s.
 */
public class Factory implements ModelLoaderFactory<GlideUrl, InputStream> {
    private static volatile Call.Factory internalClient;
    private Call.Factory client;

    /**
     * Constructor for a new Factory that runs requests using a static singleton client.
     */
    public Factory() {
        this(getInternalClient());
    }

    /**
     * Constructor for a new Factory that runs requests using given client.
     *
     * @param client this is typically an instance of {@code OkHttpClient}.
     */
    public Factory(Call.Factory client) {
        this.client = client;
    }

    private static Call.Factory getInternalClient() {
        if (internalClient == null) {
            synchronized (Factory.class) {
                if (internalClient == null) {
                    internalClient = new OkHttpClient();
                }
            }
        }
        return internalClient;
    }

    @Override
    public ModelLoader<GlideUrl, InputStream> build(Context context, GenericLoaderFactory factories) {
        return new OkHttpUrlLoader(client);
    }

    @Override
    public void teardown() {
        // Do nothing, this instance doesn't own the client.
    }
}