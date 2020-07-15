package com.jzshopping.entity;

import java.io.Serializable;

/**
*
* @author lmz
* @version v1.0
* @date 2020年7月2日 上午11:52:46
*/
public class JzygNews implements Serializable{

    /**
    * 新闻编号
    */
    private Integer newsId;
    /**
    * 获取新闻编号
    * @return
    */
    public Integer getNewsId() {
    return newsId;
    }
    /**
    * 设置新闻编号
    * @param newsId
    */
    public void setNewsId(Integer newsId) {
    this.newsId = newsId;
    }
    /**
    * 新闻标题
    */
    private String newsTitle;
    /**
    * 获取新闻标题
    * @return
    */
    public String getNewsTitle() {
    return newsTitle;
    }
    /**
    * 设置新闻标题
    * @param newsTitle
    */
    public void setNewsTitle(String newsTitle) {
    this.newsTitle = newsTitle;
    }
    /**
    * 新闻作者
    */
    private String newsAuthor;
    /**
    * 获取新闻作者
    * @return
    */
    public String getNewsAuthor() {
    return newsAuthor;
    }
    /**
    * 设置新闻作者
    * @param newsAuthor
    */
    public void setNewsAuthor(String newsAuthor) {
    this.newsAuthor = newsAuthor;
    }
    /**
    * 新闻内容
    */
    private String newsContent;
    /**
    * 获取新闻内容
    * @return
    */
    public String getNewsContent() {
    return newsContent;
    }
    /**
    * 设置新闻内容
    * @param newsContent
    */
    public void setNewsContent(String newsContent) {
    this.newsContent = newsContent;
    }
    /**
    * 主题编号
    */
    private Integer topicId;
    /**
    * 获取主题编号
    * @return
    */
    public Integer getTopicId() {
    return topicId;
    }
    /**
    * 设置主题编号
    * @param topicId
    */
    public void setTopicId(Integer topicId) {
    this.topicId = topicId;
    }
    /**
    * 发布时间
    */
    private java.sql.Date pushDate;
    /**
    * 获取发布时间
    * @return
    */
    public java.sql.Date getPushDate() {
    return pushDate;
    }
    /**
    * 设置发布时间
    * @param pushDate
    */
    public void setPushDate(java.sql.Date pushDate) {
    this.pushDate = pushDate;
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
public JzygNews() {}


/**
* 带参构造
    * @param newsId 新闻编号
    * @param newsTitle 新闻标题
    * @param newsAuthor 新闻作者
    * @param newsContent 新闻内容
    * @param topicId 主题编号
    * @param pushDate 发布时间
    * @param createDate 创建时间
    * @param createBy 创建者
    * @param modifyDate 更新时间
    * @param modfiyBy 更新者
*/
public JzygNews(
        Integer newsId,
        String newsTitle,
        String newsAuthor,
        String newsContent,
        Integer topicId,
        java.sql.Date pushDate,
        java.sql.Timestamp createDate,
        String createBy,
        java.sql.Timestamp modifyDate,
        String modfiyBy
) {
    this.setNewsId(newsId);
    this.setNewsTitle(newsTitle);
    this.setNewsAuthor(newsAuthor);
    this.setNewsContent(newsContent);
    this.setTopicId(topicId);
    this.setPushDate(pushDate);
    this.setCreateDate(createDate);
    this.setCreateBy(createBy);
    this.setModifyDate(modifyDate);
    this.setModfiyBy(modfiyBy);
}
}
