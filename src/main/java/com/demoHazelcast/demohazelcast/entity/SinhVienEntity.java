package com.demoHazelcast.demohazelcast.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "sinhvien")
public class SinhVienEntity{

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	public SinhVienEntity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public SinhVienEntity() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
