package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EmployeeSkillMatrixDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSkillMatrixDetailsApplication.class, args);
	}
//	@Bean
//	BCryptPasswordEncoder encoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
	
}
