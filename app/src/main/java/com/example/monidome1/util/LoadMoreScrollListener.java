package com.example.monidome1.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class LoadMoreScrollListener extends RecyclerView.OnScrollListener {

    private LinearLayoutManager mLinearLayoutManager;
    private int totalItemCount;
    private int visibleItemCount;
    private int lastVisibleItemPosition;
    private boolean isLoading  = false;//控制不要重复加载更多
    private int previousTotal;

//PS : 最后2个position返回值有个问题：当你的item的高度比手机屏幕还高，会返回-1

    public LoadMoreScrollListener(LinearLayoutManager linearLayoutManager) {
        this.mLinearLayoutManager = linearLayoutManager;
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        totalItemCount = mLinearLayoutManager.getItemCount();
        visibleItemCount = mLinearLayoutManager.getChildCount();
        lastVisibleItemPosition
                = mLinearLayoutManager.findLastVisibleItemPosition();

        if (isLoading) {
            if (totalItemCount > previousTotal) {//说明数据已经加载结束
                isLoading = false;
                previousTotal = totalItemCount;
            }
        }

        if (visibleItemCount > 0  && !isLoading
                && lastVisibleItemPosition >= totalItemCount - 1//最后一个item可见
                && totalItemCount > visibleItemCount) {//数据不足一屏幕不触发加载更多
            onLoadMore();
            isLoading = true;
        }
    }
    public abstract void onLoadMore();
}
