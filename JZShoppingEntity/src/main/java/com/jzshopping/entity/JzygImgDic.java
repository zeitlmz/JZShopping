package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygImgDic implements Serializable{

    /**
    * 编号
    */
    private Integer imgDicId;
    /**
    * 获取编号
    * @return
    */
    public Integer getImgDicId() {
    return imgDicId;
    }
    /**
    * 设置编号
    * @param imgDicId
    */
    public void setImgDicId(Integer imgDicId) {
    this.imgDicId = imgDicId;
    }
    /**
    * 图片类型：1、商品，2、评论，3、新闻
    */
    private String type;
    /**
    * 获取图片类型：1、商品，2、评论，3、新闻
    * @return
    */
    public String getType() {
    return type;
    }
    /**
    * 设置图片类型：1、商品，2、评论，3、新闻
    * @param type
    */
    public void setType(String type) {
    this.type = type;
    }
    /**
    * 资源类型：1、图片，2、视频
    */
    private Integer resourceType;
    /**
    * 获取资源类型：1、图片，2、视频
    * @return
    */
    public Integer getResourceType() {
    return resourceType;
    }
    /**
    * 设置资源类型：1、图片，2、视频
    * @param resourceType
    */
    public void setResourceType(Integer resourceType) {
    this.resourceType = resourceType;
    }
    /**
    * 关联商品、评论、新闻的ID
    */
    private String targetId;
    /**
    * 获取关联商品、评论、新闻的ID
    * @return
    */
    public String getTargetId() {
    return targetId;
    }
    /**
    * 设置关联商品、评论、新闻的ID
    * @param targetId
    */
    public void setTargetId(String targetId) {
    this.targetId = targetId;
    }
    /**
    * 图片上传的顺序
    */
    private String position;
    /**
    * 获取图片上传的顺序
    * @return
    */
    public String getPosition() {
    return position;
    }
    /**
    * 设置图片上传的顺序
    * @param position
    */
    public void setPosition(String position) {
    this.position = position;
    }
    /**
    *
    */
    private String imgUrl;
    /**
    * 获取
    * @return
    */
    public String getImgUrl() {
    return imgUrl;
    }
    /**
    * 设置
    * @param imgUrl
    */
    public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
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
public JzygImgDic() {}


/**
* 带参构造
    * @param imgDicId 编号
    * @param type 图片类型：1、商品，2、评论，3、新闻
    * @param resourceType 资源类型：1、图片，2、视频
    * @param targetId 关联商品、评论、新闻的ID
    * @param position 图片上传的顺序
    * @param imgUrl
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygImgDic(
        Integer imgDicId,
        String type,
        Integer resourceType,
        String targetId,
        String position,
        String imgUrl,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setImgDicId(imgDicId);
    this.setType(type);
    this.setResourceType(resourceType);
    this.setTargetId(targetId);
    this.setPosition(position);
    this.setImgUrl(imgUrl);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
