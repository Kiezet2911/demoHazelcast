package com.demoHazelcast.demohazelcast.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.demoHazelcast.demohazelcast.model.SinhVien;
import com.demoHazelcast.demohazelcast.service.SinhVienService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@RestController
@RequestMapping("/sv")
@Tag(name = "Sinh Viên")
public class SinhVienController {

	private final SinhVienService service;

	public SinhVienController(SinhVienService service) {
		this.service = service;
	}

	@GetMapping("/clear")
	public void clear() {
		service.clearCache();
	}

	@GetMapping
	public List<SinhVien> findAllEmployee() {
		return service.findAllSinhVien();
	}

	@GetMapping("/prod")
	@Transactional(readOnly = true)
	public List<SinhVien> ProdGetAll() {	
		return service.ProdGetAll();
	}

	@GetMapping("/{id}")
	public SinhVien findSinhVienById(@PathVariable("id") Long id) {
		return service.findById(id);
	}

	@PostMapping
	public SinhVien saveEmployee(@RequestBody SinhVien SinhVien) {
		return service.saveSinhVien(SinhVien);
	}

	@PutMapping
	public SinhVien updateEmployee(@RequestBody SinhVien SinhVien) {
		return service.updateSinhVien(SinhVien);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		service.deleteEmployee(id);
	}

}
