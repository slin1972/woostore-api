package com.woo.push;

import java.util.Map;

public class PushResult {
	private String messageId ;
	private String taskId;
	private String resultCode ;
	private String msg ;
	private Map<String,Object> response ;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public Map<String, Object> getResponse() {
		return response;
	}
	public void setResponse(Map<String, Object> response) {
		this.response = response;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public PushResult(String messageId, String taskId, String resultCode,
			Map<String, Object> map) {
		super();
		this.messageId = messageId;
		this.taskId = taskId;
		this.resultCode = resultCode;
		this.response = map;
	}
	
	public PushResult(String messageId, String taskId, String resultCode,
			String msg, Map<String, Object> response) {
		super();
		this.messageId = messageId;
		this.taskId = taskId;
		this.resultCode = resultCode;
		this.msg = msg;
		this.response = response;
	}
	
	@Override
	public String toString() {
		return "PushResult [messageId=" + messageId + ", taskId=" + taskId
				+ ", resultCode=" + resultCode + ", msg=" + msg + ", response="
				+ response + "]";
	}

	public final static PushResult DEVICETOKEN_NULL = new PushResult("", "", "-100", "DeviceToken must contains one element.", null);
	public final static PushResult PARAMS_NULL = new PushResult("", "", "-200", "PushParams can't empty.",null);
	public final static PushResult PUSH_FUNCTION_CLOSE = new PushResult("", "", "-600", "Push function close.", null);
	public final static PushResult EXCEPTION_RESULT = new PushResult("", "", "-300", null);
	public final static PushResult DEVICEID_ERROR = new PushResult("", "", "-400", "PushParams -->device value error.",null);
	public final static PushResult DEVICEID_DEFAULT_WARN = new PushResult("", "", "-500","One request contains android,apple push While device = 0.", null);
}
