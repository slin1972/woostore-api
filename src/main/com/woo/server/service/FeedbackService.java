package com.woo.server.service;  

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.woo.server.dao.FeedbackDao;
import com.woo.server.dao.FeedbackDaoPlus;
import com.woo.server.domain.Feedback;
import com.woo.server.page.PageParams;

@Service
public class FeedbackService{
	
	private final static Logger LOG = LoggerFactory.getLogger(FeedbackService.class);  
	
	@Autowired
	private FeedbackDao feedbackDao;
	@Autowired
	private FeedbackDaoPlus feedbackDaoPlus;
	
	public Feedback add(Feedback feedback) {
		LOG.debug("[Method:add] before:"+ feedback);
		feedback = feedbackDao.save(feedback);
		LOG.debug("[Method:add] after:"+ feedback);
		return feedback ;
	}

	public Page<Feedback> findPage(Feedback feedback, PageParams pageParams) {
		return feedbackDaoPlus.page(feedback, pageParams);
	}

	public Feedback findById(long fid) {
		return feedbackDao.findById(fid);
	}

	public void save(Feedback feedback) {
		feedbackDao.save(feedback);
	}
}
