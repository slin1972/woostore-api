package com.woo.server.service;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woo.server.dao.FeedbackDao;
import com.woo.server.dao.FeedbackDaoPlus;
import com.woo.server.domain.Feedback;
import com.woo.server.page.PageParams;

@Service
@Transactional(readOnly=true)
public class FeedbackService{
	
	@Autowired
	private FeedbackDao feedbackDao;
	@Autowired
	private FeedbackDaoPlus feedbackDaoPlus;
	
	public Feedback add(Feedback feedback) {
		feedback = feedbackDao.save(feedback);
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
