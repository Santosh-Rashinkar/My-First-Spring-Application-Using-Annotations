package com.prowings.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
//@Controller
//@Service               
//@Repository
//@Configuration
public class A2 {
	
@Value(value = "3000")
	private int a;


public A2() {
	super();
}

public A2(int a) {
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
