package com.shichuang.choosegoodsproject;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * 正方形控件
 * Created by ZMY on 2017/9/20.
 */

public class RxSquareLayout extends RelativeLayout {
    public RxSquareLayout(Context context) {
        super(context);
    }

    public RxSquareLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RxSquareLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //重写此方法后默认调用父类的onMeasure方法,分别将宽度测量空间与高度测量空间传入
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
