package com.woo.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woo.server.dao.ItemDao;
import com.woo.server.domain.Item;

@Service
@Transactional(readOnly=true)
public class ItemService {
	
	@Autowired
	private ItemDao itemDao;
	
	public Item add(Item item) {
		item = itemDao.save(item);
		return item ;
	}

	public Item findById(String id) {
		return itemDao.findById(id);
	}
	
	public List<Item> findByCategoryId(String categoryId){
		return itemDao.findByCategoryId(categoryId);
	}
}
