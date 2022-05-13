package com.demoHazelcast.demohazelcast.service;

import java.util.List;
import com.demoHazelcast.demohazelcast.model.SinhVien;

public interface SinhVienService {
	
	
	List<SinhVien> findAllSinhVien();
	
	
	SinhVien findById(Long id);

	SinhVien saveSinhVien(SinhVien SinhVien);

	SinhVien updateSinhVien(SinhVien SinhVien);

	void deleteEmployee(Long id);
	
	List<SinhVien> ProdGetAll();

	
	void clearCache();
}
