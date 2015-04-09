package com.woo.server.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.woo.server.domain.Feedback;
import com.woo.server.page.PageParams;

@Repository
public class FeedbackDaoPlus{

	@PersistenceContext
    private EntityManager em;

	
	@SuppressWarnings("unchecked")
	public Page<Feedback> page(Feedback feedback, PageParams pageParams) {
		StringBuilder countQl = new StringBuilder("select count(c) from Feedback c");
		StringBuilder selectQl = new StringBuilder("select c from Feedback c");
		Map<String,Object> os = null;
		if(feedback!=null && !StringUtils.isEmpty(feedback.getType())){
			os = new HashMap<String, Object>();
			countQl.append(" where c.type like :type");
			selectQl.append(" where c.type like :type");
			os.put("type", "%"+feedback.getType()+"%");
		}
		if(feedback!=null && !StringUtils.isEmpty(feedback.getState())){
			os = new HashMap<String, Object>();
			countQl.append(" where c.state = :state");
			selectQl.append(" where c.state = :state");
			os.put("state", feedback.getState());
		}
		Query squery = em.createQuery(selectQl.toString());
		Query cquery = em.createQuery(countQl.toString());
		if(os!=null&&os.size()>0){
			Set<String> set =  os.keySet();
			for(String s : set){
				squery.setParameter(s, os.get(s));
				cquery.setParameter(s, os.get(s));
			}
		}
		
		Long c = (Long) cquery.getSingleResult();
		
		if(c!=null && c>0){
			squery.setFirstResult((pageParams.getPage())*pageParams.getSize());
			squery.setMaxResults(pageParams.getSize());
			return new PageImpl<Feedback>(squery.getResultList(), pageParams.toPageable(),c);
		}
		
		return null;
	}
}
