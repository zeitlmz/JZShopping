package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygRights implements Serializable{

    /**
    * 权限编号
    */
    private Integer rightsId;
    /**
    * 获取权限编号
    * @return
    */
    public Integer getRightsId() {
    return rightsId;
    }
    /**
    * 设置权限编号
    * @param rightsId
    */
    public void setRightsId(Integer rightsId) {
    this.rightsId = rightsId;
    }
    /**
    * 权限名称
    */
    private String rightsName;
    /**
    * 获取权限名称
    * @return
    */
    public String getRightsName() {
    return rightsName;
    }
    /**
    * 设置权限名称
    * @param rightsName
    */
    public void setRightsName(String rightsName) {
    this.rightsName = rightsName;
    }
    /**
    * 创建时间
    */
    private java.sql.Timestamp createDate;
    /**
    * 获取创建时间
    * @return
    */
    public java.sql.Timestamp getCreateDate() {
    return createDate;
    }
    /**
    * 设置创建时间
    * @param createDate
    */
    public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
    }
    /**
    * 创建者
    */
    private String createBy;
    /**
    * 获取创建者
    * @return
    */
    public String getCreateBy() {
    return createBy;
    }
    /**
    * 设置创建者
    * @param createBy
    */
    public void setCreateBy(String createBy) {
    this.createBy = createBy;
    }
    /**
    * 更新时间
    */
    private java.sql.Timestamp modifyDate;
    /**
    * 获取更新时间
    * @return
    */
    public java.sql.Timestamp getModifyDate() {
    return modifyDate;
    }
    /**
    * 设置更新时间
    * @param modifyDate
    */
    public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
    }
    /**
    * 更新者
    */
    private String modfiyBy;
    /**
    * 获取更新者
    * @return
    */
    public String getModfiyBy() {
    return modfiyBy;
    }
    /**
    * 设置更新者
    * @param modfiyBy
    */
    public void setModfiyBy(String modfiyBy) {
    this.modfiyBy = modfiyBy;
    }


/**
*无参构造
*/
public JzygRights() {}


/**
* 带参构造
    * @param rightsId 权限编号
    * @param rightsName 权限名称
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygRights(
        Integer rightsId,
        String rightsName,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setRightsId(rightsId);
    this.setRightsName(rightsName);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
