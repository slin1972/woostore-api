package com.woo.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woo.server.domain.Category;

public interface CategoryDao  extends JpaRepository<Category, Long> {

}
