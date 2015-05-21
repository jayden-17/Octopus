package com.js.octopus.service;

import java.util.List;

import com.js.octopus.entity.SystemEntity;

public interface SystemService {

	public List<SystemEntity> findAll();
	public SystemEntity findOne(Long id);
	public List<SystemEntity> findByHostIp(String hostip);
}
