package com.woo.push;

/***
 * 推送功能的接口
 * @author slin
 */
public interface IPushServer {
	
	PushResult pushMessage(PushParams pushParams,String ... deviceToken);

}
