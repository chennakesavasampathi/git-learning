package com.in.springcore;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.in.springcore")
public class ConfigClass {
	
	@Bean("student")
 public Student m1() {
	 
	 return new Student("chennakesava");
	 
	 
	 
 }
	
	
}
