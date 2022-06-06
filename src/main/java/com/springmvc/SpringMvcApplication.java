package com.springmvc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.springmvc.controller"+"com.springmvc.service"+"com.springmvc.service.impl"+"com.springmvc.entity"+"com.springmvc.repo")
public class SpringMvcApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
		
	  
	}
	


}
