package yel.com.myapp.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.IntRange;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.ImageView;

import yel.com.myapp.R;

/**
 * Created by xxb on 2017/1/11.
 */

public class PieImageView extends ImageView {
    private final int MAX_PROGRESS = 100;
    private Paint paintArc;
    private Paint paintCir;
    private int mProgress = 0;
    private RectF mBound;

    public PieImageView(Context context) {
        this(context, null, 0);
    }

    public PieImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PieImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        // 构建Paint时直接加上去锯齿属性
        paintArc = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintArc.setStyle(Paint.Style.FILL_AND_STROKE);
        paintArc.setStrokeWidth(dp2px(0.5f));
        paintArc.setColor(ContextCompat.getColor(getContext(), R.color.blue));

        paintCir = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintCir.setStyle(Paint.Style.STROKE);
        paintCir.setStrokeWidth(dp2px(2));
        paintCir.setColor(ContextCompat.getColor(getContext(), R.color.white));

        mBound = new RectF();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int min = Math.min(w, h);
        int max = w + h - min;
        int r = min / 5;
        mBound.set(max / 2 - r, min / 2 - r, max / 2 + r, min / 2 + r);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mProgress >= 98 && mProgress != 0) {
            canvas.drawArc(mBound, 270, 360, true, paintArc);
            setVisibility(GONE);
        } else if (mProgress != MAX_PROGRESS && mProgress != 0) {
            float mAngle = mProgress * 360f / MAX_PROGRESS;
            canvas.drawArc(mBound, 270, mAngle, true, paintArc);
//            canvas.drawCircle(mBound.centerX(), mBound.centerY(), mBound.height() / 2, paintCir);
        }
    }

    public void setProgress(@IntRange(from = 0, to = MAX_PROGRESS) int mProgress) {
        this.mProgress = mProgress;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /**
     * dp转px
     */
    private int dp2px(float dpValue) {
        final float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
