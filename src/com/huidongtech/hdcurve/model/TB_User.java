/**
 * User.java
 * HDCurve
 *
 * Created by nanhe on 2015年5月29日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.model;

import java.io.Serializable;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;
import com.lidroid.xutils.db.annotation.Transient;

/**
 * Commnet
 * 人员
 */
@Table(name="hd_tb_user", execAfterTableCreated="CREATE UNIQUE INDEX nameindex ON hd_tb_user(username)")
public class TB_User extends EntryBase implements Serializable{
	
	@Column(column="username")
	private String uName;
	
	@Transient
	private String sortLetter;//排序字母
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	/**
	 * TODO
	 * @return the sortLetter
	 */
	public String getSortLetter() {
		return sortLetter;
	}
	/**
	 * 
	 * @param sortLetter the sortLetter to set
	 */
	public void setSortLetter(String sortLetter) {
		this.sortLetter = sortLetter;
	}
}
