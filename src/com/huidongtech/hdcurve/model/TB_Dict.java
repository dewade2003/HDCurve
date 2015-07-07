/**
 * TB_Dict.java
 * HDCurve
 *
 * Created by nanhe on 2015年6月22日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.model;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

/**
 * 字典表
 */
@Table(name="hd_tb_dict")
public class TB_Dict extends EntryBase {

	@Column(column="pid")
	private int pid;
	
	@Column(column="symbol")
	private String symbol;
	
	@Column(column="dict_value")
	private String dict_Value;
	
	@Column(column="dict_name")
	private String dict_Name;

	/**
	 * TODO
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * 
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * TODO
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * 
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * TODO
	 * @return the dict_Value
	 */
	public String getDict_Value() {
		return dict_Value;
	}

	/**
	 * 
	 * @param dict_Value the dict_Value to set
	 */
	public void setDict_Value(String dict_Value) {
		this.dict_Value = dict_Value;
	}

	/**
	 * TODO
	 * @return the dict_Name
	 */
	public String getDict_Name() {
		return dict_Name;
	}

	/**
	 * 
	 * @param dict_Name the dict_Name to set
	 */
	public void setDict_Name(String dict_Name) {
		this.dict_Name = dict_Name;
	}
}
