package com.demoHazelcast.demohazelcast.service;

import java.util.List;
import com.demoHazelcast.demohazelcast.entity.demo;

public interface demoService {
	List<demo> findAll();
	
	demo insert(demo demoManytoMany);
}
