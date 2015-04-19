package com.nodexy.woostore.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.nodexy.woostore.server.domain.Version;

@Repository
public class VersionDaoPlus{
	
	@PersistenceContext
    private EntityManager em;
	
	public Version findLastVersionByOS(String os){
		Query query = em.createQuery("select c from Version c where c.os = ?1 order by id desc", Version.class).setParameter(1, os);
		query.setFirstResult(0).setMaxResults(1);
		@SuppressWarnings("unchecked")
		List<Version> versions = query.getResultList();
		Version version = versions == null ? null :(versions.isEmpty()?null:versions.get(0));
		return version ;
	}

}
