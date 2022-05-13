package com.demoHazelcast.demohazelcast.converter;

import java.util.ArrayList;
import com.demoHazelcast.demohazelcast.model.Class;
import java.util.List;
import org.springframework.stereotype.Component;
import com.demoHazelcast.demohazelcast.entity.ClassEntity;

@Component
public class ClassConverter {

	public ClassEntity toEntity(Class Class) {
		ClassEntity entity = new ClassEntity();
		entity.setId(Class.getId());
		entity.setName(Class.getName());
		return entity;
	}

	public Class toModel(ClassEntity entity) {
		Class model = new Class();
		model.setId(entity.getId());
		model.setName(entity.getName());
		return model;
	}

	public List<Class> toListModel(List<ClassEntity> entity) {
		List<Class> model = new ArrayList<Class>();

		for (ClassEntity ClassEntity : entity) {
			Class cla = new Class();
			cla.setId(ClassEntity.getId());
			cla.setName(ClassEntity.getName());			
			model.add(cla);
		}
		System.out.println(model);
		return model;
	}
}
