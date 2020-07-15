package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygOrder implements Serializable{

    /**
    *
    */
    private Integer orderId;
    /**
    * 获取
    * @return
    */
    public Integer getOrderId() {
    return orderId;
    }
    /**
    * 设置
    * @param orderId
    */
    public void setOrderId(Integer orderId) {
    this.orderId = orderId;
    }
    /**
    *
    */
    private Integer userId;
    /**
    * 获取
    * @return
    */
    public Integer getUserId() {
    return userId;
    }
    /**
    * 设置
    * @param userId
    */
    public void setUserId(Integer userId) {
    this.userId = userId;
    }
    /**
    * 订单类型：0.商品产品、1.酒店产品、2.机票产品
    */
    private Integer orderType;
    /**
    * 获取订单类型：0.商品产品、1.酒店产品、2.机票产品
    * @return
    */
    public Integer getOrderType() {
    return orderType;
    }
    /**
    * 设置订单类型：0.商品产品、1.酒店产品、2.机票产品
    * @param orderType
    */
    public void setOrderType(Integer orderType) {
    this.orderType = orderType;
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
    * 交易编号
    */
    private String tradeNo;
    /**
    * 获取交易编号
    * @return
    */
    public String getTradeNo() {
    return tradeNo;
    }
    /**
    * 设置交易编号
    * @param tradeNo
    */
    public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
    }
    /**
    * 商品数量
    */
    private Integer count;
    /**
    * 获取商品数量
    * @return
    */
    public Integer getCount() {
    return count;
    }
    /**
    * 设置商品数量
    * @param count
    */
    public void setCount(Integer count) {
    this.count = count;
    }
    /**
    * 商品总价格
    */
    private Double payAmount;
    /**
    * 获取商品总价格
    * @return
    */
    public Double getPayAmount() {
    return payAmount;
    }
    /**
    * 设置商品总价格
    * @param payAmount
    */
    public void setPayAmount(Double payAmount) {
    this.payAmount = payAmount;
    }
    /**
    * 订单状态：0.待支付、1.已取消、2.支付成功、3.已消费、4.已点评
    */
    private Integer orderStatus;
    /**
    * 获取订单状态：0.待支付、1.已取消、2.支付成功、3.已消费、4.已点评
    * @return
    */
    public Integer getOrderStatus() {
    return orderStatus;
    }
    /**
    * 设置订单状态：0.待支付、1.已取消、2.支付成功、3.已消费、4.已点评
    * @param orderStatus
    */
    public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
    }
    /**
    * 支付方式：1.支付宝、2.微信、3.银行卡
    */
    private Integer payType;
    /**
    * 获取支付方式：1.支付宝、2.微信、3.银行卡
    * @return
    */
    public Integer getPayType() {
    return payType;
    }
    /**
    * 设置支付方式：1.支付宝、2.微信、3.银行卡
    * @param payType
    */
    public void setPayType(Integer payType) {
    this.payType = payType;
    }
    /**
    * 是否要开发票
    */
    private String needInvoice;
    /**
    * 获取是否要开发票
    * @return
    */
    public String getNeedInvoice() {
    return needInvoice;
    }
    /**
    * 设置是否要开发票
    * @param needInvoice
    */
    public void setNeedInvoice(String needInvoice) {
    this.needInvoice = needInvoice;
    }
    /**
    * 发票类型：0.个人、1.公司
    */
    private Integer invoiceType;
    /**
    * 获取发票类型：0.个人、1.公司
    * @return
    */
    public Integer getInvoiceType() {
    return invoiceType;
    }
    /**
    * 设置发票类型：0.个人、1.公司
    * @param invoiceType
    */
    public void setInvoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
    }
    /**
    * 发票抬头
    */
    private String invoiceHead;
    /**
    * 获取发票抬头
    * @return
    */
    public String getInvoiceHead() {
    return invoiceHead;
    }
    /**
    * 设置发票抬头
    * @param invoiceHead
    */
    public void setInvoiceHead(String invoiceHead) {
    this.invoiceHead = invoiceHead;
    }
    /**
    * 0.WEB端、1.手机端、2.其他客户端
    */
    private Integer bookType;
    /**
    * 获取0.WEB端、1.手机端、2.其他客户端
    * @return
    */
    public Integer getBookType() {
    return bookType;
    }
    /**
    * 设置0.WEB端、1.手机端、2.其他客户端
    * @param bookType
    */
    public void setBookType(Integer bookType) {
    this.bookType = bookType;
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
public JzygOrder() {}


/**
* 带参构造
    * @param orderId
    * @param userId
    * @param orderType 订单类型：0.商品产品、1.酒店产品、2.机票产品
    * @param orderNo 订单编号
    * @param tradeNo 交易编号
    * @param count 商品数量
    * @param payAmount 商品总价格
    * @param orderStatus 订单状态：0.待支付、1.已取消、2.支付成功、3.已消费、4.已点评
    * @param payType 支付方式：1.支付宝、2.微信、3.银行卡
    * @param needInvoice 是否要开发票
    * @param invoiceType 发票类型：0.个人、1.公司
    * @param invoiceHead 发票抬头
    * @param bookType 0.WEB端、1.手机端、2.其他客户端
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygOrder(
        Integer orderId,
        Integer userId,
        Integer orderType,
        String orderNo,
        String tradeNo,
        Integer count,
        Double payAmount,
        Integer orderStatus,
        Integer payType,
        String needInvoice,
        Integer invoiceType,
        String invoiceHead,
        Integer bookType,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setOrderId(orderId);
    this.setUserId(userId);
    this.setOrderType(orderType);
    this.setOrderNo(orderNo);
    this.setTradeNo(tradeNo);
    this.setCount(count);
    this.setPayAmount(payAmount);
    this.setOrderStatus(orderStatus);
    this.setPayType(payType);
    this.setNeedInvoice(needInvoice);
    this.setInvoiceType(invoiceType);
    this.setInvoiceHead(invoiceHead);
    this.setBookType(bookType);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
