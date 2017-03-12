package com.swpuiot.timeweaker.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.swpuiot.timeweaker.R;
import com.swpuiot.timeweaker.clicklistener.MyItemClickListener;
import com.swpuiot.timeweaker.clicklistener.MyItemLongClickListener;

/**
 * Created by 羊荣毅_L on 2017/3/12.
 * 为recycleview闯将viewholder
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public TextView listContent;
    public ImageView imageOfNext;
    public MyItemClickListener mClickListener;
    public MyItemLongClickListener mLongClickListener;

    public MyViewHolder(View itemView, MyItemClickListener mClickListener, MyItemLongClickListener mLongClickListener) {
        super(itemView);
        listContent = (TextView) itemView.findViewById(R.id.tt_listitem);
        imageOfNext = (ImageView) itemView.findViewById(R.id.im_nextimage);
        this.mClickListener = mClickListener;
        this.mLongClickListener = mLongClickListener;
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (itemView!=null){
            mClickListener.onItemClick(v, getPosition());
        }

    }

    @Override
    public boolean onLongClick(View v) {
        if (itemView!=null){
            mLongClickListener.onItemLongClick(v,getPosition());
        }
        return true;
    }
}
