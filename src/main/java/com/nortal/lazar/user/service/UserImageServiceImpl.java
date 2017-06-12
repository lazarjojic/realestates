package com.nortal.lazar.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.user.repository.UserImageRepository;

@Service("userImageService")
public class UserImageServiceImpl implements UserImageService {

	@Autowired
	private UserImageRepository userImageRepository;

	@Transactional
	@Override
	public String getImagePath(int userID) {
		return userImageRepository.getImagePath(userID);
	}

}
