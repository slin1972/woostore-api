package com.nodexy.woostore.server;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class BaseTest extends TestCase {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(1421901115000L);
		System.out.println(c.getTime().toLocaleString());
	}
}
