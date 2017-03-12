package com.swpuiot.timeweaker.presenter;

import android.content.Context;
import android.view.View;

import com.swpuiot.timeweaker.adapter.RecycleViewAdapter;
import com.swpuiot.timeweaker.clicklistener.MyItemClickListener;
import com.swpuiot.timeweaker.clicklistener.MyItemLongClickListener;
import com.swpuiot.timeweaker.data.Resource;

/**
 * Created by 羊荣毅_L on 2017/3/12.
 */
public class MainPresenter implements MainHolder.presenter,MyItemLongClickListener,MyItemClickListener {
    private Context mContext;
    private MainHolder.view mView;
    private Resource mResource;

    public MainPresenter(Context context) {
        mContext = context;
        this.mView= (MainHolder.view) context;
        mResource=new Resource();
    }

    @Override
    public void setRecycViewAdapter() {
        RecycleViewAdapter adapter=new RecycleViewAdapter(mContext,mResource.getList());
        mView.setRecycViewAdapter(adapter);
        adapter.setClickListener(this);
        adapter.setLongClickListener(this);
    }

    @Override
    public void onItemClick(View view, int position) {

    }

    @Override
    public void onItemLongClick(View view, int position) {

    }
}
