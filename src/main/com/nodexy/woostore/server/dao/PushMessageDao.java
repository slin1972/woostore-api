package com.nodexy.woostore.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nodexy.woostore.server.domain.PushMessage;


public interface PushMessageDao extends JpaRepository<PushMessage, Long> {

	PushMessage findById(Long mid);
	
}