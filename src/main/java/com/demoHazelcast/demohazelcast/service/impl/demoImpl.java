package com.demoHazelcast.demohazelcast.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.demoHazelcast.demohazelcast.entity.demo;
import com.demoHazelcast.demohazelcast.repository.demoRepository;
import com.demoHazelcast.demohazelcast.service.demoService;

@Service
public class demoImpl implements demoService {

	private final demoRepository demoRepository;

	public demoImpl(com.demoHazelcast.demohazelcast.repository.demoRepository demoRepository) {
		super();
		this.demoRepository = demoRepository;
	}

	@Override
	public List<demo> findAll() {
		return demoRepository.findAll();
	}

	@Override
	public demo insert(demo demoManytoMany) {
	
		return null;
	}

}
