package com.woo.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woo.server.domain.PushMessage;


public interface PushMessageDao extends JpaRepository<PushMessage, Long> {

	PushMessage findById(Long mid);
	
}