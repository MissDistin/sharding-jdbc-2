package com.example.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.sharding.service.DemoService;

@SpringBootApplication
public class DataBaseDivice {
	public static void main(final String[] args) {
		try (ConfigurableApplicationContext applicationContext = SpringApplication.run(DataBaseDivice.class, args)) {
			applicationContext.getBean(DemoService.class).demo();
		}
	}
}