/**
 * UserAdapter.java
 * HDCurve
 *
 * Created by nanhe on 2015年6月23日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.view.adapters;

import java.util.List;

import com.huidongtech.hdcurve.R;
import com.huidongtech.hdcurve.model.TB_User;
import com.huidongtech.hdcurve.view.data.DataManagerActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * TODO
 */
public class UserAdapter extends BaseAdapter {
	
	Context context;
	List<TB_User> users;
	
	public UserAdapter(Context context,List<TB_User> users){
		this.context=context;
		this.users=users;
	}

	/* 
	 * @see android.widget.Adapter#getCount()
	 */
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return users.size();
	}

	/* 
	 * @see android.widget.Adapter#getItem(int)
	 */
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * @see android.widget.Adapter#getItemId(int)
	 */
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* 
	 * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		UserItemViewHolder userItemViewHolder=null;
		if (convertView==null) {
			userItemViewHolder=new UserItemViewHolder();
			convertView=LayoutInflater.from(context).inflate(R.layout.user_item, null);
			userItemViewHolder.dataManageButton=convertView.findViewById(R.id.userDataManage);
			userItemViewHolder.showCurveButton=convertView.findViewById(R.id.userShowCurve);
			userItemViewHolder.userEditButton=convertView.findViewById(R.id.userEdit);
			userItemViewHolder.userNameTextView=(TextView)convertView.findViewById(R.id.userName);
			
			convertView.setTag(userItemViewHolder);
		}else {
			userItemViewHolder=(UserItemViewHolder)convertView.getTag();
		}
		
		final TB_User tb_User=users.get(position);
		if (tb_User!=null) {
			userItemViewHolder.userNameTextView.setText(tb_User.getuName());
		}
		
		userItemViewHolder.dataManageButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(context, DataManagerActivity.class);
				intent.putExtra("user", tb_User);
				context.startActivity(intent);
			}
		});
		
		return convertView;
	}
	
	public class UserItemViewHolder{
		public TextView userNameTextView;
		public View dataManageButton,showCurveButton,userEditButton;
	}

}
