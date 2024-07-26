  package com.coder.autowire.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	@Autowired
//	@Qualifier("ad ")
	 private Address address;
	 
	

//	public Student(Address address) {
//		super();
//		this.address = address;
//		System.out.println("constructor Injection");
//	}

	public Address getAddress() {
		return address;
	}
	
	
	
	public void setAddress(Address address) {
		System.out.println("setter Injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	 
	 

}
