package com.js.octopus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.octopus.entity.SystemEntity;

public interface SystemRepository extends JpaRepository<SystemEntity, Long> {

}
