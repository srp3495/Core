package com.core;
import java.lang.*;
public class TypeCastandWrapper {

	double d=435435.64654654;
	float f=8765.8f;
	int i;
	int j;
	int k;
	double d2;
	String s;
	String n;
	
	public void example(){
		int i=(int)d;
		System.out.println("Typecasted integer :"+i);
		String s="234";
		String s2="hello";
		String n="6";
		
	//	int j=(int)s; this cannot be done
		int k=Integer.parseInt(s); //when type cast not works haha
		System.out.println("Parsed integer :"+k);
		//d2=Double.parseDouble(s2);
		//System.out.println("Parsed Double:"+d2);//Format error will come
		
		
}}
