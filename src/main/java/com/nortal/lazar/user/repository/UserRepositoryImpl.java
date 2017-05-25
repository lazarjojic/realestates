package com.nortal.lazar.user.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

import org.springframework.stereotype.Repository;

import com.nortal.lazar.user.entity.UserEntity;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager em;

	public UserEntity save(UserEntity userEntity) {
		em.persist(userEntity);
		return userEntity;
	}

	// public User getUser(String username) {
	// Query query = em.createQuery("select password from UserEntity where
	// username=:username");
	// query.setParameter("username", username);
	// List<Object[]> resultList = query.getResultList();
	//
	// if (resultList.isEmpty())
	// return null;
	// Object [] row = resultList.get(0);
	//
	//
	//// String firstName = (String) resultList.get(1);
	//// String lastName = (String) resultList.get(2);
	//// String phone = (String) resultList.get(3);
	//// int agencyID = (int) resultList.get(4);
	//// String status = (String) resultList.get(5);
	////
	//// String password = (String) resultList.get(7);
	//
	//
	//
	// String firstName = (String)row[1];
	// String lastName = (String) row[2];
	// String phone = (String) row[3];
	// int agencyID = (int) row[4];
	// String status = (String) row[5];
	//
	// String password = (String) row[7];
	//
	// User user = new User(firstName, lastName, phone, agencyID, status,
	// username, password);
	// return user;
	// }

	public UserEntity getUser(String username) {
		Query query = em.createQuery("select u from UserEntity as u where username=:username");
		query.setParameter("username", username);
		List<UserEntity> resultList = query.getResultList();

		if (resultList.isEmpty())
			return null;
		UserEntity userEntity = resultList.get(0);

		// String firstName = (String) resultList.get(1);
		// String lastName = (String) resultList.get(2);
		// String phone = (String) resultList.get(3);
		// int agencyID = (int) resultList.get(4);
		// String status = (String) resultList.get(5);
		//
		// String password = (String) resultList.get(7);

		return userEntity;
	}

	// public void updateUser (UserEntity userEntity) {
	// UserEntity em.find(UserEntity.class, userEntity.getId());
	// }

	@Override
	public void updatePassword (int ID, String password) {
		UserEntity userToUpdate = em.find(UserEntity.class, ID);
		userToUpdate.setPassword(password);
	}

	@Override
	public void updateUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		
	}

}
