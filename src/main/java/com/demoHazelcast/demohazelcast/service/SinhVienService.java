package com.demoHazelcast.demohazelcast.service;

import java.util.List;
import java.util.Optional;
import com.demoHazelcast.demohazelcast.entity.SinhVienEntity;

public interface SinhVienService {
	
	
	List<SinhVienEntity> findAllSinhVien();
	
	
	Optional<SinhVienEntity> findById(Long id);

	SinhVienEntity saveSinhVien(SinhVienEntity sinhVienEntity);

	SinhVienEntity updateSinhVien(SinhVienEntity sinhVienEntity);

	void deleteEmployee(Long id);

	
	List<SinhVienEntity> ProdGetAll();

	
	void clearCache();
}
