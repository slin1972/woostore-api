package com.nodexy.woostore.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nodexy.woostore.server.dao.CategoryDao;
import com.nodexy.woostore.server.domain.Category;

@Service
@Transactional(readOnly=true)
public class CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;
	
	public Category add(Category category) {
		category = categoryDao.save(category);
		return category ;
	}

	public List<Category> findAll() {
		return categoryDao.findAll();
	}
}
