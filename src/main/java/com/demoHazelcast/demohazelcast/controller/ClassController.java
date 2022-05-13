package com.demoHazelcast.demohazelcast.controller;

import org.springframework.web.bind.annotation.*;
import com.demoHazelcast.demohazelcast.model.Class;
import com.demoHazelcast.demohazelcast.service.ClassService;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

	private final ClassService service;

	public ClassController(ClassService service) {
		this.service = service;
	}

	@GetMapping("/clear")
	public void clear() {
		service.clearCache();
	}

	@GetMapping
	public List<Class> findAllEmployee() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Class findSinhVienById(@PathVariable("id") Long id) {
		return service.findByID(id);
	}

	@PostMapping
	public Class saveEmployee(@RequestBody Class Class) {
		return service.insert(Class);
	}

	@PutMapping
	public Class updateEmployee(@RequestBody Class Class) {
		return service.update(Class);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		service.delete(id);
	}

}
