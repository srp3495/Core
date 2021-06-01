package com.core;

public class StringTest {

	//String is immutable
	public static void main(String[] args) {
		StringTest strtest=new StringTest();
		String s="hi";
		s.concat(" and hello1");
		System.out.println(s);
		s=s.concat(" and hello2");
		System.out.println(s);
		String s1=s.concat(" and hello3");
		System.out.println(s1);
		strtest.isIntegerImmutable();
	}
	
	public void isIntegerImmutable() {
		Integer x=new Integer(10);
		add(x);
		System.out.println("value of x is :"+ x);
		x=x+10;
		System.out.println("value of x is :"+ x);
		int y=x+10;
		System.out.println("value of y is :"+ y);
		
	}
	public void add(Integer x) {
		x=x+1;
	}
}
