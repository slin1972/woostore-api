package com.woo.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woo.server.domain.Version;

public interface VersionDao extends JpaRepository<Version, Long> {

}
