package yel.com.myapp.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by xxb on 2017/1/16.
 */

public abstract class RBaseadapter<VH extends RecyclerView.ViewHolder>  extends RecyclerView.Adapter<VH> {
    protected List list;
    protected Context mContext;

    public RBaseadapter(Context mContext, List list) {
        this.list = list;
        this.mContext = mContext;
    }


    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }
}
