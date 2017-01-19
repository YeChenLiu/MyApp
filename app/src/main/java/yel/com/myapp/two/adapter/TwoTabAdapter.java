package yel.com.myapp.two.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import yel.com.myapp.R;

/**
 * Created by xxb on 2017/1/9.
 */

public class TwoTabAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    private Context context;
    private int title[] = new int[]{R.string.two_0, R.string.two_1, R.string.two_2, R.string.two_3, R.string.two_4, R.string.two_5, R.string.two_6, R.string.two_7, R.string.two_8, R.string.two_9, R.string.two_10};
    private int image[] = new int[]{};

    public TwoTabAdapter(FragmentManager fm, List<Fragment> list, Context context) {
        super(fm);
        this.list = list;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
//        Drawable drawable = context.getResources().getDrawable(imageAr[position]);
//        drawable.setBounds(0, 0, 20, 20);
////        Log.e(TAG,"drawable.getIntrinsicWidth()="+drawable.getIntrinsicWidth());
////        Log.e(TAG,"drawable.getIntrinsicHeight()="+drawable.getIntrinsicHeight());
//        SpannableString spannableString = new SpannableString("   " + tabTitle[position]);
//        ImageSpan imageSpan = new ImageSpan(drawable, ImageSpan.ALIGN_BASELINE);
//        spannableString.setSpan(imageSpan, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        String str = context.getString(title[position]);
        return str;
    }

//    public View getTabView(int position) {
//        View view = LayoutInflater.from(context).inflate(R.layout.tablayout_tab, null);
//        ImageView img = (ImageView) view.findViewById(R.id.img);
//        img.setImageResource(imageAr[position]);
//        TextView tv = (TextView) view.findViewById(R.id.tv);
//        tv.setText(tabTitle[position]);
//        return view;
//    }
}
