package com.nodexy.woostore.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nodexy.woostore.server.domain.Category;

public interface CategoryDao  extends JpaRepository<Category, Long> {

}
