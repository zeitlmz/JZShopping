package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygTrade implements Serializable{

    /**
    * 编号
    */
    private Integer tradeId;
    /**
    * 获取编号
    * @return
    */
    public Integer getTradeId() {
    return tradeId;
    }
    /**
    * 设置编号
    * @param tradeId
    */
    public void setTradeId(Integer tradeId) {
    this.tradeId = tradeId;
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
    * 各平台支付的编号
    */
    private String tradeNo;
    /**
    * 获取各平台支付的编号
    * @return
    */
    public String getTradeNo() {
    return tradeNo;
    }
    /**
    * 设置各平台支付的编号
    * @param tradeNo
    */
    public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
    }
    /**
    * 标识字段：默认0.未处理、1.处理中、2.处理完成
    */
    private Integer flag;
    /**
    * 获取标识字段：默认0.未处理、1.处理中、2.处理完成
    * @return
    */
    public Integer getFlag() {
    return flag;
    }
    /**
    * 设置标识字段：默认0.未处理、1.处理中、2.处理完成
    * @param flag
    */
    public void setFlag(Integer flag) {
    this.flag = flag;
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
public JzygTrade() {}


/**
* 带参构造
    * @param tradeId 编号
    * @param orderNo 订单编号
    * @param tradeNo 各平台支付的编号
    * @param flag 标识字段：默认0.未处理、1.处理中、2.处理完成
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygTrade(
        Integer tradeId,
        String orderNo,
        String tradeNo,
        Integer flag,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setTradeId(tradeId);
    this.setOrderNo(orderNo);
    this.setTradeNo(tradeNo);
    this.setFlag(flag);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
