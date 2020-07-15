package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygAccount implements Serializable{

    /**
    * 编号
    */
    private Integer userId;
    /**
    * 获取编号
    * @return
    */
    public Integer getUserId() {
    return userId;
    }
    /**
    * 设置编号
    * @param userId
    */
    public void setUserId(Integer userId) {
    this.userId = userId;
    }
    /**
    * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为手机号或邮箱号
    */
    private String userCode;
    /**
    * 获取若是第三方登录，系统将自动生成唯一账号；自注册用户则为手机号或邮箱号
    * @return
    */
    public String getUserCode() {
    return userCode;
    }
    /**
    * 设置若是第三方登录，系统将自动生成唯一账号；自注册用户则为手机号或邮箱号
    * @param userCode
    */
    public void setUserCode(String userCode) {
    this.userCode = userCode;
    }
    /**
    * 昵称，系统将会自动生成昵称userCode相同
    */
    private String userName;
    /**
    * 获取昵称，系统将会自动生成昵称userCode相同
    * @return
    */
    public String getUserName() {
    return userName;
    }
    /**
    * 设置昵称，系统将会自动生成昵称userCode相同
    * @param userName
    */
    public void setUserName(String userName) {
    this.userName = userName;
    }
    /**
    * 密码，若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    */
    private String userPwd;
    /**
    * 获取密码，若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    * @return
    */
    public String getUserPwd() {
    return userPwd;
    }
    /**
    * 设置密码，若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    * @param userPwd
    */
    public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
    }
    /**
    * QQ账号
    */
    private String QQ;
    /**
    * 获取QQ账号
    * @return
    */
    public String getQQ() {
    return QQ;
    }
    /**
    * 设置QQ账号
    * @param QQ
    */
    public void setQQ(String QQ) {
    this.QQ = QQ;
    }
    /**
    * 微信账号
    */
    private String weChat;
    /**
    * 获取微信账号
    * @return
    */
    public String getWeChat() {
    return weChat;
    }
    /**
    * 设置微信账号
    * @param weChat
    */
    public void setWeChat(String weChat) {
    this.weChat = weChat;
    }
    /**
    * 微博账号
    */
    private String weiBo;
    /**
    * 获取微博账号
    * @return
    */
    public String getWeiBo() {
    return weiBo;
    }
    /**
    * 设置微博账号
    * @param weiBo
    */
    public void setWeiBo(String weiBo) {
    this.weiBo = weiBo;
    }
    /**
    * 百度账号
    */
    private String baiDu;
    /**
    * 获取百度账号
    * @return
    */
    public String getBaiDu() {
    return baiDu;
    }
    /**
    * 设置百度账号
    * @param baiDu
    */
    public void setBaiDu(String baiDu) {
    this.baiDu = baiDu;
    }
    /**
    * 支付宝账号
    */
    private String alipay;
    /**
    * 获取支付宝账号
    * @return
    */
    public String getAlipay() {
    return alipay;
    }
    /**
    * 设置支付宝账号
    * @param alipay
    */
    public void setAlipay(String alipay) {
    this.alipay = alipay;
    }
    /**
    * 用户类型: 1.自注册用户2.QQ 3.微信4.微博5.百度6.支付宝
    */
    private Integer userType;
    /**
    * 获取用户类型: 1.自注册用户2.QQ 3.微信4.微博5.百度6.支付宝
    * @return
    */
    public Integer getUserType() {
    return userType;
    }
    /**
    * 设置用户类型: 1.自注册用户2.QQ 3.微信4.微博5.百度6.支付宝
    * @param userType
    */
    public void setUserType(Integer userType) {
    this.userType = userType;
    }
    /**
    * 平台ID (根据不同登录用户，进行相应存入:自注册用户主键ID、微信ID、QQID、微博ID
    */
    private Integer flatId;
    /**
    * 获取平台ID (根据不同登录用户，进行相应存入:自注册用户主键ID、微信ID、QQID、微博ID
    * @return
    */
    public Integer getFlatId() {
    return flatId;
    }
    /**
    * 设置平台ID (根据不同登录用户，进行相应存入:自注册用户主键ID、微信ID、QQID、微博ID
    * @param flatId
    */
    public void setFlatId(Integer flatId) {
    this.flatId = flatId;
    }
    /**
    * 是否激活,可以禁用用户；0.激活、1.未激活
    */
    private Integer activited;
    /**
    * 获取是否激活,可以禁用用户；0.激活、1.未激活
    * @return
    */
    public Integer getActivited() {
    return activited;
    }
    /**
    * 设置是否激活,可以禁用用户；0.激活、1.未激活
    * @param activited
    */
    public void setActivited(Integer activited) {
    this.activited = activited;
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
public JzygAccount() {}


/**
* 带参构造
    * @param userId 编号
    * @param userCode 若是第三方登录，系统将自动生成唯一账号；自注册用户则为手机号或邮箱号
    * @param userName 昵称，系统将会自动生成昵称userCode相同
    * @param userPwd 密码，若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    * @param QQ QQ账号
    * @param weChat 微信账号
    * @param weiBo 微博账号
    * @param baiDu 百度账号
    * @param alipay 支付宝账号
    * @param userType 用户类型: 1.自注册用户2.QQ 3.微信4.微博5.百度6.支付宝
    * @param flatId 平台ID (根据不同登录用户，进行相应存入:自注册用户主键ID、微信ID、QQID、微博ID
    * @param activited 是否激活,可以禁用用户；0.激活、1.未激活
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygAccount(
        Integer userId,
        String userCode,
        String userName,
        String userPwd,
        String QQ,
        String weChat,
        String weiBo,
        String baiDu,
        String alipay,
        Integer userType,
        Integer flatId,
        Integer activited,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setUserId(userId);
    this.setUserCode(userCode);
    this.setUserName(userName);
    this.setUserPwd(userPwd);
    this.setQQ(QQ);
    this.setWeChat(weChat);
    this.setWeiBo(weiBo);
    this.setBaiDu(baiDu);
    this.setAlipay(alipay);
    this.setUserType(userType);
    this.setFlatId(flatId);
    this.setActivited(activited);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
