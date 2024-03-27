package com.prowings.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
//@ComponentScan
public class BeansConfiguration {

	@Bean(name = "emp1")
	public Employee getEmployee2() {
		
		Employee emp1 = new Employee(20,"Sham","Mumbai");
		
		return emp1;
	}
	
	@Bean(name = "emp2")
	public Employee getEmployee1() {
		
		Employee emp2 = new Employee(50,"Ram","Pune");
		
		return emp2;
	}
	
	
	@Bean(name = {"addr1"})
	public Address getAddress1() {
		
		return new Address(123,"Pune");
	}
	@Bean(name = {"address"})
//	@Primary
	public Address getAddress2() {
		
		return new Address(456,"Mumbai");
	}
}
