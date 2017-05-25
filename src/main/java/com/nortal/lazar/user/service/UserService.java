package com.nortal.lazar.user.service;

import com.nortal.lazar.user.entity.UserEntity;

public interface UserService {

	UserEntity save(UserEntity user);

	UserEntity getUser(String username);

	void updatePassword(int userID, String newPassword);

}
