package com.core;

public class OuterClass {
	private int age=10;
	public void outermethod() {
		System.out.println(" i am from outer class");
	}
	public class InnerClass {

			public void innerMethod() {
				System.out.println("age:"+age);
			}
		}
		
		

	}
