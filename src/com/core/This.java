package com.core;

public class This {
	
	public int a=9;
	public String b="Hi,Testing this operator";
	float f=5.25f;
	
	
	This(){
		this(2);// invoking a overloaded custom constructor
		System.out.println("This is default constructor");
		

	}

	 This(int a){
		this.a=a; //using this to assign value to attribute correctly
		System.out.println("Called custom constructor through 'this' operator,. value of A :"+a);
	}
	 
	 
public void add(int i,float j){
	Dummy dummy=new Dummy(this);//invoking constructor of Dummy having parameter object of 'This'
	System.out.println(i+f);	
	this.sub(9, 4);  //using "this" to call a method of current class
}

public void sub(int k,int l){
	System.out.println(k-l);
}

public void multiply(){
	System.out.println("inside mutiplication");
}

public void get(This obj){
	obj.multiply();
	
}
public void goMultiply(){
	get(this); //passing current class object
}

public This getobj(){
	return this; //this will return the current class object
}



}
