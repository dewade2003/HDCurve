package com.huidongtech.hdcurve.view.components;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

/**
 * 在scrollview中显示另一个listview
 * @author nanhe
 *
 */
public class LinearLayoutForListView extends LinearLayout {

	private BaseAdapter adapter;
	private OnClickListener onItemClickListener = null;

	public LinearLayoutForListView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setOrientation(LinearLayout.VERTICAL);
	}
	
	

	/**
	 * 绑定布局
	 */
	public void bindLinearLayout() {
		int count = adapter.getCount();
		for (int i = 0; i < count; i++) {
			View v = adapter.getView(i, null, null);

			v.setOnClickListener(this.onItemClickListener);
			addView(v, i);
		}
	}

	/**
	 * 获取Adapter
	 * 
	 * @return adapter
	 */
	public BaseAdapter getAdpater() {
		return adapter;
	}

	/**
	 * 设置数据
	 * 
	 * @param adpater
	 */
	public void setAdapter(BaseAdapter adpater) {
		this.adapter = adpater;
		bindLinearLayout();
	}

	/**
	 * 获取点击事件
	 * 
	 * @return
	 */
	public OnClickListener getOnclickListner() {
		return onItemClickListener;
	}

	/**
	 * 设置点击事件
	 * 
	 * @param onClickListener
	 */
	public void setOnclickLinstener(OnClickListener onClickListener) {
		this.onItemClickListener = onClickListener;
	}

}
