/**
 * TestInfo.java
 * HDCurve
 *
 * Created by nanhe on 2015年5月30日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.model;

import java.util.Date;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Foreign;
import com.lidroid.xutils.db.annotation.Table;

/**
 * Commnet
 * 
 */
@Table(name="TestInfo")
public class TestInfo extends EntryBase {
	@Foreign(column="uid",foreign="id")
	private User ti_User;//测量者
	
	@Foreign(column="stiid",foreign="id")
	private SysTestIndex ti_SysTestIndex;//指标Id
	
	@Column(column="testvalue")
	private double tiTestValue;//测量值
	
	@Column(column="testdate")
	private Date tiTestDate; //测量日期

	/**
	 * 
	 * @return the ti_User
	 */
	public User getTi_User() {
		return ti_User;
	}
	/**
	 * 
	 * @param ti_User the ti_User to set
	 */
	public void setTi_User(User ti_User) {
		this.ti_User = ti_User;
	}
	/**
	 * 
	 * @return the ti_SysTestIndex
	 */
	public SysTestIndex getTi_SysTestIndex() {
		return ti_SysTestIndex;
	}
	/**
	 * 
	 * @param ti_SysTestIndex the ti_SysTestIndex to set
	 */
	public void setTi_SysTestIndex(SysTestIndex ti_SysTestIndex) {
		this.ti_SysTestIndex = ti_SysTestIndex;
	}
	
	/**
	 * 
	 * @return the tiTestValue
	 */
	public double getTiTestValue() {
		return tiTestValue;
	}
	/**
	 * 
	 * @param tiTestValue the tiTestValue to set
	 */
	public void setTiTestValue(double tiTestValue) {
		this.tiTestValue = tiTestValue;
	}
	/**
	 * 
	 * @return the tiTestDate
	 */
	public Date getTiTestDate() {
		return tiTestDate;
	}
	/**
	 * 
	 * @param tiTestDate the tiTestDate to set
	 */
	public void setTiTestDate(Date tiTestDate) {
		this.tiTestDate = tiTestDate;
	}
	
}
