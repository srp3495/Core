package com.core;

public class AbstractSub extends Abstraction {
	public float a=15.0f;  //divide by zero will give infinity in the case of float
	//exception will be thrown in the case of int
	public void abstractMethod(){
		System.out.println("Hi,This is from implemented abstract method");
	};
	
	public void dividebyzero(){
		System.out.println("Value is :"+(a/0));
	

}}
