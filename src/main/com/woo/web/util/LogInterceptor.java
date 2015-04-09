package com.woo.web.util;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogInterceptor implements MethodInterceptor  {  
	
    public Object invoke(MethodInvocation invocation) throws Throwable  {  
    	Logger LOG = LoggerFactory.getLogger(invocation.getClass());  
    	LOG.info(invocation.getMethod() + ":BEGIN!--(LOG)");// 方法前的操作  
        Object obj = invocation.proceed();// 执行需要Log的方法  
        LOG.info(invocation.getMethod() + ":END!--(LOG)");// 方法后的操作  
       
        return obj;  
    }  
  
}  