/**
 * WelcomeActivity.java
 * HDCurve
 *
 * Created by nanhe on 2015年6月17日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.view;

import com.huidongtech.hdcurve.R;
import com.huidongtech.hdcurve.view.user.UserActivity;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * 起始页
 * 
 */
@ContentView(R.layout.activity_welcome)
public class WelcomeActivity extends Activity {
	//跳转到主页标志
	private final int GO_HOME = 0;
    // 延迟3秒
    private final long SPLASH_DELAY_MILLIS = 3000;
	
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ViewUtils.inject(this);
	}
	
	/* 
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		mHandler.sendEmptyMessageDelayed(GO_HOME, SPLASH_DELAY_MILLIS);
	}
	
	 /**
     * Handler:跳转到不同界面
     */
    private Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
            case GO_HOME:
            	Intent goUserIntent=new Intent(WelcomeActivity.this, UserActivity.class);
            	startActivity(goUserIntent);
            	WelcomeActivity.this.finish();
                break;
            }
            super.handleMessage(msg);
        }
    };
	
}
