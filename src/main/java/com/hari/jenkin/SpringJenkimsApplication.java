package com.hari.jenkin;

import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkimsApplication {

	static private Logger logger=LoggerFactory.getLogger(SpringJenkimsApplication.class);
	@PostConstruct
	public void init() {
		logger.info("Application started");
	}
	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(SpringJenkimsApplication.class, args);
	}

}
