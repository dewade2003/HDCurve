/**
 * AlertActivity.java
 * HDCurve
 *
 * Created by nanhe on 2015年6月17日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.view.components;

import com.huidongtech.hdcurve.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Commnet
 * 
 */
@ContentView(R.layout.activity_alert)
public class AlertActivity extends Activity {

	public static final int REQUESTCODE = 100;
	public static final int RESULTCODE = 0;

	@ViewInject(R.id.btnOk)
	Button okView;
	@ViewInject(R.id.btnCancle)
	View cancleView;
	
	@ViewInject(R.id.alert_titleView)
	TextView titleView;
	@ViewInject(R.id.alert_msgView)
	TextView msgView;

	/*
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ViewUtils.inject(this);
		
		Intent intent=getIntent();
		titleView.setText(intent.getStringExtra("title"));
		msgView.setText(intent.getStringExtra("msg"));
		okView.setText(intent.getStringExtra("confirm"));
	}

	@OnClick(R.id.btnOk)
	private void onOkBtnClick(View view) {
		setResult(RESULTCODE);
		finish();
	}

	@OnClick(R.id.btnCancle)
	private void onCancleBtnClick(View view) {
		finish();
	}
	
	public static void showAlert(Activity context, String title,String msg,String confirmString) {
		Intent intent=new Intent(context, AlertActivity.class);
		intent.putExtra("title", title);
		intent.putExtra("msg", msg);
		if (!confirmString.equals("")) {
			intent.putExtra("confirm", confirmString);
		}
		
		context.startActivityForResult(intent, REQUESTCODE);
	}
	
	public static void showAlert(Activity context, String title,String msg) {
		showAlert(context, title, msg, "确定");
	}
	
	public static void showAlert(Activity context, String title,String msg,int requestCode) {
		Intent intent=new Intent(context, AlertActivity.class);
		intent.putExtra("title", title);
		intent.putExtra("msg", msg);
		intent.putExtra("confirm", "确定");
		
		context.startActivityForResult(intent, requestCode);
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
