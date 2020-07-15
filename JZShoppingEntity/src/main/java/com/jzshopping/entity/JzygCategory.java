package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygCategory implements Serializable{

    /**
    * 分类编号
    */
    private Integer categoryId;
    /**
    * 获取分类编号
    * @return
    */
    public Integer getCategoryId() {
    return categoryId;
    }
    /**
    * 设置分类编号
    * @param categoryId
    */
    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }
    /**
    * 分类名称
    */
    private String categoryName;
    /**
    * 获取分类名称
    * @return
    */
    public String getCategoryName() {
    return categoryName;
    }
    /**
    * 设置分类名称
    * @param categoryName
    */
    public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
    }
    /**
    * 父分类编号
    */
    private Integer parentId;
    /**
    * 获取父分类编号
    * @return
    */
    public Integer getParentId() {
    return parentId;
    }
    /**
    * 设置父分类编号
    * @param parentId
    */
    public void setParentId(Integer parentId) {
    this.parentId = parentId;
    }
    /**
    * 分类标签
    */
    private String label;
    /**
    * 获取分类标签
    * @return
    */
    public String getLabel() {
    return label;
    }
    /**
    * 设置分类标签
    * @param label
    */
    public void setLabel(String label) {
    this.label = label;
    }
    /**
    * 等级
    */
    private String level;
    /**
    * 获取等级
    * @return
    */
    public String getLevel() {
    return level;
    }
    /**
    * 设置等级
    * @param level
    */
    public void setLevel(String level) {
    this.level = level;
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
public JzygCategory() {}


/**
* 带参构造
    * @param categoryId 分类编号
    * @param categoryName 分类名称
    * @param parentId 父分类编号
    * @param label 分类标签
    * @param level 等级
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygCategory(
        Integer categoryId,
        String categoryName,
        Integer parentId,
        String label,
        String level,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setCategoryId(categoryId);
    this.setCategoryName(categoryName);
    this.setParentId(parentId);
    this.setLabel(label);
    this.setLevel(level);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
