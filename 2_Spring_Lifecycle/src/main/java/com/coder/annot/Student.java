package com.coder.annot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		
		
	}
	
	@PostConstruct 
	public void init() {
		
		System.out.println("Initialization object");
	}
		
	@PreDestroy
		public void destroy() throws Exception {
			
			System.out.println("Destroy object");
	}
		
	}

