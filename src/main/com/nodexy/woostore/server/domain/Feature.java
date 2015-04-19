package com.nodexy.woostore.server.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_feature")
public class Feature implements Serializable {

	private static final long serialVersionUID = 9165602953969513437L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private String id;
	private String name;
	private String intro;
	private String detail;
	private String itemListId;
	private String featureType;
	private String showType;
	private Date fromTime;
	private Date toTime;
	private String creator;
	private Date createtime;
	private Date modifytime;

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

	public Date getFromTime() {
		return fromTime;
	}

	public void setFromTime(Date fromTime) {
		this.fromTime = fromTime;
	}

	public Date getToTime() {
		return toTime;
	}

	public void setToTime(Date toTime) {
		this.toTime = toTime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getModifytime() {
		return modifytime;
	}

	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

	@Override
	public String toString() {
		return "Feature [id=" + id + ", name=" + name + ", intro=" + intro
				+ ", detail=" + detail + ", itemListId=" + itemListId
				+ ", featureType=" + featureType + ", showType=" + showType
				+ ", fromTime=" + fromTime + ", toTime=" + toTime
				+ ", creator=" + creator + ", createtime=" + createtime
				+ ", modifytime=" + modifytime + "]";
	}

}
