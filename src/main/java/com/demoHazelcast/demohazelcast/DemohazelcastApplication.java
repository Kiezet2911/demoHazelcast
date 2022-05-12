package com.demoHazelcast.demohazelcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(exclude = HazelcastAutoConfiguration.class)
public class DemohazelcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohazelcastApplication.class, args);
	}

}
