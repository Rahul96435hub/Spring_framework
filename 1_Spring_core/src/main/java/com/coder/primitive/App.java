 package com.coder.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/coder/primitive/config.xml");
		
		Student st = context.getBean("st1" ,Student.class);
		Student st2 = context.getBean("st2" ,Student.class);
		
		System.out.println(st);
		
		System.out.println(st2);
		
	}

}
