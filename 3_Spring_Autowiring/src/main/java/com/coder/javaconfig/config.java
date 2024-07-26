package com.coder.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages = "com.coder/javaconfig")
public class config {
	
	@Bean
	@Primary
	public Address addr()
	{
		return new Address("First Bean");
	}
	

//	@Bean
//	public Address getaddress()
//	{
//		return new Address("Second Bean");
//	}
	
	@Bean(name = "emps")
	public Emp getEmp()
	{
		
		return new Emp(addr());
		
	}

}
