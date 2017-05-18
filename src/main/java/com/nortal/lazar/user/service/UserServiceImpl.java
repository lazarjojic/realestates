package com.nortal.lazar.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.user.entity.UserEntity;
import com.nortal.lazar.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public UserEntity save(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Transactional
	public UserEntity getUser(String username) {
		return userRepository.getUser(username);
	}

}
