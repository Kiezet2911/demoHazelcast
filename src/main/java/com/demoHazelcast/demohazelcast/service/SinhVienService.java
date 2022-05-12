package com.demoHazelcast.demohazelcast.service;

import java.util.List;
import java.util.Optional;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import com.demoHazelcast.demohazelcast.entity.SinhVienEntity;

public interface SinhVienService {
	
	
	List<SinhVienEntity> findAllSinhVien();
	
	@Cacheable(value = "sv",key = "#id",unless = "#result==null")
	Optional<SinhVienEntity> findById(Long id);

	SinhVienEntity saveSinhVien(SinhVienEntity sinhVienEntity);

	SinhVienEntity updateSinhVien(SinhVienEntity sinhVienEntity);

	void deleteEmployee(Long id);

	@Cacheable(cacheNames = { "Sv" })
	List<SinhVienEntity> ProdGetAll();

	@CacheEvict(allEntries = true)
	void clearCache();
}
