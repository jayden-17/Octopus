package com.js.octopus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.js.octopus.entity.SystemEntity;

public interface SystemRepository extends JpaRepository<SystemEntity, Long> {
	
	@Query("Select a from SystemEntity a where a.hostIp = ?#{[0]}")
	List<SystemEntity> findByHostIp(String hostip);

}
