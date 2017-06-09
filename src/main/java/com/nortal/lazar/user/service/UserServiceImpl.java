package com.nortal.lazar.user.service;

import java.util.List;

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
	@Override
	public UserEntity save(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Transactional
	@Override
	public UserEntity getUser(String username) {
		return userRepository.getUser(username);
	}

	@Transactional
	@Override
	public void updatePassword(int userID, String newPassword) {
		userRepository.updatePassword(userID, newPassword);
	}

	@Transactional
	@Override
	public List<Object[]> getUsernames(String status) {
		return userRepository.getUsernames(status);		
	}

}
