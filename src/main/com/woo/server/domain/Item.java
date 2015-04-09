package com.woo.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	private String softName;
	private String itemName;
	private String intro;
	private String detail;
	private String iconUrl;
	private String remark;
	private String screenshot;
	private String author;
	private String keyword;
	private String tags ;
	private String categoryId;
	
	private String versionName ;
	private String versionCode ;
	private String size ;
	private String fileMd5;
	private String downUrl ;
	private String downCount ;
	private String commentCount ;
	private String score;
	
	private String itemType;
	private String saleType;
	private String saleStatus;
	private String channel;
	
	private String createTime;
	private String lastActionName;
	private String lastActionBy;
	private String lastActionTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSoftName() {
		return softName;
	}
	public void setSoftName(String softName) {
		this.softName = softName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getScreenshot() {
		return screenshot;
	}
	public void setScreenshot(String screenshot) {
		this.screenshot = screenshot;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public String getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getFileMd5() {
		return fileMd5;
	}
	public void setFileMd5(String fileMd5) {
		this.fileMd5 = fileMd5;
	}
	public String getDownUrl() {
		return downUrl;
	}
	public void setDownUrl(String downUrl) {
		this.downUrl = downUrl;
	}
	public String getDownCount() {
		return downCount;
	}
	public void setDownCount(String downCount) {
		this.downCount = downCount;
	}
	public String getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getSaleType() {
		return saleType;
	}
	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}
	public String getSaleStatus() {
		return saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getLastActionName() {
		return lastActionName;
	}
	public void setLastActionName(String lastActionName) {
		this.lastActionName = lastActionName;
	}
	public String getLastActionBy() {
		return lastActionBy;
	}
	public void setLastActionBy(String lastActionBy) {
		this.lastActionBy = lastActionBy;
	}
	public String getLastActionTime() {
		return lastActionTime;
	}
	public void setLastActionTime(String lastActionTime) {
		this.lastActionTime = lastActionTime;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", softName=" + softName + ", itemName="
				+ itemName + ", intro=" + intro + ", detail=" + detail
				+ ", iconUrl=" + iconUrl + ", remark=" + remark
				+ ", screenshot=" + screenshot + ", author=" + author
				+ ", keyword=" + keyword + ", tags=" + tags + ", categoryId="
				+ categoryId + ", versionName=" + versionName
				+ ", versionCode=" + versionCode + ", size=" + size
				+ ", fileMd5=" + fileMd5 + ", downUrl=" + downUrl
				+ ", downCount=" + downCount + ", commentCount=" + commentCount
				+ ", score=" + score + ", itemType=" + itemType + ", saleType="
				+ saleType + ", saleStatus=" + saleStatus + ", channel="
				+ channel + ", createTime=" + createTime + ", lastActionName="
				+ lastActionName + ", lastActionBy=" + lastActionBy
				+ ", lastActionTime=" + lastActionTime + "]";
	}
}
