package com.woo.server.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.woo.server.domain.Category;
import com.woo.server.domain.Item;
import com.woo.server.service.CategoryService;
import com.woo.server.service.ItemService;
import com.woo.server.util.CommonResult;
import com.woo.server.util.ReturnResult;

/***
 * 全部分类controller
 * @author slin 2015/4/9
 *
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	private CategoryService categoryService;
	
	private ItemService itemService;
	
	@RequestMapping(value = {"/list",""}, method = RequestMethod.GET)
	public CommonResult list(
			@RequestParam(value = "av") String av,
			@RequestParam(value = "et") String et,
			@RequestParam(value = "os") String os,
			@RequestParam(value = "m") String m,
			@RequestParam String dpi,HttpSession session) {
		ReturnResult r = new ReturnResult(true, 0, "OK") ;
		
		List<Category> categoryList = categoryService.findAll();
		
		r.setData(categoryList);
		return r;
	}
	

	@RequestMapping(value = "cid", method = RequestMethod.GET)
	public CommonResult byCid(
			@RequestParam(value = "av") String av,
			@RequestParam(value = "cid") String cid,
			@RequestParam(value = "et") String et,
			@RequestParam(value = "os") String os,
			@RequestParam(value = "m") String m,
			@RequestParam String dpi,HttpSession session) {
		ReturnResult r = new ReturnResult(true, 0, "OK") ;
		
		List<Item> itemList = itemService.findByCategoryId(cid);
		
		r.setData(itemList);
		return r;
	}
}
