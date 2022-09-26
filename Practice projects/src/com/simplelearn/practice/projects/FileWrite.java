package com.simplelearn.practice.projects;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		String s = "This is file 1 creation";
		FileOutputStream fos= new FileOutputStream("file 1.txt");
		byte b[]= s.getBytes();
		fos.write(b);
		System.out.println("Data has been kept into the file 1");
		fos.close();
	}

}
