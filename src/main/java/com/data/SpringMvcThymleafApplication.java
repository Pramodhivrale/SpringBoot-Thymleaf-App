package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.data","com.controllers"})
public class SpringMvcThymleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcThymleafApplication.class, args);
	}

}
