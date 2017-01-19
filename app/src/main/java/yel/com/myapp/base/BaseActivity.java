package yel.com.myapp.base;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.gson.Gson;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import yel.com.myapp.R;
import yel.com.myapp.utils.LogUtil;
import yel.com.myapp.widget.CustomProgressDialog;
import yel.com.myapp.widget.GABottleLoadingView;

/**
 * Created by xxb on 2017/1/5.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected String TAG = this.getClass().getSimpleName();
    protected Gson gson;
    private CustomProgressDialog progressDialog;
    private GABottleLoadingView gaBottleLoadingView;
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        unbinder = ButterKnife.bind(this);
        baseInit();
        init();
        netWrok();
        doelse();
        listen();
    }

    public abstract int setLayout();

    public abstract void init();

    public abstract void netWrok();

    public abstract void doelse();

    public abstract void listen();

    private void baseInit() {
        ButterKnife.bind(this);
        gson = new Gson();
        progressDialog = new CustomProgressDialog(this, null);
        gaBottleLoadingView = new GABottleLoadingView(this);
    }


    public void showProgressDialog() {
//        progressDialog.show();
        gaBottleLoadingView.performAnimation();
    }

    public void dismissProgressDialog() {
        gaBottleLoadingView.cancel();
//        progressDialog.dismiss();
    }

    protected void setProgressDialogMsg(String msg) {
        progressDialog.setMsg(msg);
    }

    public void showMsgS(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void showMsgL(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    protected void bStartIntent(Class traget) {
        Intent intent = new Intent(this, traget);
        startActivity(intent);
    }

    protected void bStartIntentForResult(Class traget, int forResult) {
        Intent intent = new Intent(this, traget);
        startActivityForResult(intent, forResult);
    }

    public void bLogW(String msg) {
        LogUtil.logW(TAG, msg);
    }

    private long currentTime;

//    @Override
//    public void startActivity(Intent intent) {
//        if (System.currentTimeMillis() - currentTime < 1000) {
//            currentTime = System.currentTimeMillis();
//        } else {
//            super.startActivity(intent);
//        }
//    }
//
//    @Override
//    public void startActivityForResult(Intent intent, int requestCode) {
//        if (System.currentTimeMillis() - currentTime < 1000) {
//            currentTime = System.currentTimeMillis();
//        } else {
//            super.startActivityForResult(intent, requestCode);
//        }
//    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
