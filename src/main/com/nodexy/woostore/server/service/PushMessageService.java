package com.nodexy.woostore.server.service;  

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nodexy.woostore.server.dao.PushMessageDao;
import com.nodexy.woostore.server.domain.PushMessage;

@Service
@Transactional(readOnly=true)
public class PushMessageService{
	
	private final static Logger LOG = LoggerFactory.getLogger(PushMessageService.class);  
	
    @Autowired
    private PushMessageDao pushMessageDao ;

	public PushMessage findById(Long mid) {
		LOG.info("before:mid"+mid);
		PushMessage pushMessage = pushMessageDao.findById(mid);
		LOG.info("after:pushMessage"+pushMessage);
		return pushMessage;
	}

}
