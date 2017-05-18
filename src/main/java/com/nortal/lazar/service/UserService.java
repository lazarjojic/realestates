package com.nortal.lazar.service;

import com.nortal.lazar.entity.UserEntity;

public interface UserService {
	
	UserEntity save (UserEntity user);
	
	UserEntity getUser (String username);
	
	

}
