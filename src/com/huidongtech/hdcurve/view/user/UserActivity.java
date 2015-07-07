/**
 * UserActivity.java
 * HDCurve
 *
 * Created by nanhe on 2015年6月17日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.view.user;

import java.util.ArrayList;
import java.util.List;

import com.huidongtech.hdcurve.R;
import com.huidongtech.hdcurve.model.TB_User;
import com.huidongtech.hdcurve.view.adapters.UserAdapter;
import com.huidongtech.hdcurve.view.components.AlertActivity;
import com.huidongtech.hdcurve.view.components.MyLetterView;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.lidroid.xutils.view.annotation.event.OnItemLongClick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 用户管理页
 */
@ContentView(R.layout.activity_user)
public class UserActivity extends Activity implements OnItemLongClickListener {
	
	@ViewInject(R.id.letterview1)
	MyLetterView letterView1;
	
	@ViewInject(R.id.letterview2)
	MyLetterView letterView2;
	
	@ViewInject(R.id.userList)
	ListView userList;
	
	@ViewInject(R.id.addUserLayout)
	View addUserView;
	
	@ViewInject(R.id.dialogText)
	TextView dialogText;
	
	UserAdapter userAdapter;

	/* 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ViewUtils.inject(this);
		
		letterView1.setLetterSource(MyLetterView.letter1);
		letterView1.setTextView(dialogText);
		letterView2.setLetterSource(MyLetterView.letter2);
		letterView2.setTextView(dialogText);
		
		List<TB_User> users=new ArrayList<TB_User>();
		
		for (int i = 0; i < 20; i++) {
			TB_User tb_User=new TB_User();
			tb_User.setuName("张三");
			users.add(tb_User);
		}
		
		userAdapter=new UserAdapter(UserActivity.this,users);
		userList.setAdapter(userAdapter);
	}
	
	@OnClick(R.id.addUserLayout)
	private void onAddUserClick(View view) {
		Intent intent=new Intent(UserActivity.this, UserEditActivity.class);
		startActivity(intent);
	}

	/* 
	 * @see android.widget.AdapterView.OnItemLongClickListener#onItemLongClick(android.widget.AdapterView, android.view.View, int, long)
	 */
	@OnItemLongClick(R.id.userList)
	@Override
	public boolean onItemLongClick(AdapterView parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		Toast.makeText(UserActivity.this, "测试", Toast.LENGTH_SHORT).show();
		AlertActivity.showAlert(UserActivity.this, "删除信息确认", "确认删除张三的信息和测试数据吗？");
		return true;
	}
	
	
}
