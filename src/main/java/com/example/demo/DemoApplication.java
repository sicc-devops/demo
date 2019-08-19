package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private Environment env;
	
	@RequestMapping("/")
	public String init() {
		String cEnv[] = env.getActiveProfiles();
		return "Springboot App Running~~!!" + cEnv[0];
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
