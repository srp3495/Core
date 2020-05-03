package com.core;

public class Dummy {
	
	int count;
	int age;
	
	int id;
	int laps;
	public Dummy(int c,int d){
		this.id=c;
		this.laps=d;
		System.out.println("values revieved are ID:"+id+"Laps:"+laps);
	}
	Dummy(){
		
	}
	Dummy(This d){
    	System.out.println("invoked the constructor of this class having on object of class 'This' as parameter");
    }
    
	
   public int average(int a, int b){
	   this.count=a;
	   this.age=b;
	   return b/a;
   }
 
public void getData(){
	System.out.println("Hi,This is from super class");
}
}
