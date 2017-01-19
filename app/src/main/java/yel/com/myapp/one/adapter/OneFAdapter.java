package yel.com.myapp.one.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.target.Target;

import java.util.List;
import java.util.Map;

import cn.bingoogolapple.bgabanner.BGABanner;
import yel.com.myapp.R;
import yel.com.myapp.base.RBaseadapter;
import yel.com.myapp.glide.progress.ProgressTarget;
import yel.com.myapp.module.ConstellationModel;
import yel.com.myapp.module.HistoryToDayModle;
import yel.com.myapp.module.JestModel;
import yel.com.myapp.module.NewsModel;
import yel.com.myapp.module.OneFModel;
import yel.com.myapp.one.fragment.OneFragment;
import yel.com.myapp.ui.NewsActivity;
import yel.com.myapp.utils.LayoutParamsUtils;
import yel.com.myapp.utils.LogUtil;
import yel.com.myapp.utils.StringUtils;

/**
 * Created by xxb on 2017/1/16.
 */

public class OneFAdapter extends RecyclerView.Adapter<OneFAdapter.OneFViewHolder> implements BGABanner.Adapter<ImageView, String> {
    private Map<Integer, OneFModel> map;
    private Activity activity;
    private String constellationName;
    private List listImage;
    private List listTitle;
    private String url;

    public OneFAdapter(Activity activity, List listImage, List listTitle, Map map) {
        this.activity = activity;
        this.map = map;
        this.listImage = listImage;
        this.listTitle = listTitle;
    }

    @Override
    public OneFViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        OneFViewHolder holder = new OneFViewHolder(LayoutInflater.from(activity).inflate(R.layout.recyclerview_onefragment, parent, false));
        return holder;
    }

    @Override
    public int getItemCount() {
        int size = 0;
        for (int i = 0; i < map.size(); i++) {
            OneFModel model = map.get(i);
            if (model == null) {
                continue;
            }
            switch (i) {
                case 0:
                    size += model.getConstellationModel() == null ? 0 : 1;
                    break;
                case 1:
                    size += model.getHistoryToDayModle() == null ? 0 : 1;
                    break;
                case 2:
                    size += model.getListJesk() == null ? 0 : 20;
                    break;
                case 3:
                    size += model.getListNews() == null ? 0 : 20;
                    break;
            }
        }
        return size + 1;
    }

    @Override
    public void onBindViewHolder(OneFViewHolder holder, int position) {
        if (position == 0) {
            holder.banner.setVisibility(View.VISIBLE);
            holder.rl_list.setVisibility(View.GONE);
            holder.banner.setAdapter(this);
            holder.banner.setData(listImage, listTitle);
            LayoutParamsUtils.lLPScreen(holder.banner, 0, 0.35f);
        } else if (position == 1) {
            if (map.get(0) == null) {
                return;
            }
            ConstellationModel constellationModel = map.get(0).getConstellationModel();
            if (constellationModel == null) {
                holder.ll.setVisibility(View.GONE);
                return;
            }
            tvSeTting(holder, constellationName.substring(0, 2) + "配" + constellationModel.getQFriend().substring(0, 2), "今日", constellationModel.getSummary());
        } else if (position == 2) {
            if (map.get(1) == null) {
                return;
            }
            HistoryToDayModle historyToDayModle = map.get(1).getHistoryToDayModle();
            if (historyToDayModle == null) {
                holder.ll.setVisibility(View.GONE);
                return;
            }
            tvSeTting(holder, historyToDayModle.getLunar(), "", historyToDayModle.getTitle());
        } else if (position % 2 == 1) {
            if (map.get(2) == null) {
                return;
            }
            List<JestModel> jestModels = map.get(2).getListJesk();
            if (jestModels == null) {
                holder.ll.setVisibility(View.GONE);
                return;
            }
            JestModel jestModel;
            jestModel = jestModels.get((int) (position / 2) - 1);
            tvSeTting(holder, jestModel.getContent());
        } else if (position % 2 == 0) {
            if (map.get(3) == null) {
                return;
            }
            List<NewsModel> listNews = map.get(3).getListNews();
            if (listNews == null) {
                holder.ll.setVisibility(View.GONE);
                return;
            }
            NewsModel newsModel;
            newsModel = listNews.get((position / 2) - 1);
            tvSeTting(holder, newsModel.getTitle().trim(), "", newsModel.getAuthor_name());
            Glide.with(activity)
                    .load(StringUtils.strValue(newsModel.getThumbnail_pic_s()))
                    .error(R.drawable.ic_videogame_asset_white_24dp)
                    .into(holder.imgFront);
            url = newsModel.getUrl();
        }
        onClicks(holder, position);
    }

    private void onClicks(OneFViewHolder holder, final int position) {
        holder.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    return;
                }
                Intent intent = null;
                if (position == 1) {
                } else if (position == 2) {
                } else if (position % 2 == 1) {
                } else if (position % 2 == 0) {
                    intent = new Intent(activity, NewsActivity.class);
                    intent.putExtra("url", url);
                    activity.startActivity(intent);
                }
            }
        });

    }


    private void tvSeTting(OneFViewHolder holder, String one, String two, String three) {
        holder.tvOne.setText(StringUtils.strValue(one));
        holder.tvTwo.setText(StringUtils.strValue(two));
        holder.tvSummary.setText(StringUtils.strValue(three));
        holder.ll.setVisibility(View.VISIBLE);
        holder.rlMain.setVisibility(View.VISIBLE);
        holder.tvMain.setVisibility(View.GONE);
        holder.banner.setVisibility(View.GONE);
        holder.rl_list.setVisibility(View.VISIBLE);
    }

    private void tvSeTting(OneFViewHolder holder, String one) {
        holder.tvMain.setText(StringUtils.strValue(one));
        holder.rlMain.setVisibility(View.GONE);
        holder.tvMain.setVisibility(View.VISIBLE);
        holder.banner.setVisibility(View.GONE);
        holder.rl_list.setVisibility(View.VISIBLE);
    }


    @Override
    public void fillBannerItem(BGABanner banner, ImageView itemView, String model, int position) {
        // 使用构造方法 CropTransformation(Context context, int width, int height, CropType cropType)
        // width : 剪裁宽度
        // height : 剪裁高度
        // cropType : 剪裁类型（指定剪裁位置，可以选择上、中、下其中一种）
        // 使用构造方法 RoundedCornersTransformation(Context context, int radius, int margin, CornerType cornerType)
        // radius ：圆角半径
        // margin ：填充边界
        // cornerType ：边角类型（可以指定4个角中的哪几个角是圆角，哪几个不是）
        final OneFAdapter.MyProgressTarget<Bitmap> myProgressTarget = new OneFAdapter.MyProgressTarget<>(model, new BitmapImageViewTarget(itemView));
        Glide.with(activity)
                .load(model)
                .asBitmap()
                .error(R.drawable.ic_videogame_asset_white_24dp)
//                .bitmapTransform(new RoundedCornersTransformation(getActivity(), 200, 0, RoundedCornersTransformation.CornerType.ALL))
                .into(itemView);
    }


    class OneFViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgFront;
        public TextView tvOne;
        public TextView tvTwo;
        public TextView tvSummary;
        public LinearLayout ll;
        public TextView tvMain;
        public RelativeLayout rlMain;
        public BGABanner banner;
        public RelativeLayout rl_list;

        public OneFViewHolder(View itemView) {
            super(itemView);
            imgFront = (ImageView) itemView.findViewById(R.id.imgFront);
            LayoutParamsUtils.rLPWwScreen(imgFront, 0.2f, 0.2f);
            tvOne = (TextView) itemView.findViewById(R.id.tvOne);
            tvTwo = (TextView) itemView.findViewById(R.id.tvTwo);
            tvSummary = (TextView) itemView.findViewById(R.id.tvSummary);
            ll = (LinearLayout) itemView.findViewById(R.id.ll);
            tvMain = (TextView) itemView.findViewById(R.id.tvMain);
            rlMain = (RelativeLayout) itemView.findViewById(R.id.rlMain);
            banner = (BGABanner) itemView.findViewById(R.id.banner);
            rl_list = (RelativeLayout) itemView.findViewById(R.id.rl_list);
        }
    }

    public void setConstellationName(String constellationName) {
        this.constellationName = constellationName;
    }

    static class MyProgressTarget<Z> extends ProgressTarget<String, Z> {


        public MyProgressTarget(String model, Target<Z> target) {
            super(model, target);
        }

        @Override
        public float getGranularityPercentage() {
            return 0.1f;
        }

        @Override
        protected void onConnecting() {
            Log.e("zzzz", "Connecting");
        }

        @Override
        protected void onDownloading(long bytesRead, long expectedLength) {
//            progressBar.setProgress((int) (100 * bytesRead / expectedLength));
//            progressTextView.setText(bytesRead + "/" + expectedLength);
            Log.e("zzzz", bytesRead + "/" + expectedLength);
        }

        @Override
        protected void onDownloaded() {
//            progressTextView.setText("decoding and transforming");
            Log.e("zzzz", "onDownloaded");
        }

        @Override
        protected void onDelivered() {
//            progressTextView.setText("Done");
            Log.e("zzzz", "Done");
        }
    }
}
