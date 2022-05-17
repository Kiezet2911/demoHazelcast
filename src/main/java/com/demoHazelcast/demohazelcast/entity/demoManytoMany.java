package com.demoHazelcast.demohazelcast.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "demoManytoMany")
public class demoManytoMany {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "demoid")
	private Long demoid;

	@Column(name = "name")
	private String name;

	@ManyToMany
	@JoinTable(name = "ManytoMany", joinColumns = @JoinColumn(name = "demoid"), inverseJoinColumns = @JoinColumn(name = "did"))
	private List<demo> demo;

	public demoManytoMany(Long demoid, String name, List<com.demoHazelcast.demohazelcast.entity.demo> demo) {
		super();
		this.demoid = demoid;
		this.name = name;
		this.demo = demo;
	}

	public demoManytoMany() {
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

	public List<demo> getDemo() {
		return demo;
	}

	public void setDemo(List<demo> demo) {
		this.demo = demo;
	}

}
