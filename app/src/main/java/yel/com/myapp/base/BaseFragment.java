package yel.com.myapp.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import yel.com.myapp.utils.LogUtil;
import yel.com.myapp.widget.CustomProgressDialog;
import yel.com.myapp.widget.GABottleLoadingView;

/**
 * Created by xxb on 2017/1/6.
 */

public abstract class BaseFragment extends Fragment {
    private View rootView;//缓存Fragment view
    protected String TAG = this.getClass().getSimpleName();
    protected Gson gson;
    private Unbinder unbinder;
    private CustomProgressDialog progressDialog;
    private GABottleLoadingView gaBottleLoadingView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (rootView == null) {
            rootView = inflater.inflate(setLayout(), null);
            unbinder = ButterKnife.bind(this, rootView);
            baseInit();
            init();
            netWrok();
            doelse();
            listen();
        } else {
            unbinder = ButterKnife.bind(this, rootView);
        }
        //缓存的rootView需要判断是否已经被加过parent， 如果有parent需要从parent删除，要不然会发生这个rootview已经有parent的错误。
        ViewGroup parent = (ViewGroup) rootView.getParent();
        if (parent != null) {
            parent.removeView(rootView);
        }
        return rootView;
    }


    public abstract int setLayout();

    protected abstract void init();

    protected abstract void netWrok();

    protected abstract void doelse();

    protected abstract void listen();


    private void baseInit() {
        gson = new Gson();
        progressDialog = new CustomProgressDialog(getActivity(), null);
        gaBottleLoadingView = new GABottleLoadingView(getActivity());
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
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    public void showMsgL(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
    }

    protected void bStartIntent(Class traget) {
        Intent intent = new Intent(getActivity(), traget);
        startActivity(intent);
    }

    protected void bStartIntentForResult(Class traget, int forResult) {
        Intent intent = new Intent(getActivity(), traget);
        startActivityForResult(intent, forResult);
    }

    public void bLogW(String msg) {
        LogUtil.logW(TAG, msg);
    }

    public void bLogE(String msg) {
        LogUtil.logW(TAG, msg);
    }

    private long currentTime;

    @Override
    public void startActivity(Intent intent) {
        if (System.currentTimeMillis() - currentTime < 1000) {
            currentTime = System.currentTimeMillis();
        } else {
            super.startActivity(intent);
        }
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        if (System.currentTimeMillis() - currentTime < 1000) {
            currentTime = System.currentTimeMillis();
        } else {
            super.startActivityForResult(intent, requestCode);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
