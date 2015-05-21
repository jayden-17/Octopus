package com.js.octopus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.octopus.entity.StorageEntity;

public interface StorageRepository extends JpaRepository<StorageEntity, Long>{

}
