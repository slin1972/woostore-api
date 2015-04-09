package com.woo.push;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.woo.server.BaseTest;

public class GetuiPushTest extends BaseTest{

	final static String token = "4efab07f638033b3ded8fa7f689f0e3046c872f6b51c95eceadd05f45fac0bc7";
	
	@Autowired
	private IPushServer pushServer;
	@Test
	public void test(){
		for(int i =0 ;i<10 ;i++){
			PushParams p = new PushParams();
			p.setDevice(1);
			p.setBadge(1);
			p.setActionLocKey("111");
			p.setMessage("hello");
			//p.setPayload("ttttttttt");
			p.setLocArgs("[\""+i+"\"]");
			p.setLocKey("SOS_POLICE");
			PushResult res = pushServer.pushMessage(p, token);
			System.out.println(res);
		}
	}
}
