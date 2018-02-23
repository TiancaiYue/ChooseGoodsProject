package com.shichuang.choosegoodsproject;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmy on 2017/12/4.
 */

public class ChooseGoodsAdapter extends BaseQuickAdapter<ThingsDetails.SpecTile, BaseViewHolder> {
    public ChooseGoodsAdapter() {
        super(R.layout.item_choose_shop);
    }

    private TagItemOnClick tagItemOnClick;

    public interface TagItemOnClick {
        void onItemClick(View view, int position, int positions);
    }

    public void setTagItemOnClickListener(TagItemOnClick listener) {
        tagItemOnClick = listener;
    }

    @Override
    protected void convert(final BaseViewHolder helper, final ThingsDetails.SpecTile item) {
        final TagFlowLayout mFlowLayout = helper.getView(R.id.flow_layout_hot);
        helper.setText(R.id.tv_type, item.getName());
        final List<String> listString = new ArrayList<>();
        for (int i = 0; i < item.getValues().size(); i++) {
            listString.add(item.getValues().get(i).getName());
        }
        final LayoutInflater mInflater = LayoutInflater.from(mContext);
        mFlowLayout.setAdapter(new TagAdapter<String>(listString) {
            @Override
            public View getView(FlowLayout parent, int position, String s) {
                TextView tv = (TextView) mInflater.inflate(R.layout.item_shop_group_text,
                        mFlowLayout, false);
                tv.setText(s);
                if (item.getValues().get(position).isSelect() && item.getValues().get(position).isCanSelect()) {
                    tv.setBackgroundResource(R.drawable.bg_btn_base);
                } else {
                    tv.setBackgroundResource(R.drawable.bg_btn_gray);
                }
                if (item.getValues().get(position).isCanSelect()) {
                    tv.setEnabled(true);
                    tv.setTextColor(Color.parseColor("#565656"));
                } else {
                    tv.setEnabled(false);
                    tv.setTextColor(Color.parseColor("#ffffff"));
                }
                return tv;
            }
        });
        mFlowLayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                if (tagItemOnClick != null) {
                    tagItemOnClick.onItemClick(view, position, helper.getPosition());
                }
                return true;
            }
        });
        mFlowLayout.setMaxSelectCount(1);
        helper.addOnClickListener(R.id.flow_layout_hot);
    }
}
