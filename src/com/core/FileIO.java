package com.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	public void copyfile() throws IOException,FileNotFoundException{
		
	FileInputStream in=null;
	FileOutputStream out=null;
	try {
	 in=new FileInputStream("inputfile.rtf");
	 out=new FileOutputStream("outputfile.rtf");
	
	int c;
	while((c=in.read())!=-1) {
		out.write(c);
         }
		
	}
	finally {
		if(in!=null) {in.close();}
		if(out!=null) {out.close();}
		
		
	}}
}
