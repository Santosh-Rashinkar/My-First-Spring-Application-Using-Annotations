package com.prowings.beans;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationConfig {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext("com.prowings.beans");
		
		Employee emp1 =ctx.getBean("emp1",Employee.class);
		System.out.println(emp1);
		
		Employee emp2 =ctx.getBean("emp2",Employee.class);
		System.out.println(emp2);
		
		System.out.println("Total beans in container :" +ctx.getBeanDefinitionCount());
		System.out.println("Total beans in container with names :" +Arrays.toString(ctx.getBeanDefinitionNames()));
		
		
		A a =ctx.getBean("a", A.class);
		System.out.println(a);
		
	    A2 b =ctx.getBean("a2", A2.class);
		System.out.println(b);
		
		Student s =ctx.getBean("student",Student.class);
		System.out.println(s);	
	}
	
}
