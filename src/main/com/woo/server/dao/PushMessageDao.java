package com.woo.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.woo.server.domain.PushMessage;

@Transactional(readOnly=true)
public interface PushMessageDao extends JpaRepository<PushMessage, Long> {

	PushMessage findById(Long mid);
	
}