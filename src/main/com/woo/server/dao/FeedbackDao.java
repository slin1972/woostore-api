package com.woo.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woo.server.domain.Feedback;


public interface FeedbackDao extends JpaRepository<Feedback, Long> {

    public Feedback findById(Long id);
}
