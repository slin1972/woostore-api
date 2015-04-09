package com.woo.server.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.woo.server.domain.SystemConfig;
@Transactional(readOnly=true)
public interface SystemConfigDao extends JpaRepository<SystemConfig, Long> {

    public SystemConfig findByKeyName(String key);

	@Query("select max(c.updateTime) from SystemConfig c")
	public Object getMaxTime();

	@Query("select c from SystemConfig c where configType = 'request_url'")
	public List<SystemConfig> findAllRequestUrl();
}