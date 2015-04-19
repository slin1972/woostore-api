package com.nodexy.woostore.server.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nodexy.woostore.server.domain.Version;
import com.nodexy.woostore.server.service.FeedbackService;
import com.nodexy.woostore.server.service.VersionService;
import com.nodexy.woostore.server.util.CommonResult;
import com.nodexy.woostore.server.util.ReturnResult;

@RestController
@RequestMapping("/version")
public class VersionController {

	@Resource
	private FeedbackService feedbackService;
	@Autowired
	private VersionService versionService;

	@RequestMapping(value = "/last", method = RequestMethod.GET)
	public CommonResult last(
			@RequestParam(value = "av") String av,
			@RequestParam(value = "et") String et,
			@RequestParam(value = "os") String os,
			@RequestParam(value = "m") String m,
			@RequestParam String dpi,HttpSession session) {
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
