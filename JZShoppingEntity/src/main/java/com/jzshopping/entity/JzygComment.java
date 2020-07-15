package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygComment implements Serializable{

    /**
    * 评论编号
    */
    private Integer commentId;
    /**
    * 获取评论编号
    * @return
    */
    public Integer getCommentId() {
    return commentId;
    }
    /**
    * 设置评论编号
    * @param commentId
    */
    public void setCommentId(Integer commentId) {
    this.commentId = commentId;
    }
    /**
    * 商品编号
    */
    private String productId;
    /**
    * 获取商品编号
    * @return
    */
    public String getProductId() {
    return productId;
    }
    /**
    * 设置商品编号
    * @param productId
    */
    public void setProductId(String productId) {
    this.productId = productId;
    }
    /**
    * 订单编号
    */
    private String orderId;
    /**
    * 获取订单编号
    * @return
    */
    public String getOrderId() {
    return orderId;
    }
    /**
    * 设置订单编号
    * @param orderId
    */
    public void setOrderId(String orderId) {
    this.orderId = orderId;
    }
    /**
    * 产品类型：0.商品产品、1.酒店产品、2.机票产品
    */
    private Integer productType;
    /**
    * 获取产品类型：0.商品产品、1.酒店产品、2.机票产品
    * @return
    */
    public Integer getProductType() {
    return productType;
    }
    /**
    * 设置产品类型：0.商品产品、1.酒店产品、2.机票产品
    * @param productType
    */
    public void setProductType(Integer productType) {
    this.productType = productType;
    }
    /**
    * 评论内容
    */
    private String content;
    /**
    * 获取评论内容
    * @return
    */
    public String getContent() {
    return content;
    }
    /**
    * 设置评论内容
    * @param content
    */
    public void setContent(String content) {
    this.content = content;
    }
    /**
    * 用户编号
    */
    private Integer userId;
    /**
    * 获取用户编号
    * @return
    */
    public Integer getUserId() {
    return userId;
    }
    /**
    * 设置用户编号
    * @param userId
    */
    public void setUserId(Integer userId) {
    this.userId = userId;
    }
    /**
    * 是否包含图片：当用户上传评论时检测 0.无图片、1.有图片
    */
    private Integer isHavingImg;
    /**
    * 获取是否包含图片：当用户上传评论时检测 0.无图片、1.有图片
    * @return
    */
    public Integer getIsHavingImg() {
    return isHavingImg;
    }
    /**
    * 设置是否包含图片：当用户上传评论时检测 0.无图片、1.有图片
    * @param isHavingImg
    */
    public void setIsHavingImg(Integer isHavingImg) {
    this.isHavingImg = isHavingImg;
    }
    /**
    * 综合评分
    */
    private Double score;
    /**
    * 获取综合评分
    * @return
    */
    public Double getScore() {
    return score;
    }
    /**
    * 设置综合评分
    * @param score
    */
    public void setScore(Double score) {
    this.score = score;
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
public JzygComment() {}


/**
* 带参构造
    * @param commentId 评论编号
    * @param productId 商品编号
    * @param orderId 订单编号
    * @param productType 产品类型：0.商品产品、1.酒店产品、2.机票产品
    * @param content 评论内容
    * @param userId 用户编号
    * @param isHavingImg 是否包含图片：当用户上传评论时检测 0.无图片、1.有图片
    * @param score 综合评分
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygComment(
        Integer commentId,
        String productId,
        String orderId,
        Integer productType,
        String content,
        Integer userId,
        Integer isHavingImg,
        Double score,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setCommentId(commentId);
    this.setProductId(productId);
    this.setOrderId(orderId);
    this.setProductType(productType);
    this.setContent(content);
    this.setUserId(userId);
    this.setIsHavingImg(isHavingImg);
    this.setScore(score);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
