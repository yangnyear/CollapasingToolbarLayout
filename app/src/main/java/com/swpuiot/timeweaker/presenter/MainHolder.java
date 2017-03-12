package com.swpuiot.timeweaker.presenter;

import com.swpuiot.timeweaker.adapter.RecycleViewAdapter;

/**
 * Created by 羊荣毅_L on 2017/3/12.
 */
public interface MainHolder {
    interface view {
        void setRecycViewAdapter(RecycleViewAdapter recycViewAdapter);
    }

    interface presenter {
        void setRecycViewAdapter();
    }
}
