package com.demoHazelcast.demohazelcast.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "demo")
public class demo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "did")
	private Long did;

	@Column(name = "name")
	private String name;

	@ManyToMany(mappedBy = "demo")
	private List<demoManytoMany> demoManytoManies;

	public demo() {
	}

	public demo(Long id, String name, List<demoManytoMany> demoManytoManies) {
		super();
		this.did = id;
		this.name = name;
		this.demoManytoManies = demoManytoManies;
	}

	public Long getId() {
		return did;
	}

	public void setId(Long id) {
		this.did = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<demoManytoMany> getDemoManytoManies() {
		return demoManytoManies;
	}

	public void setDemoManytoManies(List<demoManytoMany> demoManytoManies) {
		this.demoManytoManies = demoManytoManies;
	}

}
