package com.nodexy.woostore.server.domain;

import java.io.Serializable;

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
@Table(name = "t_push_message")
@Access(value = AccessType.FIELD)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PushMessage implements Serializable {

	private static final long serialVersionUID = 7145602968096949795L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlAttribute
	private Long id;
	private Long userId;
	private int state = 0;
	/***
	 * 客户端本地资源的国际化参数 (用做类型与Key)
	 */
	private String locKey;

	/***
	 * 客户端本地资源的国际化参数值(用作内容) json格式字符串
	 */
	private String locArgs;
	private Long sendTime;
	@Column(name = "tfrom")
	private String from;
	@Column(name = "tto")
	private String to;

	@Column(name = "deviceId")
	private Long deviceId;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLocKey() {
		return locKey;
	}

	public void setLocKey(String locKey) {
		this.locKey = locKey;
	}

	public String getLocArgs() {
		return locArgs;
	}

	public void setLocArgs(String locArgs) {
		this.locArgs = locArgs;
	}

	public Long getSendTime() {
		return sendTime;
	}

	public void setSendTime(Long sendTime) {
		this.sendTime = sendTime;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public String toString() {
		return "PushMessage [id=" + id + ", userId=" + userId + ", state="
				+ state + ", locKey=" + locKey + ", locArgs=" + locArgs
				+ ", sendTime=" + sendTime + ", from=" + from + ", to=" + to
				+ "]";
	}

}
