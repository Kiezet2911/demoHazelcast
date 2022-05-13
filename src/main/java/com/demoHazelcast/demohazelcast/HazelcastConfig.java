package com.demoHazelcast.demohazelcast;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionConfig;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizePolicy;

@Configuration
public class HazelcastConfig {
	@Bean
	public static Config cacheConfig() {
		return new Config().setInstanceName("hazelcast-instance")
				.addMapConfig(new MapConfig().setName("sinhVienEntity")
						.setEvictionConfig(new EvictionConfig().setSize(200)
								.setMaxSizePolicy(MaxSizePolicy.FREE_HEAP_SIZE).setEvictionPolicy(EvictionPolicy.LRU))
						.setTimeToLiveSeconds(3600));
	}

}