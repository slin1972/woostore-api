package com.woo.server.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.woo.server.domain.Feedback;
import com.woo.server.error.ReturnCode;
import com.woo.server.service.FeedbackService;
import com.woo.server.util.CommonResult;
import com.woo.server.util.JsonUtil;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Resource
	private FeedbackService feedbackService;
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public CommonResult add(
			@RequestAttribute(value = "uid") Long uid,
			@RequestAttribute(value = "feedback") String feedbackJson,
			@RequestAttribute(value = "av") String av,
			@RequestAttribute(value = "et") String et,
			@RequestAttribute(value = "os") String os,
			@RequestAttribute(value = "m") String m,
			@RequestAttribute String dpi,HttpSession session) {
		Feedback feedback = null;
		try {
			feedback = JsonUtil.jsonToObject(feedbackJson, Feedback.class);
		} catch (IOException e) {
			return ReturnCode.ERROR_123 ;
		}
		
		/***
		 * 如果该用户存在
		 */
		
		feedback.setUserId(uid);
		feedbackService.add(feedback);
		if(feedback!=null && feedback.getId()!=null){
			return ReturnCode.OK_0;
		}else{
			return ReturnCode.ERROR_124;
		}
	}
}
