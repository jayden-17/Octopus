package com.js.octopus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.js.octopus.entity.SystemEntity;
import com.js.octopus.repository.SystemRepository;
import com.js.octopus.service.SystemService;

@Service
@Transactional(readOnly=true)
public class SystemServiceImpl implements SystemService {

	@Autowired
	private SystemRepository systemRepository;
		
	public List<SystemEntity> findAll() {
		return systemRepository.findAll();
	}
	
	public SystemEntity findOne(Long id) {
		return systemRepository.findOne(id);
	}

	public List<SystemEntity> findByHostIp(String hostip) {
		return systemRepository.findByHostIp(hostip);
	}
	
}
