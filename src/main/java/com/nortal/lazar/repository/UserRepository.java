package com.nortal.lazar.repository;

import com.nortal.lazar.entity.UserEntity;

public interface UserRepository {

	UserEntity save(UserEntity user);

	UserEntity getUser(String username);

}
