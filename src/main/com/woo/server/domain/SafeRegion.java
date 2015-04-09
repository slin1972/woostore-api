package com.woo.server.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "t_safe_region")
@Access(value = AccessType.FIELD)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SafeRegion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	@XmlAttribute
    private Long id;
	@XmlElement
    private Double lng;  //经度
	private Double lat;	//纬度
	private Integer radius ;	//半径
	private String name ;   //区域名字
	private String effectiveDay ; //有效天
	private Long intoTime ;   //进入时间
	private Long leaveTime ;	//离开时间

    private Long deviceId ;  //设备id
    private Long userId ;	//设置人id
    private String address ;
    
    private String remarks ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Integer getRadius() {
		return radius;
	}
	public void setRadius(Integer radius) {
		this.radius = radius;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEffectiveDay() {
		return effectiveDay;
	}
	public void setEffectiveDay(String effectiveDay) {
		this.effectiveDay = effectiveDay;
	}
	public Long getIntoTime() {
		return intoTime;
	}
	public void setIntoTime(Long intoTime) {
		this.intoTime = intoTime;
	}
	public Long getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(Long leaveTime) {
		this.leaveTime = leaveTime;
	}
	public Long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "SafeRegion [id=" + id + ", lng=" + lng + ", lat=" + lat
				+ ", radius=" + radius + ", name=" + name + ", effectiveDay="
				+ effectiveDay + ", intoTime=" + intoTime + ", leaveTime="
				+ leaveTime + ", deviceId=" + deviceId + ", userId=" + userId
				+ ", remarks=" + remarks + "]";
	}
}
