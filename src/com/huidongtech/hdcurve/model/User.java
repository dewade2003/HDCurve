/**
 * User.java
 * HDCurve
 *
 * Created by nanhe on 2015年5月29日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.model;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

/**
 * Commnet
 * 人员
 */
@Table(name="user")
public class User extends EntryBase{
	
	@Column(column="username")
	private String uName;
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
}
