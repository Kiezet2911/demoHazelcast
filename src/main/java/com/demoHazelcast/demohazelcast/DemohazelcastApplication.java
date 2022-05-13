package com.demoHazelcast.demohazelcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication 
@OpenAPIDefinition(info = @Info(title = "Employees API", version = "2.0", description = "Employees Information"))
@EnableCaching
public class DemohazelcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohazelcastApplication.class, args);
	}

}
