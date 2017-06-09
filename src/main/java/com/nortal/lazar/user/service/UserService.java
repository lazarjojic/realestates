package com.nortal.lazar.user.service;

import java.util.List;

import com.nortal.lazar.user.entity.UserEntity;

public interface UserService {

	UserEntity save(UserEntity user);

	UserEntity getUser(String username);

	void updatePassword(int userID, String newPassword);

	List<Object[]> getUsernames(String status);

}
