package com.swpuiot.timeweaker.data;

import com.swpuiot.timeweaker.R;
import com.swpuiot.timeweaker.entities.RecycleViewListEntity;

import java.util.ArrayList;

/**
 * Created by 羊荣毅_L on 2017/3/12.
 */
public class Resource {
    public ArrayList<RecycleViewListEntity> getList() {
        ArrayList<RecycleViewListEntity> mRecycleViewListEntities = new ArrayList<RecycleViewListEntity>();
        mRecycleViewListEntities.add(new RecycleViewListEntity("把你藏在心里", R.drawable.next_item_icon));
        mRecycleViewListEntities.add(new RecycleViewListEntity("把你藏在心里", R.drawable.next_item_icon));
        mRecycleViewListEntities.add(new RecycleViewListEntity("把你藏在心里", R.drawable.next_item_icon));
        mRecycleViewListEntities.add(new RecycleViewListEntity("把你藏在心里", R.drawable.next_item_icon));
        mRecycleViewListEntities.add(new RecycleViewListEntity("把你藏在心里", R.drawable.next_item_icon));
        mRecycleViewListEntities.add(new RecycleViewListEntity("把你藏在心里", R.drawable.next_item_icon));
        mRecycleViewListEntities.add(new RecycleViewListEntity("把你藏在心里", R.drawable.next_item_icon));
        mRecycleViewListEntities.add(new RecycleViewListEntity("把你藏在心里", R.drawable.next_item_icon));
        return mRecycleViewListEntities;
    }
}
