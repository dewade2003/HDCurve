/**
 * DataManagerActivity.java
 * HDCurve
 *
 * Created by nanhe on 2015年6月17日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.view.data;

import com.huidongtech.hdcurve.R;
import com.huidongtech.hdcurve.model.TB_User;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.util.LogUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * 数据管理
 * 
 */
@ContentView(R.layout.activity_datamanager)
public class DataManagerActivity extends Activity {
	
	TB_User tB_User;

	@ViewInject(R.id.backView)
	View backView;
	
	@ViewInject(R.id.userName)
	TextView userNameTextView;
	/* 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		ViewUtils.inject(this);
		setContentView(R.layout.activity_datamanager);
		
		if (tB_User!=null) {
			LogUtils.d("username is "+tB_User.getuName());
			userNameTextView.setText(tB_User.getuName());
		}
		
	}
	
	@OnClick(R.id.backView)
	private void onBackViewClick(View view) {
		DataManagerActivity.this.finish();
	}
}
