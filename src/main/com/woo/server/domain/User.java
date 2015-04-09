package com.woo.server.domain;

import java.io.Serializable;
import java.util.Date;

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

/**
 * @Title: User
 * @Description:
 * @Author: <a href="mailto:nodexy@gmail.com">Chris Yang</a>
 * @Since: 2014年10月 20日 下午4:09:32
 * @Modified By:
 * @Modified Date:
 * @Why & What is modified:
 * @Version:1.0
 */
@Entity
@Table(name = "t_user")
@Access(value = AccessType.FIELD)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {

	private static final long serialVersionUID = -1979129014781686560L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	@XmlAttribute
	private Long id;
	private String password;
	private String phone;
	private String email;
	private String areaCode ;

	private String registerFrom;
	private Date registerTime;
	private String lastLoginFrom;
	private Date lastLoginTime;

	private String nickname;
	private String intro;
	private String location;
	private String birthday;
	private String gender;

	private String loginToken;
	private Long loginTokenTime;
	
	private String deviceToken ;
	private Integer deviceType; //1 ios 2 android
	
	private String imei ;

	public User(Long id, String loginToken,Long loginTokenTime) {
		super();
		this.id = id;
		this.loginToken = loginToken;
		this.loginTokenTime = loginTokenTime;
	}
	public User(Long id, String deviceToken, Integer deviceType) {
		super();
		this.id = id;
		this.deviceToken = deviceToken;
		this.deviceType = deviceType;
	}

	public User() {
		super();
	}
	
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public Integer getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegisterFrom() {
		return registerFrom;
	}

	public void setRegisterFrom(String registerFrom) {
		this.registerFrom = registerFrom;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getLastLoginFrom() {
		return lastLoginFrom;
	}

	public void setLastLoginFrom(String lastLoginFrom) {
		this.lastLoginFrom = lastLoginFrom;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
	
	public Long getLoginTokenTime() {
		return loginTokenTime;
	}

	public void setLoginTokenTime(Long loginTokenTime) {
		this.loginTokenTime = loginTokenTime;
	}
	
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", phone=" + phone
				+ ", email=" + email + ", registerFrom=" + registerFrom
				+ ", registerTime=" + registerTime + ", lastLoginFrom="
				+ lastLoginFrom + ", lastLoginTime=" + lastLoginTime
				+ ", nickname=" + nickname + ", intro=" + intro + ", location="
				+ location + ", birthday=" + birthday + ", gender=" + gender
				+ ", loginToken=" + loginToken + ", loginTokenTime="
				+ loginTokenTime + ", deviceToken=" + deviceToken
				+ ", deviceType=" + deviceType + "]";
	}
	
}
