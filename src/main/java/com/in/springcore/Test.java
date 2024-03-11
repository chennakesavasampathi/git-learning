package com.in.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
	
	 Student st=context.getBean("student",Student.class);
	 st.test();
}
}
