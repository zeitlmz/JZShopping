package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygAccountRole implements Serializable{

    /**
    * 用户角色编号
    */
    private Integer accountRoleId;
    /**
    * 获取用户角色编号
    * @return
    */
    public Integer getAccountRoleId() {
    return accountRoleId;
    }
    /**
    * 设置用户角色编号
    * @param accountRoleId
    */
    public void setAccountRoleId(Integer accountRoleId) {
    this.accountRoleId = accountRoleId;
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
    * 角色编号
    */
    private Integer roleId;
    /**
    * 获取角色编号
    * @return
    */
    public Integer getRoleId() {
    return roleId;
    }
    /**
    * 设置角色编号
    * @param roleId
    */
    public void setRoleId(Integer roleId) {
    this.roleId = roleId;
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
public JzygAccountRole() {}


/**
* 带参构造
    * @param accountRoleId 用户角色编号
    * @param userId 用户编号
    * @param roleId 角色编号
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygAccountRole(
        Integer accountRoleId,
        Integer userId,
        Integer roleId,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setAccountRoleId(accountRoleId);
    this.setUserId(userId);
    this.setRoleId(roleId);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
