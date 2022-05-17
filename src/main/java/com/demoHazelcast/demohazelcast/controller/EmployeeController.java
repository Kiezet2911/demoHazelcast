package com.demoHazelcast.demohazelcast.controller;

import org.springframework.web.bind.annotation.*;

import com.demoHazelcast.demohazelcast.entity.EmployeeEntity;
import com.demoHazelcast.demohazelcast.service.EmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
@Tag(name = "Nhân Viên")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping
	public List<EmployeeEntity> findAllEmployee() {
		return employeeService.findAllEmployee();
	}

	@GetMapping("/{id}")
	public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id) {
		return employeeService.findById(id);
	}

	@PostMapping
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.saveEmployee(employeeEntity);
	}

	@PutMapping
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.updateEmployee(employeeEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployee(id);
	}

}
