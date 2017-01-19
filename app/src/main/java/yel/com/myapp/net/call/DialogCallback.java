package yel.com.myapp.net.call;

import android.app.Activity;
import android.support.annotation.Nullable;

import com.google.gson.Gson;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.request.BaseRequest;

import java.lang.reflect.Type;

import okhttp3.Call;
import okhttp3.Response;
import yel.com.myapp.widget.CustomProgressDialog;
import yel.com.myapp.widget.GABottleLoadingView;

/**
 * Created by xxb on 2017/1/16.
 */

public abstract class DialogCallback<T> extends AbsCallback<T> {
    private CustomProgressDialog dialog;
    private Gson gson;
    private Class clas;

    private void init(Activity activity, Class clas) {
        this.clas = clas;
        dialog = new CustomProgressDialog(activity, "");
        gson = new Gson();
    }

    public DialogCallback(Activity activity, Class clas) {
        init(activity, clas);
    }

    @Override
    public void onBefore(BaseRequest request) {
        super.onBefore(request);
        if (dialog != null) {
            dialog.show();
        }

    }

    @Override
    public void onAfter(@Nullable T t, @Nullable Exception e) {
        super.onAfter(t, e);
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override
    public T convertSuccess(Response response) throws Exception {
        T t = (T) gson.fromJson(response.body().string(), clas);
        return t;
    }
}
