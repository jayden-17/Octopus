package com.js.octopus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.js.octopus.entity.StorageEntity;
import com.js.octopus.repository.StorageRepository;
import com.js.octopus.service.StorageService;

@Service
@Transactional(readOnly=true)
public class StorageServiceImpl implements StorageService {

	@Autowired
	private StorageRepository storageRepository;
	
	public List<StorageEntity> findAll() {
		return storageRepository.findAll();
	}
	
	public StorageEntity findOne(Long id) {
		return storageRepository.findOne(id);
	}
}
