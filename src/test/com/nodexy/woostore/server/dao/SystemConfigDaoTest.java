package com.nodexy.woostore.server.dao;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import com.nodexy.woostore.server.BaseTest;
import com.nodexy.woostore.server.domain.SystemConfig;

public class SystemConfigDaoTest extends BaseTest{
	@Resource
	private SystemConfigDao systemConfigDao;
	
	private String key ;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}
	@Test
	public void test(){

		key = "aaa";
		SystemConfig s = systemConfigDao.findByKeyName(key);
		Assert.assertNotNull(s);
		Assert.assertEquals(key, "aaa");
		System.out.println(s);
	}
}
