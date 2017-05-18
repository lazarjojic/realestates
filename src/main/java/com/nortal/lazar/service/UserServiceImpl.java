package com.nortal.lazar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.entity.UserEntity;
import com.nortal.lazar.repository.UserRepository;

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
