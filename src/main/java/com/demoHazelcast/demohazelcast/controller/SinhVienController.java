package com.demoHazelcast.demohazelcast.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.demoHazelcast.demohazelcast.config.HazelcastConfig;
import com.demoHazelcast.demohazelcast.entity.SinhVienEntity;
import com.demoHazelcast.demohazelcast.service.SinhVienService;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sv")
public class SinhVienController {

	private final SinhVienService service;

	public SinhVienController(SinhVienService service) {
		this.service = service;
	}

	@GetMapping
	public List<SinhVienEntity> findAllEmployee() {
		return service.findAllSinhVien();
	}

	@GetMapping("/prod")
	@Transactional(readOnly = true)
	public List<SinhVienEntity> ProdGetAll() {
		return service.ProdGetAll();
	}

	@GetMapping("/{id}")
	public Optional<SinhVienEntity> findSinhVienById(@PathVariable("id") Long id) {
		return service.findById(id);
	}

	@PostMapping
	public SinhVienEntity saveEmployee(@RequestBody SinhVienEntity sinhVienEntity) {
		return service.saveSinhVien(sinhVienEntity);
	}

	@PutMapping
	public SinhVienEntity updateEmployee(@RequestBody SinhVienEntity sinhVienEntity) {
		return service.updateSinhVien(sinhVienEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		service.deleteEmployee(id);
	}

}
