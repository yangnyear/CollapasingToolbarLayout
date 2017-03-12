package com.swpuiot.timeweaker.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.timeweaker.clicklistener.MyItemClickListener;
import com.swpuiot.timeweaker.clicklistener.MyItemLongClickListener;
import com.swpuiot.timeweaker.entities.RecycleViewListEntity;

import java.util.ArrayList;

import static com.swpuiot.timeweaker.R.layout.recycleview_item;

/**
 * Created by 羊荣毅_L on 2017/3/12.
 * 为recycleview定义adapter
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private MyItemClickListener mClickListener;
    private MyItemLongClickListener mLongClickListener;
    private ArrayList<RecycleViewListEntity> mRecycleViewListEntities;

    public RecycleViewAdapter(Context context,ArrayList<RecycleViewListEntity> recycleViewListEntities) {
        mContext = context;
        mRecycleViewListEntities = recycleViewListEntities;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(recycleview_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(itemView, mClickListener, mLongClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.listContent.setText(mRecycleViewListEntities.get(position).getContent());
        holder.imageOfNext.setImageResource(mRecycleViewListEntities.get(position).getImageId());
    }

    @Override
    public int getItemCount() {
        return mRecycleViewListEntities.size();
    }

    //暴露给Recycleview设置点击事件
    public void setClickListener(MyItemClickListener clickListener) {
        mClickListener = clickListener;
    }

    //暴露给Recycleview设置长按点击事件
    public void setLongClickListener(MyItemLongClickListener longClickListener) {
        mLongClickListener = longClickListener;
    }
}
