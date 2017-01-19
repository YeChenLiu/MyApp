package yel.com.myapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

import com.ashokvarma.bottomnavigation.BadgeItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import yel.com.myapp.base.BaseActivity;
import yel.com.myapp.four.fragment.FourFragment;
import yel.com.myapp.one.fragment.OneFragment;
import yel.com.myapp.three.fragment.ThreeFragment;
import yel.com.myapp.two.fragment.TwoFragment;
import yel.com.myapp.utils.LogUtil;
import yel.com.myapp.widget.CustomFloatingButton;
import yel.com.myapp.widget.CustomProgressDialog;
import yel.com.myapp.widget.GABottleLoadingView;


public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener {


    @BindView(R.id.bottomNavigationBar)
    BottomNavigationBar bottomNavigationBar;
    @BindView(R.id.fabtn)
    CustomFloatingButton cFaBtn;
    private FragmentManager fm;
    private FragmentTransaction transaction;
    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private ThreeFragment threeFragment;
    private FourFragment fourFragment;
    private List<Fragment> list_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        //把布局往上拉 边界会出问题
//        bottomNavigationBar.setFab(cFaBtn);
        bottomNavigationBar.setTabSelectedListener(this);
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_SHIFTING);
        bottomNavigationBar
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.v_homepage, "主页").setActiveColorResource(R.color.yellow))
                .addItem(new BottomNavigationItem(R.drawable.v_content, "内容").setActiveColorResource(R.color.red))
                .addItem(new BottomNavigationItem(R.drawable.v_hotspot, "热点").setActiveColorResource(R.color.pink))
                .addItem(new BottomNavigationItem(R.drawable.v_personal, "个人").setActiveColorResource(R.color.greenDeep))
                .initialise();
        bottomNavigationBar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    bottomNavigationBar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    cFaBtn.setBottomHeight(bottomNavigationBar.getMeasuredHeight());
                }
            }
        });
        cFaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
//        GABottleLoadingView gaBottleLoadingView = new GABottleLoadingView(this);
//        gaBottleLoadingView.performAnimation();
//        CustomProgressDialog progressDialog = new CustomProgressDialog(this, null);
//        progressDialog.show();
        list_fragment = new ArrayList<>();
        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
        threeFragment = new ThreeFragment();
        fourFragment = new FourFragment();
        list_fragment.add(oneFragment);
        list_fragment.add(twoFragment);
        list_fragment.add(threeFragment);
        list_fragment.add(fourFragment);
        fm = getSupportFragmentManager();
        transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment_carrier, oneFragment).commit();
    }

    @Override
    public void netWrok() {

    }

    @Override
    public void doelse() {

    }

    @Override
    public void listen() {

    }

    @Override
    public void onTabSelected(int position) {
//        transaction = fm.beginTransaction();
//        switch (position) {
//            case 0:
//                transaction.replace(R.id.fragment_carrier, oneFragment);
//                break;
//            case 1:
//                transaction.replace(R.id.fragment_carrier, twoFragment);
//                break;
//            case 2:
//                transaction.replace(R.id.fragment_carrier, threeFragment);
//                break;
//            case 3:
//                transaction.replace(R.id.fragment_carrier, fourFragment);
//                break;
//        }
//        transaction.commit();
        bLogW(position + "!");
        if (list_fragment != null) {
            if (position < list_fragment.size()) {
                Fragment fragment = list_fragment.get(position);
                transaction = fm.beginTransaction();
                if (fragment.isAdded()) {
                    transaction.replace(R.id.fragment_carrier, fragment);
                } else {
                    transaction.add(R.id.fragment_carrier, fragment);
                }
                transaction.commitAllowingStateLoss();
            }
        }
    }

    @Override
    public void onTabUnselected(int position) {
        if (list_fragment != null) {
            if (position < list_fragment.size()) {
                transaction = fm.beginTransaction();
                Fragment fragment = list_fragment.get(position);
                transaction.remove(fragment);
                transaction.commitAllowingStateLoss();
            }
        }
    }

    @Override
    public void onTabReselected(int position) {

    }
}
