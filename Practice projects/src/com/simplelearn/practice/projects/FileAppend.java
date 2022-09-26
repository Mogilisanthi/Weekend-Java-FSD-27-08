package com.simplelearn.practice.projects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileAppend {
	public static void main(String[] args) throws IOException {
		String s= "a new info is added to the existing file 2";
		FileOutputStream fos= new FileOutputStream("file 2.txt",true);
		byte b[]= s.getBytes();
		fos.write(b);
		System.out.println("Data has been kept into the file 2");
		fos.close();
	}

}
