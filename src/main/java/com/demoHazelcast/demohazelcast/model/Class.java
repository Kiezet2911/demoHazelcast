package com.demoHazelcast.demohazelcast.model;

import java.io.Serializable;
import java.util.List;

import com.demoHazelcast.demohazelcast.entity.SinhVienEntity;

public class Class implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	private Long id;
	private String name;

	public Class() {
	}

	public Class(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
