package yel.com.myapp.widget;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.Nullable;
import android.widget.ProgressBar;
import android.widget.TextView;

import yel.com.myapp.R;


/**
 * Created by xxb on 2016/12/23.
 */

public class CustomProgressDialog {
    private Dialog dialog;
    private Activity activity;
    private String tag;
    private ProgressBar progressBar;
    private TextView tv_msg;
    private GABottleLoadingView bottleLoadingView;

    public CustomProgressDialog(Activity activity, @Nullable String tag) {
        this.tag = tag;
        this.activity = activity;

        dialog = new Dialog(activity, R.style.Translucent_NoTitle);
        dialog.setContentView(R.layout.dialog_progress_custom);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
//        progressBar = (ProgressBar) dialog.findViewById(R.id.progressBar);
        bottleLoadingView = (GABottleLoadingView) dialog.findViewById(R.id.bottleLoadingView);
        tv_msg = (TextView) dialog.findViewById(R.id.tv_msg);
    }

    public void setCancelable(boolean isopen) {
        dialog.setCancelable(isopen);
    }

    public void setCanceledOnTouchOutside(boolean isopen) {
        dialog.setCanceledOnTouchOutside(isopen);
    }

    public void setMsg(CharSequence msg) {
        if (dialog != null && !dialog.isShowing()) {
            tv_msg.setText(msg);
        }
    }

    public void show() {
        if (dialog != null && !dialog.isShowing()) {
            bottleLoadingView.performAnimation();
            dialog.show();
        }
    }

    public void dismiss() {
        if (dialog != null && dialog.isShowing()) {
            bottleLoadingView.cancel();
            dialog.dismiss();
        }
    }
}
