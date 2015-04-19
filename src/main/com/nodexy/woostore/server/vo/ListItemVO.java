package com.nodexy.woostore.server.vo;

import java.io.Serializable;

/**
 * 列表页资源 展示模型
 * 
 * @author nodexy
 *
 */
public class ListItemVO implements Serializable {

	private static final long serialVersionUID = -8052255751859785167L;

	private Long id;
	private String name; // displayName;
	private String intro;
	private String remark;
	private String iconUrl;
	private String developerName;
	private String tags;
	private String categoryId;

	private String versionName;
	private String versionCode;
	private String size;
	private String downUrl;
	private String downCount;
	private String commentCount;
	private String score;

	private String itemType;
	private String saleType;
	private String saleStatus;
	private String channel;
	private String price;
	private String specification;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ListItemVO [id=" + id + ", name=" + name + ", intro=" + intro
				+ ", remark=" + remark + ", iconUrl=" + iconUrl
				+ ", developerName=" + developerName + ", tags=" + tags
				+ ", categoryId=" + categoryId + ", versionName=" + versionName
				+ ", versionCode=" + versionCode + ", size=" + size
				+ ", downUrl=" + downUrl + ", downCount=" + downCount
				+ ", commentCount=" + commentCount + ", score=" + score
				+ ", itemType=" + itemType + ", saleType=" + saleType
				+ ", saleStatus=" + saleStatus + ", channel=" + channel
				+ ", price=" + price + ", specification=" + specification + "]";
	}

}
