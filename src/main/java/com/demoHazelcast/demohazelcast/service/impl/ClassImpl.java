package com.demoHazelcast.demohazelcast.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.demoHazelcast.demohazelcast.converter.ClassConverter;
import com.demoHazelcast.demohazelcast.entity.ClassEntity;
import com.demoHazelcast.demohazelcast.entity.SinhVienEntity;
import com.demoHazelcast.demohazelcast.model.Class;
import com.demoHazelcast.demohazelcast.repository.ClassRepository;
import com.demoHazelcast.demohazelcast.repository.SinhVienRepository;
import com.demoHazelcast.demohazelcast.service.ClassService;

@Service
public class ClassImpl implements ClassService {

	private final ClassRepository repository;

	private final ClassConverter classConverter;

	private final SinhVienRepository sinhVienRepository;

	public ClassImpl(ClassRepository repository, ClassConverter classConverter, SinhVienRepository sinhVienRepository) {
		this.repository = repository;
		this.classConverter = classConverter;
		this.sinhVienRepository = sinhVienRepository;
	}

	@Override
	public List<Class> findAll() {
		return classConverter.toListModel(repository.findAll());
	}

	@Override
	public Class findByID(Long id) {
		return classConverter.toModel(repository.findOneByid(id));
	}

	@Override
	public Class insert(Class cla) {
		List<SinhVienEntity> list = sinhVienRepository.findByid(cla.getId());

		ClassEntity classEntity = classConverter.toEntity(cla);
		classEntity.setSinhviens(list);

		return classConverter.toModel(repository.save(classEntity));
	}

//	@Override
	public Class update(Class ClassEntity) {
		return null;
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void clearCache() {
		// TODO Auto-generated method stub

	}

}
