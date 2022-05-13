package com.demoHazelcast.demohazelcast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demoHazelcast.demohazelcast.entity.ClassEntity;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Long> {
	ClassEntity findOneByid(Long id);
}
