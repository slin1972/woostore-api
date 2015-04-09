package com.woo.server.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.woo.server.domain.Version;
import com.woo.server.service.FeedbackService;
import com.woo.server.service.VersionService;
import com.woo.server.util.CommonResult;
import com.woo.server.util.ReturnResult;

@RestController
@RequestMapping("/version")
public class VersionController {

	@Resource
	private FeedbackService feedbackService;
	@Autowired
	private VersionService versionService;

	@RequestMapping(value = "/last", method = RequestMethod.GET)
	public CommonResult last(
			@RequestAttribute(value = "av") String av,
			@RequestAttribute(value = "et") String et,
			@RequestAttribute(value = "os") String os,
			@RequestAttribute(value = "m") String m,
			@RequestAttribute String dpi,HttpSession session) {
		ReturnResult r = new ReturnResult(true, 0, "OK") ;
		
		Version version = null ;
		Map<String,Object> map = new HashMap<String,Object>();
		if(os.contains("android")){
			version = versionService.findLastVersionByOS("android");
		}else{
			version = versionService.findLastVersionByOS("ios");
		}
		
		map.put("version", version);
		r.setData(map);
		return r;
	}
}
