package com.nortal.lazar.user.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

import org.springframework.stereotype.Repository;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.user.entity.UserEntity;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager em;

	public UserEntity save(UserEntity userEntity) {
		em.persist(userEntity);
		return userEntity;
	}

	public UserEntity getUser(String username) {
		Query query = em.createQuery("select user from UserEntity as user where username=:username");
		query.setParameter("username", username);
		List<UserEntity> resultList = query.getResultList();

		if (resultList.isEmpty())
			return null;
		UserEntity userEntity = resultList.get(0);
		return userEntity;
	}

	@Override
	public void updatePassword(int ID, String password) {
		UserEntity userToUpdate = em.find(UserEntity.class, ID);
		userToUpdate.setPassword(password);
	}

	@Override
	public void updateUser(UserEntity userEntity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Object[]> getUsernames(String status) {
		Query query = em.createQuery("select user.id, user.username from UserEntity as user where status=:status");
		query.setParameter("status", status);
		return (List<Object[]>) query.getResultList();
	}

	// get users and their agencies names
	@Override
	public List<Object[]> getUsers(String firstName, String lastName, String userPhone, int agencyID, String status, String username) {
		StringBuffer buf = new StringBuffer();
		buf.append("select ");
		buf.append("user.firstName, user.lastName, user.phone, agency.name, user.status, user.username ");
		buf.append("from UserEntity as user, AgencyEntity as agency ");
		buf.append("where (user.agencyID=agency.ID) ");
		buf.append("and (user.firstName=:firstName or :firstName is null) ");
		buf.append("and (user.lastName=:lastName or :lastName is null) ");
		buf.append("and (user.phone=:userPhone or :userPhone is null) ");
		buf.append("and (user.agencyID=:agencyID or :agencyID is null) ");
		buf.append("and (user.status=:status or :status is null) ");
		buf.append("and (user.username=:username or :username is null) ");
		String queryText = buf.toString();
		Query query = em.createQuery(queryText);
		query.setParameter("firstName", firstName);
		query.setParameter("lastName", lastName);
		query.setParameter("userPhone", userPhone);
		query.setParameter("agencyID", agencyID);
		query.setParameter("status", status);
		query.setParameter("username", username);
		return (List<Object[]>) query.getResultList();
	}

}
