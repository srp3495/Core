package com.core;

public class Interface implements Interface3 {
//we should define all the methods of interfaces here
	public void GetTyres(){
		System.out.println("Got the tyres");
	};
	public void GetBody(){
		System.out.println("Got the Body");
	};
	@Override  // i dont know it is necessary or not
	public void getWindow(){
		System.out.println("Got the windows");
	};
	public void getChasis(){
		System.out.println("Got the chasis");
	};
}
