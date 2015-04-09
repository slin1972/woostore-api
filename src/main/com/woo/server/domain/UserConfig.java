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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "t_user_config")
@Access(value = AccessType.FIELD)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserConfig {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	@XmlAttribute
	private Long id;
	
	private boolean notDisturb ;//免打扰
	private Long disturbSTime ; //免打扰开始时间
	private Long disturbETime ;	//免打扰结束时间
	private boolean alarmBell ; //警报强制响铃
	private boolean showPhone ; //显示手机号
	
	private Long userId ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isNotDisturb() {
		return notDisturb;
	}

	public void setNotDisturb(boolean notDisturb) {
		this.notDisturb = notDisturb;
	}

	public Long getDisturbSTime() {
		return disturbSTime;
	}

	public void setDisturbSTime(Long disturbSTime) {
		this.disturbSTime = disturbSTime;
	}

	public Long getDisturbETime() {
		return disturbETime;
	}

	public void setDisturbETime(Long disturbETime) {
		this.disturbETime = disturbETime;
	}

	public boolean isAlarmBell() {
		return alarmBell;
	}

	public void setAlarmBell(boolean alarmBell) {
		this.alarmBell = alarmBell;
	}

	public boolean isShowPhone() {
		return showPhone;
	}

	public void setShowPhone(boolean showPhone) {
		this.showPhone = showPhone;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserConfig [id=" + id + ", notDisturb=" + notDisturb
				+ ", disturbSTime=" + disturbSTime + ", disturbETime="
				+ disturbETime + ", alarmBell=" + alarmBell + ", showPhone="
				+ showPhone + ", userId=" + userId + "]";
	}
	
}
