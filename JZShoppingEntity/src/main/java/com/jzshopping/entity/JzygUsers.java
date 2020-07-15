package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygUsers implements Serializable{

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
    * 性别
    */
    private String sex;
    /**
    * 获取性别
    * @return
    */
    public String getSex() {
    return sex;
    }
    /**
    * 设置性别
    * @param sex
    */
    public void setSex(String sex) {
    this.sex = sex;
    }
    /**
    * 出生日期
    */
    private java.sql.Date birthday;
    /**
    * 获取出生日期
    * @return
    */
    public java.sql.Date getBirthday() {
    return birthday;
    }
    /**
    * 设置出生日期
    * @param birthday
    */
    public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
    }
    /**
    * 兴趣爱好：多个兴趣用逗号隔开
    */
    private String likes;
    /**
    * 获取兴趣爱好：多个兴趣用逗号隔开
    * @return
    */
    public String getLikes() {
    return likes;
    }
    /**
    * 设置兴趣爱好：多个兴趣用逗号隔开
    * @param likes
    */
    public void setLikes(String likes) {
    this.likes = likes;
    }
    /**
    * 默认的联系方式
    */
    private Integer tel;
    /**
    * 获取默认的联系方式
    * @return
    */
    public Integer getTel() {
    return tel;
    }
    /**
    * 设置默认的联系方式
    * @param tel
    */
    public void setTel(Integer tel) {
    this.tel = tel;
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
    * 头像地址
    */
    private String picUrl;
    /**
    * 获取头像地址
    * @return
    */
    public String getPicUrl() {
    return picUrl;
    }
    /**
    * 设置头像地址
    * @param picUrl
    */
    public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
    }
    /**
    * 身份证号码
    */
    private String identityCard;
    /**
    * 获取身份证号码
    * @return
    */
    public String getIdentityCard() {
    return identityCard;
    }
    /**
    * 设置身份证号码
    * @param identityCard
    */
    public void setIdentityCard(String identityCard) {
    this.identityCard = identityCard;
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
public JzygUsers() {}


/**
* 带参构造
    * @param userId 用户编号
    * @param sex 性别
    * @param birthday 出生日期
    * @param likes 兴趣爱好：多个兴趣用逗号隔开
    * @param tel 默认的联系方式
    * @param email 邮箱
    * @param picUrl 头像地址
    * @param identityCard 身份证号码
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygUsers(
        String userId,
        String sex,
        java.sql.Date birthday,
        String likes,
        Integer tel,
        String email,
        String picUrl,
        String identityCard,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setUserId(userId);
    this.setSex(sex);
    this.setBirthday(birthday);
    this.setLikes(likes);
    this.setTel(tel);
    this.setEmail(email);
    this.setPicUrl(picUrl);
    this.setIdentityCard(identityCard);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
