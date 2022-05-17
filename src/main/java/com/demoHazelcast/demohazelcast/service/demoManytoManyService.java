package com.demoHazelcast.demohazelcast.service;

import java.util.List;
import com.demoHazelcast.demohazelcast.entity.demoManytoMany;

public interface demoManytoManyService {
	List<demoManytoMany> findAll();

	demoManytoMany insert(demoManytoMany demoManytoMany);
}
