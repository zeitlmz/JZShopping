package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygLabelDic implements Serializable{

    /**
    * 商品通用字典编号
    */
    private Integer labelId;
    /**
    * 获取商品通用字典编号
    * @return
    */
    public Integer getLabelId() {
    return labelId;
    }
    /**
    * 设置商品通用字典编号
    * @param labelId
    */
    public void setLabelId(Integer labelId) {
    this.labelId = labelId;
    }
    /**
    * 商品通用字典名称
    */
    private String labelName;
    /**
    * 获取商品通用字典名称
    * @return
    */
    public String getLabelName() {
    return labelName;
    }
    /**
    * 设置商品通用字典名称
    * @param labelName
    */
    public void setLabelName(String labelName) {
    this.labelName = labelName;
    }
    /**
    * 商品通用字典具体最小值
    */
    private String labelMinValue;
    /**
    * 获取商品通用字典具体最小值
    * @return
    */
    public String getLabelMinValue() {
    return labelMinValue;
    }
    /**
    * 设置商品通用字典具体最小值
    * @param labelMinValue
    */
    public void setLabelMinValue(String labelMinValue) {
    this.labelMinValue = labelMinValue;
    }
    /**
    * 商品通用字典具体最大值
    */
    private String labelMaxValue;
    /**
    * 获取商品通用字典具体最大值
    * @return
    */
    public String getLabelMaxValue() {
    return labelMaxValue;
    }
    /**
    * 设置商品通用字典具体最大值
    * @param labelMaxValue
    */
    public void setLabelMaxValue(String labelMaxValue) {
    this.labelMaxValue = labelMaxValue;
    }
    /**
    * 父级的通用字典编号
    */
    private Integer parentId;
    /**
    * 获取父级的通用字典编号
    * @return
    */
    public Integer getParentId() {
    return parentId;
    }
    /**
    * 设置父级的通用字典编号
    * @param parentId
    */
    public void setParentId(Integer parentId) {
    this.parentId = parentId;
    }
    /**
    * 图片地址
    */
    private String pic;
    /**
    * 获取图片地址
    * @return
    */
    public String getPic() {
    return pic;
    }
    /**
    * 设置图片地址
    * @param pic
    */
    public void setPic(String pic) {
    this.pic = pic;
    }
    /**
    * 通用字典描述
    */
    private String description;
    /**
    * 获取通用字典描述
    * @return
    */
    public String getDescription() {
    return description;
    }
    /**
    * 设置通用字典描述
    * @param description
    */
    public void setDescription(String description) {
    this.description = description;
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
public JzygLabelDic() {}


/**
* 带参构造
    * @param labelId 商品通用字典编号
    * @param labelName 商品通用字典名称
    * @param labelMinValue 商品通用字典具体最小值
    * @param labelMaxValue 商品通用字典具体最大值
    * @param parentId 父级的通用字典编号
    * @param pic 图片地址
    * @param description 通用字典描述
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygLabelDic(
        Integer labelId,
        String labelName,
        String labelMinValue,
        String labelMaxValue,
        Integer parentId,
        String pic,
        String description,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setLabelId(labelId);
    this.setLabelName(labelName);
    this.setLabelMinValue(labelMinValue);
    this.setLabelMaxValue(labelMaxValue);
    this.setParentId(parentId);
    this.setPic(pic);
    this.setDescription(description);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
