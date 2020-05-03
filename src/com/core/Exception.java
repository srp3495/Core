package com.core;

import java.io.IOException;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;
import java.lang.Throwable;


public class Exception {

		double d2;
		String s2;
		double d3;
		String s3;

		
		public void example() {

			String s2="hello";
			String s3="hello2";
	
			
			//try{
		    //d3=Double.parseDouble(s3);
			//System.out.println("Parsed Double:"+d3);//Format error will come
			//	}
		    //		catch(NumberFormatException|RemoteException ex){}//throw ex ;} throw ex will terminate the flow

			try{
			d2=Double.parseDouble(s2);
			System.out.println("Parsed Double:"+d2);//Format error will come
			}
			catch(NumberFormatException e1){System.out.println("Number format exception occured  " +e1);
			e1.printStackTrace();
			}
       
		}
			
	}

