package yel.com.myapp.two.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import yel.com.myapp.R;
import yel.com.myapp.base.BaseFragment;
import yel.com.myapp.two.adapter.TwoTabAdapter;

/**
 * Created by xxb on 2017/1/6.
 */

public class TwoFragment extends BaseFragment {
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private TwoTabAdapter twoTabAdapter;
    private List list_fragment;


    @Override
    protected void init() {
        list_fragment = new ArrayList();
        TopFragment TopFragment1 = new TopFragment();
        list_fragment.add(TopFragment1);
        TopFragment TopFragment2 = new TopFragment();
        list_fragment.add(TopFragment2);
        TopFragment TopFragment3 = new TopFragment();
        list_fragment.add(TopFragment3);
        TopFragment TopFragment4 = new TopFragment();
        list_fragment.add(TopFragment4);
        TopFragment TopFragment5 = new TopFragment();
        list_fragment.add(TopFragment5);
        TopFragment TopFragment6 = new TopFragment();
        list_fragment.add(TopFragment6);
        TopFragment TopFragment7 = new TopFragment();
        list_fragment.add(TopFragment7);
        TopFragment TopFragment8 = new TopFragment();
        list_fragment.add(TopFragment8);
        TopFragment TopFragment9 = new TopFragment();
        list_fragment.add(TopFragment9);
        TopFragment TopFragment10 = new TopFragment();
        list_fragment.add(TopFragment10);
        twoTabAdapter = new TwoTabAdapter(getFragmentManager(), list_fragment, getActivity());
        viewPager.setAdapter(twoTabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_two;
    }

    @Override
    protected void netWrok() {

    }

    @Override
    protected void doelse() {

    }

    @Override
    protected void listen() {

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("position", tabLayout.getSelectedTabPosition());
    }
}
