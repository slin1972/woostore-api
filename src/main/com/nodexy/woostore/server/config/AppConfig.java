package com.nodexy.woostore.server.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nodexy.woostore.server.dao.SystemConfigDao;
import com.nodexy.woostore.server.domain.SystemConfig;

@Service
public class AppConfig {

	private Map<String,SystemConfig> map = null;
	private List<SystemConfig> list = null ;
	
	private static AppConfig appConfig = null;
	
	public static AppConfig getInstance(){
		return appConfig;
	}

	@Resource
	private SystemConfigDao systemConfigDao ;
	
	public AppConfig(){
		if(appConfig != null){
			throw new RuntimeException();
		}
		appConfig = this ;
	}
	
	private synchronized void initConfig(){
		if(map == null){
			list = systemConfigDao.findAll();
			map = new HashMap<String, SystemConfig>();
			for(SystemConfig s : list){
				map.put(s.getKeyName(), s);
			}
		}
	}
	
	public String getConfigValue(String key){
		if (map == null) initConfig();
		SystemConfig c = map.get(key) ;
		if(c != null)
			return c.getValue();
		return null ;
	}
	
	public Long getTokenTimeout() {
		String s = getConfigValue("tokenTimeout");
		return s == null ? null : Long.parseLong(s);
	}

	public boolean isFunctionClose(String key) {
		return "1".equals(getConfigValue(key))?false:true ;
	}

	public List<SystemConfig> getConfigList() {
		if(list == null)initConfig();
		return list;
	}
}
