package com.demoHazelcast.demohazelcast.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demoHazelcast.demohazelcast.entity.SinhVienEntity;
import com.demoHazelcast.demohazelcast.model.SinhVien;

@Component
public class SinhVienConverter {

	public SinhVienEntity toEntity(SinhVien sinhVien) {
		SinhVienEntity entity = new SinhVienEntity();
		entity.setId(sinhVien.getId());
		entity.setName(sinhVien.getName());
		return entity;
	}

	public SinhVien toModel(SinhVienEntity entity) {
		SinhVien model = new SinhVien();
		model.setId(entity.getId());
		model.setName(entity.getName());
		model.setClass_id(entity.getClass_id().getId());
		return model;
	}

	public List<SinhVien> toListModel(List<SinhVienEntity> entity) {
		List<SinhVien> model = new ArrayList<SinhVien>();

		for (SinhVienEntity sinhVienEntity : entity) {
			SinhVien sv = new SinhVien();
			sv.setId(sinhVienEntity.getId());
			sv.setName(sinhVienEntity.getName());
			sv.setClass_id(sinhVienEntity.getClass_id().getId());
			model.add(sv);
		}

		return model;
	}
}
