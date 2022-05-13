package com.demoHazelcast.demohazelcast.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class ClassEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "Class_id")
	private List<SinhVienEntity> sinhviens = new ArrayList<>();

	public ClassEntity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ClassEntity() {

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

	public List<SinhVienEntity> getSinhviens() {
		return sinhviens;
	}

	public void setSinhviens(List<SinhVienEntity> sinhviens) {
		this.sinhviens = sinhviens;
	}

}
