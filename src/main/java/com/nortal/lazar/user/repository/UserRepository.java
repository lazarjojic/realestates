package com.nortal.lazar.user.repository;

import java.util.List;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.user.entity.UserEntity;

public interface UserRepository {

	UserEntity save(UserEntity user);

	UserEntity getUser(String username);

	void updateUser(UserEntity userEntity);

	void updatePassword(int ID, String password);
	
	List<Object[]> getUsernames (String status);
	
	//get users and their agencies names
	List<Object[]> getUsers(String firstName, String lastName, String phone, int agencyID, String status, String username);
	
}
