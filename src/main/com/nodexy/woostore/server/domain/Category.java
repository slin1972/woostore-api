package com.nodexy.woostore.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private String id;
	private String name;
	private String parentCatId;
	private String orderIndex;
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
	public String getParentCatId() {
		return parentCatId;
	}
	public void setParentCatId(String parentCatId) {
		this.parentCatId = parentCatId;
	}
	public String getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(String orderIndex) {
		this.orderIndex = orderIndex;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", parentCatId="
				+ parentCatId + ", orderIndex=" + orderIndex + "]";
	}
}
