package com.demoHazelcast.demohazelcast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demoHazelcast.demohazelcast.entity.demoManytoMany;

public interface demoManytoManyRepository extends JpaRepository<demoManytoMany, Long> {

}
