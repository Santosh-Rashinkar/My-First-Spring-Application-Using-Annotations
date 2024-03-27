package com.prowings.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//@Component
//@Controller
//@Service               
@Repository
//@Configuration
public class A {
	
@Value(value = "2000")
	private int a;


public A() {
	super();
}

public A(int a) {
	super();
	this.a = a;
}
public int getA() {
	return a;
}


public void setA(int a) {
	this.a = a;
}

@Override
public String toString() {
	return "A [a=" + a + "]";
}





}
