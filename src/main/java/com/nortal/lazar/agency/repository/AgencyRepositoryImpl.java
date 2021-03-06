package com.nortal.lazar.agency.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.nortal.lazar.agency.entity.AgencyEntity;

@Repository("agencyRepository")
public class AgencyRepositoryImpl implements AgencyRepository {

	@PersistenceContext
	private EntityManager em;

	/* (non-Javadoc)
	 * @see com.nortal.lazar.agency.repository.AgencyRepository#save(com.nortal.lazar.agency.entity.AgencyEntity)
	 */
	@Override
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
	
	/* (non-Javadoc)
	 * @see com.nortal.lazar.agency.repository.AgencyRepository#getAgenciesNames()
	 */
	@Override
	public List<Object[]> getAgenciesNames() {
		Query query = em.createQuery("select id, name from AgencyEntity");
		List<Object[]> resultList = query.getResultList();		
		return resultList;
	}
	
	/* (non-Javadoc)
	 * @see com.nortal.lazar.agency.repository.AgencyRepository#getAgency(int)
	 */
	@Override
	public AgencyEntity getAgency(int id) {
		Query query = em.createQuery("select agency from AgencyEntity as agency where id=:id");
		query.setParameter("id", id);
		List<AgencyEntity> resultList = query.getResultList();		
		return resultList.get(0);
	}

}
