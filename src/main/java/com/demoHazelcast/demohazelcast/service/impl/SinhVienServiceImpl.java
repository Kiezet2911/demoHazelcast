package com.demoHazelcast.demohazelcast.service.impl;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demoHazelcast.demohazelcast.converter.SinhVienConverter;
import com.demoHazelcast.demohazelcast.entity.ClassEntity;
import com.demoHazelcast.demohazelcast.entity.SinhVienEntity;
import com.demoHazelcast.demohazelcast.model.SinhVien;
import com.demoHazelcast.demohazelcast.repository.ClassRepository;
import com.demoHazelcast.demohazelcast.repository.SinhVienRepository;
import com.demoHazelcast.demohazelcast.service.SinhVienService;
import java.util.List;

@Service
@CacheConfig(cacheNames = "sinhVienEntity")
public class SinhVienServiceImpl implements SinhVienService {

	private final SinhVienRepository sinhVienRepository;

	private final ClassRepository classRepository;

	private final SinhVienConverter sinhVienConverter;

	public SinhVienServiceImpl(SinhVienRepository sinhVienRepository, ClassRepository classRepository,
			SinhVienConverter sinhVienConverter) {
		this.sinhVienRepository = sinhVienRepository;
		this.classRepository = classRepository;
		this.sinhVienConverter = sinhVienConverter;
	}

	@Override
	public List<SinhVien> findAllSinhVien() {
		return sinhVienConverter.toListModel(sinhVienRepository.findAll());
	}

	@Override
	public SinhVien findById(Long id) {
		return sinhVienConverter.toModel(sinhVienRepository.findOneByid(id));
	}

	@Override
	public SinhVien saveSinhVien(SinhVien SinhVien) {

		ClassEntity classEntity = classRepository.findOneByid(SinhVien.getClass_id());

		SinhVienEntity sinhVienEntity = sinhVienConverter.toEntity(SinhVien);
		sinhVienEntity.setClass_id(classEntity);

		sinhVienEntity = sinhVienRepository.save(sinhVienEntity);

		return sinhVienConverter.toModel(sinhVienEntity);
	}

	@Override
	public SinhVien updateSinhVien(SinhVien SinhVien) {
		ClassEntity classEntity = classRepository.findOneByid(SinhVien.getClass_id());

		SinhVienEntity sinhVienEntity = sinhVienConverter.toEntity(SinhVien);
		sinhVienEntity.setClass_id(classEntity);

		sinhVienEntity = sinhVienRepository.save(sinhVienEntity);

		return sinhVienConverter.toModel(sinhVienEntity);
	}

	@Override
	public void deleteEmployee(Long id) {
		sinhVienRepository.deleteById(id);
	}

	@Override
	@Cacheable()
	public List<SinhVien> ProdGetAll() {
		return sinhVienConverter.toListModel(sinhVienRepository.getAllSinhVien());
	}

	@Override
	@CacheEvict(allEntries = true)
	public void clearCache() {
	}
}
