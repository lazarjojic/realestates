package com.nortal.lazar.realestate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.realestate.entity.PhotoEntity;
import com.nortal.lazar.realestate.repository.PhotoRepository;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoRepository photoRepository;

	@Transactional
	@Override
	public void save(PhotoEntity photoEntity) {
		photoRepository.save(photoEntity);
	}

}
