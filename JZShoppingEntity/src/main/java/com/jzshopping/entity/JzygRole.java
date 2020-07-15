package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygRole implements Serializable{

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
    * 角色名称
    */
    private String roleName;
    /**
    * 获取角色名称
    * @return
    */
    public String getRoleName() {
    return roleName;
    }
    /**
    * 设置角色名称
    * @param roleName
    */
    public void setRoleName(String roleName) {
    this.roleName = roleName;
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
public JzygRole() {}


/**
* 带参构造
    * @param roleId 角色编号
    * @param roleName 角色名称
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygRole(
        Integer roleId,
        String roleName,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setRoleId(roleId);
    this.setRoleName(roleName);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
