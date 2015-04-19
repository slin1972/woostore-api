package com.nodexy.woostore.server.util;


public class CommonResult implements java.io.Serializable{
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 9162580036061557543L;
	protected boolean ok;
    protected int code;
    protected String msg;

    public CommonResult(){
    	//nothing
    }
    
    public CommonResult(boolean ok,int code){
    	this.ok=ok;
    	this.code = code;
    }
    
    public CommonResult(boolean ok,int code,String msg){
    	this.ok=ok;
    	this.code = code;
    	this.msg = msg;
    }
	
	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "CommonResult [ok=" + ok + ", code=" + code + ", msg=" + msg
				+ "]";
	}
    
}
