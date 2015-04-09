package com.woo.server.service;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woo.server.dao.VersionDao;
import com.woo.server.dao.VersionDaoPlus;
import com.woo.server.domain.Version;

@Service
@Transactional(readOnly=true)
public class VersionService{

	@Autowired
	private VersionDao versionDao ;
	
	@Autowired
	private VersionDaoPlus versionDaoPlus ;

	public Version findLastVersionByOS(String os) {
		return versionDaoPlus.findLastVersionByOS(os);
	}
}
