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
@Table(name="hd_tb_index")
public class TB_Index extends EntryBase{
	
	@Column(column="indexname")
	private String indexName;//指标名称
	
	@Column(column="minvalue")
	private double minvalue;	//指标范围最小值
	
	@Column(column="maxvalue")
	private double maxvalue;//指标范围最大值

	/**
	 * TODO
	 * @return the indexName
	 */
	public String getIndexName() {
		return indexName;
	}

	/**
	 * 
	 * @param indexName the indexName to set
	 */
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	/**
	 * TODO
	 * @return the minvalue
	 */
	public double getMinvalue() {
		return minvalue;
	}

	/**
	 * 
	 * @param minvalue the minvalue to set
	 */
	public void setMinvalue(double minvalue) {
		this.minvalue = minvalue;
	}

	/**
	 * TODO
	 * @return the maxvalue
	 */
	public double getMaxvalue() {
		return maxvalue;
	}

	/**
	 * 
	 * @param maxvalue the maxvalue to set
	 */
	public void setMaxvalue(double maxvalue) {
		this.maxvalue = maxvalue;
	}

	
}
