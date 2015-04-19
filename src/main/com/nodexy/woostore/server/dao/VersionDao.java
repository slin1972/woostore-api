package com.nodexy.woostore.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nodexy.woostore.server.domain.AppVersion;

public interface VersionDao extends JpaRepository<AppVersion, Long> {

}
