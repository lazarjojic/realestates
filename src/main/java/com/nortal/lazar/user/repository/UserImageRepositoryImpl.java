package com.nortal.lazar.user.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository("userImageRepository")
public class UserImageRepositoryImpl implements UserImageRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public String getImagePath(int userID) {
		Query query = em.createQuery("SELECT image_path from UserImageEntity as user_image where user_id=:user_id");
		query.setParameter("user_id", userID);
		List<String> resultList = query.getResultList();
		if (resultList.isEmpty())
			return null;
		return resultList.get(0);
	}

}
