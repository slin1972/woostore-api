package com.nodexy.woostore.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nodexy.woostore.server.domain.Version;

public interface VersionDao extends JpaRepository<Version, Long> {

}
