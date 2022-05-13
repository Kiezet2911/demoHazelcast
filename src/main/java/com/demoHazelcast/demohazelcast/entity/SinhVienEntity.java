package com.demoHazelcast.demohazelcast.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
public class SinhVienEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@ManyToOne()
	@JoinColumn(name = "class_id")
	private ClassEntity Class_id;

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

	public ClassEntity getClass_id() {
		return Class_id;
	}

	public void setClass_id(ClassEntity class_id) {
		Class_id = class_id;
	}

}
