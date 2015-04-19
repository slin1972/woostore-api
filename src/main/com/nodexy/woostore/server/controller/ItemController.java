package com.nodexy.woostore.server.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nodexy.woostore.server.domain.Comment;
import com.nodexy.woostore.server.domain.Item;
import com.nodexy.woostore.server.service.ItemService;
import com.nodexy.woostore.server.util.CommonResult;
import com.nodexy.woostore.server.util.ReturnResult;

/***
 * 全部分类item
 * @author slin 2015/4/9
 *
 */
@RestController
@RequestMapping("/item")
public class ItemController {
	private ItemService itemService;
	
	@RequestMapping(value = "info/id", method = RequestMethod.GET)
	public CommonResult byCid(
			@RequestParam(value = "av") String av,
			@RequestParam(value = "id") String id,
			@RequestParam(value = "et") String et,
			@RequestParam(value = "os") String os,
			@RequestParam(value = "m") String m,
			@RequestParam String dpi,HttpSession session) {
		ReturnResult r = new ReturnResult(true, 0, "OK") ;
		
		Item item = itemService.findById(id);
		
		r.setData(item);
		return r;
	}
	
	@RequestMapping(value = "down/id", method = RequestMethod.GET)
	public CommonResult down(
			@RequestParam(value = "av") String av,
			@RequestParam(value = "id") String id,
			@RequestParam(value = "et") String et,
			@RequestParam(value = "os") String os,
			@RequestParam(value = "m") String m,
			@RequestParam String dpi,HttpSession session) {
		ReturnResult r = new ReturnResult(true, 0, "OK") ;
		
		Item item = itemService.findById(id);
		
		r.setData(item);
		return r;
	}
	
	@RequestMapping(value = "comment", method = RequestMethod.GET)
	public CommonResult comment(
			@RequestParam(value = "av") String av,
			@RequestParam(value = "id") String id,
			@RequestParam(value = "et") String et,
			@RequestParam(value = "os") String os,
			@RequestParam(value = "m") String m,
			@RequestParam String dpi,HttpSession session) {
		ReturnResult r = new ReturnResult(true, 0, "OK") ;
		
		Item item = itemService.findById(id);
		
		if(item != null){
			//評論
			Comment c = new Comment();
			//c.setCreateTime(createTime);
		}
		
		r.setData(item);
		return r;
	}
}
