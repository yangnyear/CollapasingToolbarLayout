package com.swpuiot.timeweaker.entities;

/**
 * Created by 羊荣毅_L on 2017/3/12.
 */
public class RecycleViewListEntity {
    public String content;
    public  int imageId;

    public RecycleViewListEntity(String content, int imageId) {
        this.content = content;
        this.imageId = imageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
