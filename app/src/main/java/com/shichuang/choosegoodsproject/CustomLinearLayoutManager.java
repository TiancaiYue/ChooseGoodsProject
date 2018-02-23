package com.shichuang.choosegoodsproject;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/**
 * 自定义LinearLayoutManager，设置RecyclerView 滚动是否可用
 * Created by zmy on 2017/8/23.
 */

public class CustomLinearLayoutManager extends LinearLayoutManager {
    private boolean isScrollEnabled = true;

    public CustomLinearLayoutManager(Context context) {
        super(context);
    }

    public void setScrollEnabled(boolean flag) {
        this.isScrollEnabled = flag;
    }

    @Override
    public boolean canScrollVertically() {
        return isScrollEnabled && super.canScrollVertically();
    }
}