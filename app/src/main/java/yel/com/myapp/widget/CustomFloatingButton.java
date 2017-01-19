package yel.com.myapp.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;


import yel.com.myapp.utils.LogUtil;

/**
 * Created by xxb on 2017/1/9.
 */

public class CustomFloatingButton extends FloatingActionButton {
    private int lastX;
    private int lastY;
    private Context context;
    private int bottomHeight;
    private int margin;
    private int tLeft;
    private int tTop;
    private int tRight;
    private int tBottom;

    public CustomFloatingButton(Context context) {
        super(context);

        init(context, null, 0);
    }

    public CustomFloatingButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CustomFloatingButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        this.context = context;
        margin = dp2px(5);
    }


    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        int x = (int) ev.getX();
        int y = (int) ev.getY();
        int offX = 0;
        int offY = 0;
        int action = ev.getAction();
        ViewGroup.MarginLayoutParams marginLP = new ViewGroup.MarginLayoutParams(getLayoutParams());
        ViewGroup.LayoutParams lp;
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
//                LogUtil.logE("aa", getX() + "\n" + getRotationX() + "\n" + getPivotX() + "\n" + getScaleX() + "\n" + getScrollX() + "\n" + getTranslationX());
                break;
            case MotionEvent.ACTION_MOVE:
                offX = x - lastX;
                offY = y - lastY;

//                ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) getLayoutParams();
//                mlp.leftMargin = getLeft() + offX;
//                mlp.topMargin = getTop() + offY;
//                setLayoutParams(mlp);
//                layout(getLeft() + offX, getTop() + offY, getRight() + offX, getBottom() + offY);
//            对左右移动和上下移动的封装，传入的就是偏移量。
                offsetLeftAndRight(offX);
                offsetTopAndBottom(offY);
//            sceollTo(x,y)传入的应该是移动的终点坐标
//            scrollBy(dx,dy)传入的是移动的增量。
//            通过scrollBy传入的值应该是你需要的那个增量的相反数！
//            ((View) getParent()).scrollBy(-offX, -offY);
//                LogUtil.logE("aa", offX + "");
//                LogUtil.logE("aa", offY + "");
                break;
            case MotionEvent.ACTION_UP:
                //右边边境
                if (getX() + getMeasuredWidth() > getScreenWidth()) {
                    layout(getScreenWidth() - getMeasuredWidth() - margin, getTop(), getScreenWidth() - margin, getBottom());
                }
                //左边边境
                if (getX() < 0) {
                    layout(margin, getTop(), getMeasuredWidth() + margin, getBottom());
                }
                //上面边境
                if (getY() < 0) {
                    layout(getLeft(), margin, getRight(), getMeasuredHeight() + margin);
                }
                //下面边境
                if (getY() + bottomHeight + getMeasuredHeight() > getScreenHeight()) {
                    layout(getLeft(), getScreenHeight() - getMeasuredHeight() - bottomHeight - margin, getRight(), getScreenHeight() - bottomHeight - margin);
                }
                marginLP.leftMargin = getLeft();
                marginLP.topMargin = getTop();
                lp = new CoordinatorLayout.LayoutParams(marginLP);
                setLayoutParams(lp);
                break;
        }
        return super.onTouchEvent(ev);
    }


    public void setBottomHeight(int bottomHeight) {
        this.bottomHeight = bottomHeight;
    }

    /**
     * 获取屏幕的宽度（单位：px）
     *
     * @return 屏幕宽px
     */
    private int getScreenWidth() {
        screenInit();
        return dm.widthPixels;
    }

    /**
     * 获取屏幕的高度（单位：px）
     *
     * @return 屏幕高px
     */
    private int getScreenHeight() {
        screenInit();
        return dm.heightPixels - getStateHeight();
    }

    /**
     * 获取状态栏
     *
     * @return
     */
    private int getStateHeight() {
        int statusBarHeight1 = 50;
        //获取status_bar_height资源的ID
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            //根据资源ID获取响应的尺寸值
            statusBarHeight1 = getResources().getDimensionPixelSize(resourceId);
        }
        return statusBarHeight1;
    }

    private DisplayMetrics dm;

    private void screenInit() {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        dm = new DisplayMetrics();// 创建了一张白纸
        windowManager.getDefaultDisplay().getMetrics(dm);// 给白纸设置宽高
    }


    /**
     * dp转px
     */
    private int dp2px(float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
