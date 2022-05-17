package com.demoHazelcast.demohazelcast.model;

public class demomodel {

	private Long did;

	private String name;

	private Long demoManytoManies;

	public demomodel() {
	}

	public demomodel(Long id, String name, Long demoManytoManies) {
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

	public Long getDemoManytoManies() {
		return demoManytoManies;
	}

	public void setDemoManytoManies(Long demoManytoManies) {
		this.demoManytoManies = demoManytoManies;
	}

}
