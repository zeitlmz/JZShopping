package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygProduct implements Serializable{

    /**
    * 商品编号
    */
    private Integer productId;
    /**
    * 获取商品编号
    * @return
    */
    public Integer getProductId() {
    return productId;
    }
    /**
    * 设置商品编号
    * @param productId
    */
    public void setProductId(Integer productId) {
    this.productId = productId;
    }
    /**
    * 商品名称
    */
    private String productName;
    /**
    * 获取商品名称
    * @return
    */
    public String getProductName() {
    return productName;
    }
    /**
    * 设置商品名称
    * @param productName
    */
    public void setProductName(String productName) {
    this.productName = productName;
    }
    /**
    * 库存
    */
    private String stock;
    /**
    * 获取库存
    * @return
    */
    public String getStock() {
    return stock;
    }
    /**
    * 设置库存
    * @param stock
    */
    public void setStock(String stock) {
    this.stock = stock;
    }
    /**
    * 价格
    */
    private Double price;
    /**
    * 获取价格
    * @return
    */
    public Double getPrice() {
    return price;
    }
    /**
    * 设置价格
    * @param price
    */
    public void setPrice(Double price) {
    this.price = price;
    }
    /**
    * 描述
    */
    private String description;
    /**
    * 获取描述
    * @return
    */
    public String getDescription() {
    return description;
    }
    /**
    * 设置描述
    * @param description
    */
    public void setDescription(String description) {
    this.description = description;
    }
    /**
    * 一级分类编号
    */
    private Integer categoryLevel1;
    /**
    * 获取一级分类编号
    * @return
    */
    public Integer getCategoryLevel1() {
    return categoryLevel1;
    }
    /**
    * 设置一级分类编号
    * @param categoryLevel1
    */
    public void setCategoryLevel1(Integer categoryLevel1) {
    this.categoryLevel1 = categoryLevel1;
    }
    /**
    * 二级分类编号
    */
    private Integer categoryLevel2;
    /**
    * 获取二级分类编号
    * @return
    */
    public Integer getCategoryLevel2() {
    return categoryLevel2;
    }
    /**
    * 设置二级分类编号
    * @param categoryLevel2
    */
    public void setCategoryLevel2(Integer categoryLevel2) {
    this.categoryLevel2 = categoryLevel2;
    }
    /**
    * 三级分类编号
    */
    private Integer categoryLevel3;
    /**
    * 获取三级分类编号
    * @return
    */
    public Integer getCategoryLevel3() {
    return categoryLevel3;
    }
    /**
    * 设置三级分类编号
    * @param categoryLevel3
    */
    public void setCategoryLevel3(Integer categoryLevel3) {
    this.categoryLevel3 = categoryLevel3;
    }
    /**
    * 是否是新品
    */
    private String productNew;
    /**
    * 获取是否是新品
    * @return
    */
    public String getProductNew() {
    return productNew;
    }
    /**
    * 设置是否是新品
    * @param productNew
    */
    public void setProductNew(String productNew) {
    this.productNew = productNew;
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
public JzygProduct() {}


/**
* 带参构造
    * @param productId 商品编号
    * @param productName 商品名称
    * @param stock 库存
    * @param price 价格
    * @param description 描述
    * @param categoryLevel1 一级分类编号
    * @param categoryLevel2 二级分类编号
    * @param categoryLevel3 三级分类编号
    * @param productNew 是否是新品
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygProduct(
        Integer productId,
        String productName,
        String stock,
        Double price,
        String description,
        Integer categoryLevel1,
        Integer categoryLevel2,
        Integer categoryLevel3,
        String productNew,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setProductId(productId);
    this.setProductName(productName);
    this.setStock(stock);
    this.setPrice(price);
    this.setDescription(description);
    this.setCategoryLevel1(categoryLevel1);
    this.setCategoryLevel2(categoryLevel2);
    this.setCategoryLevel3(categoryLevel3);
    this.setProductNew(productNew);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}

    @Override
    public String toString() {
        return "JzygProduct{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", stock='" + stock + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", categoryLevel1=" + categoryLevel1 +
                ", categoryLevel2=" + categoryLevel2 +
                ", categoryLevel3=" + categoryLevel3 +
                ", productNew='" + productNew + '\'' +
                ", createDate=" + createDate +
                ", createBy='" + createBy + '\'' +
                ", modifyDate=" + modifyDate +
                ", modfiyBy='" + modfiyBy + '\'' +
                '}';
    }
}
