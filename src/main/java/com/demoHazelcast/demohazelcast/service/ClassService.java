package com.demoHazelcast.demohazelcast.service;

import java.util.List;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import com.demoHazelcast.demohazelcast.model.Class;

@CacheConfig(cacheNames = "Sv")
public interface ClassService {

	@Cacheable()
	List<Class> findAll();

	Class findByID(Long id);

	Class insert(Class Class);

	Class update(Class Class);

	void delete(Long id);

	@CacheEvict(allEntries = true)
	void clearCache();
}
