package com.huidongtech.hdcurve.view.components;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

/**
 * ��scrollview����ʾ��һ��listview
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
	 * �󶨲���
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
	 * ��ȡAdapter
	 * 
	 * @return adapter
	 */
	public BaseAdapter getAdpater() {
		return adapter;
	}

	/**
	 * ��������
	 * 
	 * @param adpater
	 */
	public void setAdapter(BaseAdapter adpater) {
		this.adapter = adpater;
		bindLinearLayout();
	}

	/**
	 * ��ȡ����¼�
	 * 
	 * @return
	 */
	public OnClickListener getOnclickListner() {
		return onItemClickListener;
	}

	/**
	 * ���õ���¼�
	 * 
	 * @param onClickListener
	 */
	public void setOnclickLinstener(OnClickListener onClickListener) {
		this.onItemClickListener = onClickListener;
	}

}
