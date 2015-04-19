package com.nodexy.woostore.server.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

public class ContextUtils {
 
private static ApplicationContext applicationContext;
 
	private final static Logger LOG = LoggerFactory.getLogger(ContextUtils.class);  
		
	public static void setApplicationContext(ApplicationContext applicationContext) {
		synchronized (ContextUtils.class) {
			LOG.debug("setApplicationContext, notifyAll");
			ContextUtils.applicationContext = applicationContext;
			ContextUtils.class.notifyAll();
		}
	}
	 
	public static ApplicationContext getApplicationContext() {
		synchronized (ContextUtils.class) {
			while (applicationContext == null) {
				try {
					LOG.debug("getApplicationContext, wait...");
					ContextUtils.class.wait(60000);
					if (applicationContext == null) {
						LOG.warn("Have been waiting for ApplicationContext to be set for 1 minute", new Exception());
					}
				} catch (InterruptedException ex) {
					LOG.debug("getApplicationContext, wait interrupted");
				}
			}
			return applicationContext;
		}
	}
	
	public static <T> T getBean(Class<T> class1) {
		return getApplicationContext().getBean(class1);
	}
	
	public static Object getBean(String name) {
		return getApplicationContext().getBean(name);
	}

}