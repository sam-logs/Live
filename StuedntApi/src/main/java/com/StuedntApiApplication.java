package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.model")
@ComponentScan({"com.controller", "com.dao"})

public class StuedntApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuedntApiApplication.class, args);
	}

}
