package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygOrderDetial implements Serializable{

    /**
    * 编号
    */
    private Integer orderDetialId;
    /**
    * 获取编号
    * @return
    */
    public Integer getOrderDetialId() {
    return orderDetialId;
    }
    /**
    * 设置编号
    * @param orderDetialId
    */
    public void setOrderDetialId(Integer orderDetialId) {
    this.orderDetialId = orderDetialId;
    }
    /**
    * 订单编号
    */
    private String orderNo;
    /**
    * 获取订单编号
    * @return
    */
    public String getOrderNo() {
    return orderNo;
    }
    /**
    * 设置订单编号
    * @param orderNo
    */
    public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
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
    * 数量
    */
    private Integer quantity;
    /**
    * 获取数量
    * @return
    */
    public Integer getQuantity() {
    return quantity;
    }
    /**
    * 设置数量
    * @param quantity
    */
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
    /**
    * 单价
    */
    private Double cost;
    /**
    * 获取单价
    * @return
    */
    public Double getCost() {
    return cost;
    }
    /**
    * 设置单价
    * @param cost
    */
    public void setCost(Double cost) {
    this.cost = cost;
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
public JzygOrderDetial() {}


/**
* 带参构造
    * @param orderDetialId 编号
    * @param orderNo 订单编号
    * @param productId 商品编号
    * @param quantity 数量
    * @param cost 单价
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygOrderDetial(
        Integer orderDetialId,
        String orderNo,
        String productId,
        Integer quantity,
        Double cost,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setOrderDetialId(orderDetialId);
    this.setOrderNo(orderNo);
    this.setProductId(productId);
    this.setQuantity(quantity);
    this.setCost(cost);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
