package com.coder.autowire.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
	 ApplicationContext context =	new ClassPathXmlApplicationContext("com/coder/autowire/annot/config.xml");
    Student st  = context.getBean("st", Student.class);
	System.out.println(st);
	}
}
