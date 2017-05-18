package com.nortal.lazar.agency.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.nortal.lazar.agency.entity.AgencyEntity;

@Repository("agencyRepository")
public class AgencyRepository {

	@PersistenceContext
	private EntityManager em;

	public AgencyEntity save(AgencyEntity agency) {
		em.persist(agency);
		em.flush();
		return agency;
	}

//	public Map<Integer, String> getAgenciesNames() {
//		TypedQuery<Object[]> query = em.createQuery("select id, name from Agency", Object[].class);
//		List<Object[]> resultList = query.getResultList();
//		Map<Integer, String> resultMap = new HashMap<Integer, String>(resultList.size());
//		for (Object[] result : resultList)
//			resultMap.put((int) result[0], (String) result[1]);
//		return resultMap;
//	}
	
	public List<Object[]> getAgenciesNames() {
		Query query = em.createQuery("select id, name from AgencyEntity");
		List<Object[]> resultList = query.getResultList();		
		return resultList;
	}
	
	public AgencyEntity getAgency(int id) {
		Query query = em.createQuery("select agency from AgencyEntity as agency where id=:id");
		query.setParameter("id", id);
		List<AgencyEntity> resultList = query.getResultList();		
		return resultList.get(0);
	}

}
