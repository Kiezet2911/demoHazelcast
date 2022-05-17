package com.demoHazelcast.demohazelcast.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demoHazelcast.demohazelcast.entity.demoManytoMany;
import com.demoHazelcast.demohazelcast.repository.demoManytoManyRepository;
import com.demoHazelcast.demohazelcast.service.demoManytoManyService;

@Service
public class demoManytoManyImpl implements demoManytoManyService {

	private final demoManytoManyRepository demoManytoManyRepository;

	public demoManytoManyImpl(
			com.demoHazelcast.demohazelcast.repository.demoManytoManyRepository demoManytoManyRepository) {
		super();
		this.demoManytoManyRepository = demoManytoManyRepository;
	}

	@Override
	public List<demoManytoMany> findAll() {
		return demoManytoManyRepository.findAll();
	}

	@Override
	public demoManytoMany insert(demoManytoMany demoManytoMany) {
		// TODO Auto-generated method stub
		return null;
	}

}
