package com.demoHazelcast.demohazelcast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoHazelcast.demohazelcast.entity.demo;

public interface demoRepository extends JpaRepository<demo, Long> {

}
