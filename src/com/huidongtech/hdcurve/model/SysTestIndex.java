/**
 * SysTestIndex.java
 * HDCurve
 *
 * Created by nanhe on 2015年5月30日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.model;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

/**
 * Commnet
 * 系统指标
 */
@Table(name="SysTestIndex")
public class SysTestIndex extends EntryBase{
	
	@Column(column="stiname")
	private String stiName;//指标名称
	
	@Column(column="stiminvalue")
	private double stiMinValue;	//指标范围最小值
	
	@Column(column="stimaxvalue")
	private double stiMaxValue;//指标范围最大值

	/**
	 * 
	 * @return the stiName
	 */
	public String getStiName() {
		return stiName;
	}

	/**
	 * 
	 * @param stiName the stiName to set
	 */
	public void setStiName(String stiName) {
		this.stiName = stiName;
	}

	/**
	 * 
	 * @return the stiMinValue
	 */
	public double getStiMinValue() {
		return stiMinValue;
	}

	/**
	 * 
	 * @param stiMinValue the stiMinValue to set
	 */
	public void setStiMinValue(double stiMinValue) {
		this.stiMinValue = stiMinValue;
	}

	/**
	 * 
	 * @return the stiMaxValue
	 */
	public double getStiMaxValue() {
		return stiMaxValue;
	}

	/**
	 * 
	 * @param stiMaxValue the stiMaxValue to set
	 */
	public void setStiMaxValue(double stiMaxValue) {
		this.stiMaxValue = stiMaxValue;
	}

	
}
