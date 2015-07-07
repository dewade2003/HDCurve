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
@Table(name="hd_tb_data")
public class TB_Data extends EntryBase {
	@Foreign(column="uid",foreign="id")
	private TB_User tb_User;//测量者
	
	@Foreign(column="indexid",foreign="id")
	private TB_Index tb_Index;//指标Id
	
	@Column(column="testdata")
	private double testData;//测量值
	
	@Column(column="testdate")
	private Date testDate; //测量日期
	
	@Column(column="testtime")
	private Date testTime;//测量时间
	
	@Column(column="testtype")
	private char testType;//测量类型，0为训练前，1为训练后
	
	@Column(column="remark")
	private String remark;//备注

	/**
	 * TODO
	 * @return the tb_User
	 */
	public TB_User getTb_User() {
		return tb_User;
	}

	/**
	 * 
	 * @param tb_User the tb_User to set
	 */
	public void setTb_User(TB_User tb_User) {
		this.tb_User = tb_User;
	}

	/**
	 * TODO
	 * @return the tb_Index
	 */
	public TB_Index getTb_Index() {
		return tb_Index;
	}

	/**
	 * 
	 * @param tb_Index the tb_Index to set
	 */
	public void setTb_Index(TB_Index tb_Index) {
		this.tb_Index = tb_Index;
	}

	/**
	 * TODO
	 * @return the testData
	 */
	public double getTestData() {
		return testData;
	}

	/**
	 * 
	 * @param testData the testData to set
	 */
	public void setTestData(double testData) {
		this.testData = testData;
	}

	/**
	 * TODO
	 * @return the testDate
	 */
	public Date getTestDate() {
		return testDate;
	}

	/**
	 * 
	 * @param testDate the testDate to set
	 */
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	/**
	 * TODO
	 * @return the testTime
	 */
	public Date getTestTime() {
		return testTime;
	}

	/**
	 * 
	 * @param testTime the testTime to set
	 */
	public void setTestTime(Date testTime) {
		this.testTime = testTime;
	}

	/**
	 * TODO
	 * @return the testType
	 */
	public char getTestType() {
		return testType;
	}

	/**
	 * 
	 * @param testType the testType to set
	 */
	public void setTestType(char testType) {
		this.testType = testType;
	}

	/**
	 * TODO
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
	
}
