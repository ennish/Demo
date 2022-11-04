package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {
	private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		logger.info("Springboot starting");
		SpringApplication.run(DemoApplication.class, args);

	}

}
