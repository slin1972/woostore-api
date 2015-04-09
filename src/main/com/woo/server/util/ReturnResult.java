package com.woo.server.util;

import java.util.Map;

public class ReturnResult extends CommonResult{

    /**
	 * 
	 */
	private static final long serialVersionUID = 9214295854230711421L;
	private Map<String,Object> data;
    
    public ReturnResult() {
		super();
	}

	public ReturnResult(boolean ok,int code){
    	this.ok=ok;
    	this.code = code;
    }
    
    public ReturnResult(boolean ok,int code,String msg){
    	this.ok=ok;
    	this.code = code;
    	this.msg = msg;
    }

    

	public Map<String,Object> getData() {
		return data;
	}

	public void setData(Map<String,Object> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ReturnResult [data=" + data + "]";
	}
    
    
}
