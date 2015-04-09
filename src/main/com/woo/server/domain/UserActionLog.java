package com.woo.server.domain;
/**
 * UserActionLog 
 * 
 * @author nodexy
 * @since 201410
 */
public class UserActionLog {

    private Long id;
    private String level;
    private String actionName;
    private String actionType;
    private String actionTime;
    private String actionData;
    private String ip;
    private String deviceType; // android,iphone,win-pc,mac
    private String deviceNo; // imei for phone
    private String deviceInfo; // os version , ppi , browser ...

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public String getActionData() {
        return actionData;
    }

    public void setActionData(String actionData) {
        this.actionData = actionData;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserActionLog [id=" + id + ", level=" + level + ", actionName="
                + actionName + ", actionType=" + actionType + ", actionTime="
                + actionTime + ", actionData=" + actionData + ", ip=" + ip
                + ", deviceType=" + deviceType + ", deviceNo=" + deviceNo
                + ", deviceInfo=" + deviceInfo + ", userId=" + userId + "]";
    }

}
