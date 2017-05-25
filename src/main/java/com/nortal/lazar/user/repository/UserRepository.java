package com.nortal.lazar.user.repository;

import com.nortal.lazar.user.entity.UserEntity;

public interface UserRepository {

	UserEntity save(UserEntity user);

	UserEntity getUser(String username);

	void updateUser(UserEntity userEntity);

	void updatePassword(int ID, String password);

}
