package com.nodexy.woostore.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nodexy.woostore.server.domain.Feedback;


public interface FeedbackDao extends JpaRepository<Feedback, Long> {

    public Feedback findById(Long id);
}
