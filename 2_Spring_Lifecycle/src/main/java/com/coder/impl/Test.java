package com.coder.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
public static void main(String[] args) {
	
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/coder/impl/config.xml");
	context.registerShutdownHook();
	
	Student student = context.getBean("st", Student.class);
	
	System.out.println(student);
									
								}

}
