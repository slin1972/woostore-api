package com.woo.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_feature")
public class Feature {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private String id;
	private String name;
	private String detail;
	private String itemListId;
	private String featureType;
	private String showType;
	private String creator;
	private String createtime;
	private String modifytime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getItemListId() {
		return itemListId;
	}
	public void setItemListId(String itemListId) {
		this.itemListId = itemListId;
	}
	public String getFeatureType() {
		return featureType;
	}
	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}
	public String getShowType() {
		return showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getModifytime() {
		return modifytime;
	}
	public void setModifytime(String modifytime) {
		this.modifytime = modifytime;
	}
	@Override
	public String toString() {
		return "Feature [id=" + id + ", name=" + name + ", detail=" + detail
				+ ", itemListId=" + itemListId + ", featureType=" + featureType
				+ ", showType=" + showType + ", creator=" + creator
				+ ", createtime=" + createtime + ", modifytime=" + modifytime
				+ "]";
	}
}
