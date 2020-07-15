package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygProductExtends implements Serializable{

    /**
    * 商品扩展属性编号
    */
    private Integer extendsId;
    /**
    * 获取商品扩展属性编号
    * @return
    */
    public Integer getExtendsId() {
    return extendsId;
    }
    /**
    * 设置商品扩展属性编号
    * @param extendsId
    */
    public void setExtendsId(Integer extendsId) {
    this.extendsId = extendsId;
    }
    /**
    * 三级商品分类编号
    */
    private Integer categoryId;
    /**
    * 获取三级商品分类编号
    * @return
    */
    public Integer getCategoryId() {
    return categoryId;
    }
    /**
    * 设置三级商品分类编号
    * @param categoryId
    */
    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }
    /**
    * 通用字典编号
    */
    private Integer labelId;
    /**
    * 获取通用字典编号
    * @return
    */
    public Integer getLabelId() {
    return labelId;
    }
    /**
    * 设置通用字典编号
    * @param labelId
    */
    public void setLabelId(Integer labelId) {
    this.labelId = labelId;
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
public JzygProductExtends() {}


/**
* 带参构造
    * @param extendsId 商品扩展属性编号
    * @param categoryId 三级商品分类编号
    * @param labelId 通用字典编号
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygProductExtends(
        Integer extendsId,
        Integer categoryId,
        Integer labelId,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setExtendsId(extendsId);
    this.setCategoryId(categoryId);
    this.setLabelId(labelId);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
