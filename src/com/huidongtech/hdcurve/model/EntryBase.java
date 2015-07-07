/**
 * EntryBase.java
 * HDCurve
 *
 * Created by nanhe on 2015年5月30日
 * Copyright (c) 2015年 慧动曲线. All rights reserved.
 */
package com.huidongtech.hdcurve.model;

/**
 * Commnet
 * 实体基类
 */
public class EntryBase {

	 //@Id // 如果主键没有命名名为id或_id的时，需要为主键添加此注解
    //@NoAutoIncrement // int,long类型的id默认自增，不想使用自增时添加此注解
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) { 
        this.id = id;
    }
    
}
