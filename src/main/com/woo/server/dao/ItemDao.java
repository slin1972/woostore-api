package com.woo.server.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woo.server.domain.Item;

public interface ItemDao  extends JpaRepository<Item, Long> {

	List<Item> findByCategoryId(String categoryId);

	Item findById(String id);

}
