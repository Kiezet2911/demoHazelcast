package com.demoHazelcast.demohazelcast.service.impl;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demoHazelcast.demohazelcast.entity.SinhVienEntity;
import com.demoHazelcast.demohazelcast.repository.SinhVienRepository;
import com.demoHazelcast.demohazelcast.service.SinhVienService;
import java.util.List;
import java.util.Optional;

@Service
@CacheConfig(cacheNames = "sinhVienEntity")
public class SinhVienServiceImpl implements SinhVienService {

	private final SinhVienRepository sinhVienRepository;

	public SinhVienServiceImpl(SinhVienRepository sinhVienRepository) {
		this.sinhVienRepository = sinhVienRepository;
	}

	@Override
	public List<SinhVienEntity> findAllSinhVien() {
		return sinhVienRepository.findAll();
	}

	@Override
	public Optional<SinhVienEntity> findById(Long id) {
		return sinhVienRepository.findById(id);
	}

	@Override
	public SinhVienEntity saveSinhVien(SinhVienEntity sinhVienEntity) {
		return sinhVienRepository.save(sinhVienEntity);
	}

	@Override
	public SinhVienEntity updateSinhVien(SinhVienEntity sinhVienEntity) {
		return sinhVienRepository.save(sinhVienEntity);
	}

	@Override
	public void deleteEmployee(Long id) {
		sinhVienRepository.deleteById(id);
	}

	@Override
	@Cacheable()
	public List<SinhVienEntity> ProdGetAll() {
		return sinhVienRepository.getAllSinhVien();
	}

	@Override
	@CacheEvict(allEntries = true)
	public void clearCache() {		
	}
}
