package com.nodexy.woostore.push;

/***
 * 透传消息数据
 *
 */
public class PayLoad {
	/***
	 * 推送消息id
	 */
	private Long mid ;
	/**
	 * 设备id
	 */
	private Long did ;
	private Double lng ;
	private Double lat ;
	public Long getMid() {
		return mid;
	}
	public void setMid(Long mid) {
		this.mid = mid;
	}
	public Long getDid() {
		return did;
	}
	public void setDid(Long did) {
		this.did = did;
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
	
}
