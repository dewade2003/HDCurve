/**
 * UserEditActivity.java
 * HDCurve
 *
 * Created by nanhe on 2015年6月17日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.view.user;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.huidongtech.hdcurve.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

/**
 * 用户编辑页
 * 
 */
@ContentView(R.layout.activity_useredit)
public class UserEditActivity extends Activity {

	@ViewInject(R.id.btnCancle)
	View cancleBtn;
	
	@ViewInject(R.id.userName)
	EditText userNameEditText;
	
	/* 
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
		userNameEditText.setFocusable(true);
		userNameEditText.requestFocus();
	}
	
	@OnClick(R.id.btnCancle)
	private void onCancleBtnClick(View view) {
		UserEditActivity.this.finish();
	}
}
