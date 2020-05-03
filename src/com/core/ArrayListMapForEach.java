package com.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import com.core.Dummy;
import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.omg.CORBA.IdentifierHelper;

public class ArrayListMapForEach {
	
	HashMap<String,Integer> hashmap=new HashMap<>(); 
	ArrayList<String> identifier=new ArrayList<String>();
	HashSet<String> hashset=new HashSet<>();
	//ArrayList<Dummy>=new ArrayList<Dummy>
	
	public void showElements() {
		for(String str:identifier)
		System.out.println(str);
		System.out.println("Size="+identifier.size());
	}
	public void addElements() {
		System.out.println("Enter the string to be added");
		Scanner s1=new Scanner(System.in) ;
			identifier.add(s1.next());
		
	}
	public void addElementstoMap() {
		System.out.println("Enter the key value pair");
		Scanner s3=new Scanner(System.in) ;
	    hashmap.put(s3.next(),s3.nextInt());
	}
	public void showElementsMap() {
		for(String str:hashmap.keySet())
		System.out.println(hashmap.get(str));
		System.out.println("Size="+hashmap.size());
	}
	
	public void addandShowElementstoSet() {
		
	    hashset.add("Hai");
	    hashset.add("i am");
	    hashset.add("sreeroop");
	    System.out.println("Set ="+hashset);
	    hashset.remove("i am");
	    Iterator<String> i= hashset.iterator();
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }
	    
	    
	}
	

}
