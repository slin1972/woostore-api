package com.woo.server.util;


/***
 * 异步处理Queue
 */
public class AsynchQueue {
	/*
	static AsynchController asynchController = null;
	static{
		asynchController = new AsynchController(10);
		asynchController.addHandler(PoliceEvent.class, ContextUtils.getBean(PoliceHandle.class));
		asynchController.addHandler(LocationEvent.class, ContextUtils.getBean(LocationHandle.class));
		asynchController.create();
	}*/
	public static void put(Object o){
		//asynchController.postRequest(o);
	}
}
