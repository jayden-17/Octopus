package com.js.octopus.repository.impl;

import java.util.List;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.js.octopus.entity.SystemEntity;
import com.js.octopus.repository.SystemRepository;

@Repository
public class SystemRepositoryImpl extends SimpleJpaRepository<SystemEntity, Long> implements SystemRepository {

	public List<SystemEntity> findByHostIp(String hostip) {
		
		return null;
	}

}
