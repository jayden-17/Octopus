package com.js.octopus.service;

import java.util.List;

import com.js.octopus.entity.StorageEntity;


public interface StorageService {

	public List<StorageEntity> findAll();
	public StorageEntity findOne(Long id);
}
