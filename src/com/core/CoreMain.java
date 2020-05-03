package com.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class CoreMain {

	private static float myFloatNum = 5.99f; 
	private static double myDoubleNum=98784.12;
	private static String str1="Hi";
    public static int pup=5;	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		// TODO Auto-generated method stub
		float myFloatNum = 5.99f;
		BigDecimal bd1=new BigDecimal(452.8741423);
		String str2=new String ("Hi");//this will create a new object even if we have a same string
		float a=5.2582f;
		int b=4;
		int c=6;
		System.out.println(myFloatNum);
    	myDoubleNum=Math.round(myDoubleNum);
    	System.out.println(myDoubleNum);
    	bd1=bd1.add(bd1);
    	System.out.println(bd1);
    	
    	if (str1==str2)
    		System.out.println("equal");
    		else
    			System.out.println("Not equal");
    	
    	if (str1.equals(str2))
    		System.out.println("equal");
    		else
    			System.out.println("Not equal");
    	
 	   
 	   System.out.println("Floor :"+Math.floor(a));
 	   System.out.println("Ceil :"+Math.ceil(a));
 	   System.out.println("Power :"+Math.pow(a, b));
 	   System.out.println("Character at 1st :"+str1.charAt(1));
 	   System.out.println("Upper case :"+str1.toUpperCase());
 	   
 	   This thisthis=new This();
 	   thisthis.add(5, 6.5f);
 	   thisthis.goMultiply();
     	
    	
	while(pup>0){
		System.out.println("inside while");
		pup=pup-1;
		if(pup==2){continue;}//continue wont consider the next lines inside loop
		System.out.println("for "+(pup+1)+"th time");
		if(pup==1){break;}//exits from the loop
	}
	
	Encapsulation encap=new Encapsulation();
	encap.setEmpid(2);
	System.out.println("The secured value is :"+encap.getEmpid());
	Inheritance inherit=new Inheritance();
	inherit.inherited();
	inherit.getData();
	Polymorphism poly1=new Polymorphism();//normal
	Polymorphism poly2=new PolySubclass();//polymorphism applied
	poly1.print();
	poly2.print();
	
	PolySubclass poly3=new PolySubclass();//understand this order
	poly3.print2();
	
	AbstractSub abssub=new AbstractSub();
	abssub.concrete();
	abssub.abstractMethod();
	abssub.dividebyzero();
	
	TypeCastandWrapper wrap=new TypeCastandWrapper();
	wrap.example();
	System.out.println("Hashcode :"+wrap.hashCode());
	System.out.println("String value :"+wrap.toString());
	if(wrap.equals(poly1)){ System.out.println("SAME");}else{System.out.println("DIFFERENT");}
	
	Static.useStatic();  //static method can be called without object
	
	Exception exp=new Exception();
	exp.example();
	
	ArrayListMapForEach arraylist=new ArrayListMapForEach();
	int count;
	System.out.println("How many Strings to be added ?");
	Scanner s2=new Scanner(System.in);
	count=s2.nextInt();
	for (int i=0;i<count;i++) {
		arraylist.addElements();
	}
	
	arraylist.showElements();
	
	
	for (int j=0;j<count;j++) {
		arraylist.addElementstoMap();
	}
	
	arraylist.showElementsMap();
	arraylist.addandShowElementstoSet();
	
	OuterClass outer=new OuterClass();
	OuterClass.InnerClass inner=outer.new InnerClass();
	outer.outermethod();
	inner.innerMethod();
	
	FileIO file=new FileIO();
	file.copyfile();
	
	Inner outer2=new Inner();
	outer2.substract();
	Inner.InnerClass inner2=outer2.new InnerClass();
	inner2.add();
	
	}
	}

