package com.demoHazelcast.demohazelcast.model;

import java.io.Serializable;

public class SinhVien implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Long Class_id;

	public SinhVien() {
	}

	public SinhVien(Long id, String name, Long class_id) {
		super();
		this.id = id;
		this.name = name;
		Class_id = class_id;
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

	public Long getClass_id() {
		return Class_id;
	}

	public void setClass_id(Long class_id) {
		Class_id = class_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
