package com.demoHazelcast.demohazelcast.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import com.demoHazelcast.demohazelcast.entity.SinhVienEntity;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVienEntity, Long> {
	@Procedure(procedureName = "get_all_sinhvien")
	List<SinhVienEntity> getAllSinhVien();
}
