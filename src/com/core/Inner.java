package com.core;

public class Inner {

	private int innervariable=4;
	public void substract() {
		System.out.println("substracted value :"+(10-innervariable));
	}
	
	public class InnerClass{
		
		public void add() {
			System.out.println("Added value is "+(innervariable+10));//using private member
			//providing more security
			
		}
	}
}
