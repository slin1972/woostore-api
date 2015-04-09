package com.woo.push;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.woo.server.domain.PushMessage;

public class PushParams {
	//设备类型
	@JsonIgnore
	private int device ; //2:android 1=ios 0:default validate 
	//（用于多语言支持）指定执行按钮所使用的Localizable.strings
	private String actionLocKey;
	//应用icon上显示的数字
	@JsonIgnore
	private int badge = 1;
	//通知文本消息字符串
	@JsonIgnore
	private String message ;
	//通知铃声文件名
	private String sound ;
	//需要发送给客户端的透传数据
	private PayLoad payload ;
	//（用于多语言支持）指定Localizable.strings文件中相应的key
	private String locKey ;
	//如果loc-key中使用的占位符，则在loc-args中指定各参数
	private String locArgs;
	//指定启动界面图片名
	@JsonIgnore
	private String launchImage ;
	//
	@JsonIgnore
	private Integer contentAvailable = 1 ;
	
	public String getActionLocKey() {
		return actionLocKey;
	}
	public void setActionLocKey(String actionLocKey) {
		this.actionLocKey = actionLocKey;
	}
	public int getBadge() {
		return badge;
	}
	public void setBadge(int badge) {
		this.badge = badge;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public PayLoad getPayload() {
		return payload;
	}
	public void setPayload(PayLoad payload) {
		this.payload = payload;
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
	public String getLaunchImage() {
		return launchImage;
	}
	public void setLaunchImage(String launchImage) {
		this.launchImage = launchImage;
	}
	public Integer getContentAvailable() {
		return contentAvailable;
	}
	public void setContentAvailable(Integer contentAvailable) {
		this.contentAvailable = contentAvailable;
	}
	public int getDevice() {
		return device;
	}
	public void setDevice(int device) {
		this.device = device;
	}
	public PushParams(int device, String actionLocKey, int badge,
			String message, String sound, PayLoad payload, String locKey,
			String locArgs, String launchImage, Integer contentAvailable) {
		super();
		this.device = device;
		this.actionLocKey = actionLocKey;
		this.badge = badge;
		this.message = message;
		this.sound = sound;
		this.payload = payload;
		this.locKey = locKey;
		this.locArgs = locArgs;
		this.launchImage = launchImage;
		this.contentAvailable = contentAvailable;
	}
	public PushParams() {
		super();
	}
	public PushParams(PushMessage pushMessage) {
		//this.message = pushMessage.getContent();
		this.badge = 1 ;
		this.setLocKey(pushMessage.getLocKey());
		this.setLocArgs(pushMessage.getLocArgs());
		this.sound = pushMessage.getLocKey()+".aiff";
		this.actionLocKey = "";//TODO   这里先默认空
		this.message = "";//TODO   这里先默认空
		//this.locKey = pushMessage.getContent();
		/*Location lo = pushMessage.getLocation();
		PayLoad payload = new PayLoad();
		payload.setMid(pushMessage.getId());
		payload.setLat(lo.getLat());
		payload.setLng(lo.getLng());
		payload.setDid(lo.getDeviceId());*/
		
		this.payload = payload;
		//this.launchImage = pushMessage.getType();
	}
	
}
