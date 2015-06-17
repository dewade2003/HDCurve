/**
 * HDCurveApplication.java
 * HDCurve
 *
 * Created by nanhe on 2015年5月30日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve;

import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.util.LogUtils;

import android.app.Application;

/**
 * Commnet
 * 
 */
public class HDCurveApplication extends Application {
	
	public DbUtils defaultDBUtils;

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		LogUtils.customTagPrefix="hdcurve";
		
		defaultDBUtils= DbUtils.create(getApplicationContext(), "hdcurve");
//		defaultDBUtils= DbUtils.create(getApplicationContext(), "/sdcard/HDCurve/", "hdcurve");
	}
}
