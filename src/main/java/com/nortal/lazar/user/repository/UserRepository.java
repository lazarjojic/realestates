package com.nortal.lazar.user.repository;

import java.util.List;

import com.nortal.lazar.user.entity.UserEntity;

public interface UserRepository {

	UserEntity save(UserEntity user);

	UserEntity getUser(String username);

	void updateUser(UserEntity userEntity);

	void updatePassword(int ID, String password);
	
	List<Object[]> getUsernames (String status);

}
