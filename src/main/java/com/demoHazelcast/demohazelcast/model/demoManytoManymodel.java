package com.demoHazelcast.demohazelcast.model;


public class demoManytoManymodel {

	private Long demoid;
	private String name;

	public demoManytoManymodel(Long demoid, String name) {
		super();
		this.demoid = demoid;
		this.name = name;
	}

	public demoManytoManymodel() {
	}

	public Long getDemoid() {
		return demoid;
	}

	public void setDemoid(Long demoid) {
		this.demoid = demoid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
