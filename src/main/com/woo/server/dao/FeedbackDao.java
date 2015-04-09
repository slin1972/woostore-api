package com.woo.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.woo.server.domain.Feedback;

@Transactional(readOnly=true)
public interface FeedbackDao extends JpaRepository<Feedback, Long> {

    public Feedback findById(Long id);
}
