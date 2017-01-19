package yel.com.myapp.one.fragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.target.Target;
import com.lzy.okgo.OkGo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bingoogolapple.bgabanner.BGABanner;
import okhttp3.Call;
import okhttp3.Response;
import yel.com.myapp.R;
import yel.com.myapp.base.BaseFragment;
import yel.com.myapp.glide.progress.ProgressTarget;
import yel.com.myapp.module.ConstellationModel;
import yel.com.myapp.module.OneFModel;
import yel.com.myapp.net.Api;
import yel.com.myapp.net.call.DialogCallback;
import yel.com.myapp.net.response.HistoryToDayResponse;
import yel.com.myapp.net.response.JestResponse;
import yel.com.myapp.net.response.NewsResponse;
import yel.com.myapp.one.adapter.OneFAdapter;
import yel.com.myapp.utils.LayoutParamsUtils;
import yel.com.myapp.widget.CustomProgressDialog;
import yel.com.myapp.widget.GABottleLoadingView;

/**
 * Created by xxb on 2017/1/6.
 */

public class OneFragment extends BaseFragment {
    //    @BindView(R.id.banner)
//    BGABanner banner;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    private OneFAdapter oneFAdapter;
    private Map<Integer, OneFModel> mapData;
    private String constellationName;


    @Override
    public int setLayout() {
        return R.layout.fragment_one;
    }


    @Override
    protected void init() {

        List<String> listImage = new ArrayList<>();
        listImage.add("http://inthecheesefactory.com/uploads/source/nestedfragment/fragments.png");
        listImage.add("http://pic109.nipic.com/file/20160914/4516668_215919019000_2.jpg");
        listImage.add("http://pic108.nipic.com/file/20160901/4516668_210829551000_2.jpg");
        listImage.add("http://pic109.nipic.com/file/20160909/4516668_153420589000_2.jpg");
        List<String> tittle = new ArrayList<>();
        tittle.add("aaa");
        tittle.add("bbb");
        tittle.add("ccc");
        tittle.add("ddd");


        mapData = new HashMap<>();
        oneFAdapter = new OneFAdapter(getActivity(), listImage, tittle, mapData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(oneFAdapter);
    }

    @Override
    protected void netWrok() {
        constellationName();
        OkGo.post(Api.constellation)
                .tag(this)
                .params("key", Api.constellationKey)
                .params("consName", constellationName)      //星座名称，如:双鱼座
                .params("type", "today")          //运势类型：today,tomorrow,week,nextweek,month,year
                .execute(new DialogCallback<ConstellationModel>(getActivity(), ConstellationModel.class) {
                    @Override
                    public void onSuccess(ConstellationModel constellationModel, Call call, Response response) {
                        if (constellationModel != null) {
                            OneFModel oneFModel1 = new OneFModel();
                            oneFModel1.setConstellationModel(constellationModel);
                            mapData.put(0, oneFModel1);
                            oneFAdapter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        bLogE(e.toString());
                    }
                });
        OkGo.post(Api.today)
                .tag(this)
                .params("key", Api.todayKey)
                .params("v", "1.0")        //版本，当前：1.0
                .params("month", "10")     //月份，如：10
                .params("day", "1")        //日，如：1
                .execute(new DialogCallback<HistoryToDayResponse>(getActivity(), HistoryToDayResponse.class) {
                    @Override
                    public void onSuccess(HistoryToDayResponse historyToDayResponse, Call call, Response response) {
                        if (!historyToDayResponse.getResult().isEmpty()) {
                            OneFModel oneFModel2 = new OneFModel();
                            oneFModel2.setHistoryToDayModle(historyToDayResponse.getResult().get(0));
                            mapData.put(1, oneFModel2);
                            oneFAdapter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        bLogE(e.toString());
                    }
                });
        String time = System.currentTimeMillis() + "";
        OkGo.get(Api.jest)
                .tag(this)
                .params("key", Api.jestKey)
                .params("sort", "desc")        // desc:指定时间之前发布的，asc:指定时间之后发布的
                .params("page", "1")          //当前页数,默认1
                .params("pagesize", "20")       //每次返回条数,默认1,最大20
                .params("time", time.substring(0, 10))           //时间戳
                .execute(new DialogCallback<JestResponse>(getActivity(), JestResponse.class) {
                    @Override
                    public void onSuccess(JestResponse jestResponse, Call call, Response response) {
                        if (jestResponse.getResult() != null) {
                            OneFModel oneFModel3 = new OneFModel();
                            oneFModel3.setListJesk(jestResponse.getResult().getData());
                            mapData.put(2, oneFModel3);
                            oneFAdapter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        bLogE(e.toString());
                    }
                });
        OkGo.post(Api.news)
                .tag(this)
                .params("key", Api.newsKey)
                .params("type", "top")    //top(头条，默认),shehui(社会),guonei(国内),guoji(国际),yule(娱乐),tiyu(体育)
                // junshi(军事),keji(科技),caijing(财经),shishang(时尚)
                .execute(new DialogCallback<NewsResponse>(getActivity(), NewsResponse.class) {
                    @Override
                    public void onSuccess(NewsResponse newsResponse, Call call, Response response) {
                        if (!newsResponse.getResult().getData().isEmpty()) {
                            OneFModel oneFModel4 = new OneFModel();
                            oneFModel4.setListNews(newsResponse.getResult().getData());
                            mapData.put(3, oneFModel4);
                            oneFAdapter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        bLogE(e.toString());
                    }
                });
    }

    private void constellationName() {
        int intConstellation = (int) (Math.random() * (11 - 0 + 1));
        String arrayConstellation[] = new String[]{"白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座", "水瓶座", "双鱼座"};
        constellationName = arrayConstellation[intConstellation];
        oneFAdapter.setConstellationName(constellationName);
    }

    @Override
    protected void doelse() {

    }

    @Override
    protected void listen() {

    }

}
