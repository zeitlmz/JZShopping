package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygUsersLink implements Serializable{

    /**
    * 用户编号
    */
    private String userId;
    /**
    * 获取用户编号
    * @return
    */
    public String getUserId() {
    return userId;
    }
    /**
    * 设置用户编号
    * @param userId
    */
    public void setUserId(String userId) {
    this.userId = userId;
    }
    /**
    * 收货人
    */
    private String receiver;
    /**
    * 获取收货人
    * @return
    */
    public String getReceiver() {
    return receiver;
    }
    /**
    * 设置收货人
    * @param receiver
    */
    public void setReceiver(String receiver) {
    this.receiver = receiver;
    }
    /**
    * 所在地区
    */
    private String area;
    /**
    * 获取所在地区
    * @return
    */
    public String getArea() {
    return area;
    }
    /**
    * 设置所在地区
    * @param area
    */
    public void setArea(String area) {
    this.area = area;
    }
    /**
    * 地址
    */
    private String address;
    /**
    * 获取地址
    * @return
    */
    public String getAddress() {
    return address;
    }
    /**
    * 设置地址
    * @param address
    */
    public void setAddress(String address) {
    this.address = address;
    }
    /**
    * 手机
    */
    private Integer tel;
    /**
    * 获取手机
    * @return
    */
    public Integer getTel() {
    return tel;
    }
    /**
    * 设置手机
    * @param tel
    */
    public void setTel(Integer tel) {
    this.tel = tel;
    }
    /**
    * 固定电话
    */
    private String fixedPhone;
    /**
    * 获取固定电话
    * @return
    */
    public String getFixedPhone() {
    return fixedPhone;
    }
    /**
    * 设置固定电话
    * @param fixedPhone
    */
    public void setFixedPhone(String fixedPhone) {
    this.fixedPhone = fixedPhone;
    }
    /**
    * 邮箱
    */
    private String email;
    /**
    * 获取邮箱
    * @return
    */
    public String getEmail() {
    return email;
    }
    /**
    * 设置邮箱
    * @param email
    */
    public void setEmail(String email) {
    this.email = email;
    }
    /**
    * 支付方式
    */
    private String pay;
    /**
    * 获取支付方式
    * @return
    */
    public String getPay() {
    return pay;
    }
    /**
    * 设置支付方式
    * @param pay
    */
    public void setPay(String pay) {
    this.pay = pay;
    }
    /**
    * 配送方式
    */
    private String distribution;
    /**
    * 获取配送方式
    * @return
    */
    public String getDistribution() {
    return distribution;
    }
    /**
    * 设置配送方式
    * @param distribution
    */
    public void setDistribution(String distribution) {
    this.distribution = distribution;
    }
    /**
    * 是否是默认地址
    */
    private String defaultAddress;
    /**
    * 获取是否是默认地址
    * @return
    */
    public String getDefaultAddress() {
    return defaultAddress;
    }
    /**
    * 设置是否是默认地址
    * @param defaultAddress
    */
    public void setDefaultAddress(String defaultAddress) {
    this.defaultAddress = defaultAddress;
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
public JzygUsersLink() {}


/**
* 带参构造
    * @param userId 用户编号
    * @param receiver 收货人
    * @param area 所在地区
    * @param address 地址
    * @param tel 手机
    * @param fixedPhone 固定电话
    * @param email 邮箱
    * @param pay 支付方式
    * @param distribution 配送方式
    * @param defaultAddress 是否是默认地址
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygUsersLink(
        String userId,
        String receiver,
        String area,
        String address,
        Integer tel,
        String fixedPhone,
        String email,
        String pay,
        String distribution,
        String defaultAddress,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setUserId(userId);
    this.setReceiver(receiver);
    this.setArea(area);
    this.setAddress(address);
    this.setTel(tel);
    this.setFixedPhone(fixedPhone);
    this.setEmail(email);
    this.setPay(pay);
    this.setDistribution(distribution);
    this.setDefaultAddress(defaultAddress);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
