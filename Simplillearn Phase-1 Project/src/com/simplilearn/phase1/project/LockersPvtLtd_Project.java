package com.simplilearn.phase1.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LockersPvtLtd_Project {

	Scanner scanner = new Scanner(System.in);	
	String fileName;
	String path = "D:\\LockersPvtLtd\\File\\";

//creating a single parameterized constructor to check the folder path is exists or not.
	LockersPvtLtd_Project(boolean b) throws IOException
	{
		//Checking Folder Exist or not. If not exists folder will be created.
		File file = new File(path);
		if(file.mkdirs())
		{
			System.out.println("New Folder is created in the path\n"  +path);
		}
		else {
			System.out.println("Folder already exists\n");
		}
	}
	//These are the features methods(Retrieve files,Business level operations,Close the app).
	//To Retrieve all files in ascending order
	public void displayFile() throws IOException
	{
		File file = new File(path);
		File filenames[]=file.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		selectBusinessOperation();

	}
	//These are the Business level operation methods(add,delete and search files)
	
	//To add a user specified file to the application
	public void addFile() throws IOException
	{
		System.out.println("Please enter the File name to Create\n");
		
		fileName = scanner.next();
		File fi = new File(path+fileName);
		boolean b=fi.createNewFile();
		if(b!=true)
		{
			System.out.println("Filename already found \n");
		}
		else
		{
			System.out.println("Filename Added Successfully\n");
		}

		//To insert or append the content into the file created.
		System.out.println("Would you like to add some content in the newly created file or\n append some content in already existing file ?\nPress(Y/N)\n");
		String choice=scanner.next().toLowerCase();
		if(choice.equals("y")) {
			FileWriter fos = new FileWriter(fi,true);
			String s= scanner.next()+scanner.nextLine();
			fos.write(s);
			System.out.println("Content written to file\n" +fileName);
			fos.close();
		}
		selectBusinessOperation();
	}
	//To delete a user specified file from the application
	public void deleteFile() throws IOException
	{
		System.out.println("Please enter the File name to Delete\n");
		fileName = scanner.next();
		File fi = new File(path+fileName);
		boolean b=fi.delete();
		if(b==true)
		{
			System.out.println("File deleted succesfully ");
		}
		else
		{
			System.out.println("File not exists to delete");
		}
		selectBusinessOperation();
	}

	//To search a user specified file from the application
	public void searchFile() throws IOException
	{
		System.out.println("Please enter the File name to Search\n");		
		fileName = scanner.next();
		File file = new File(path);	
		File filenames[]=file.listFiles();
		int flag=0;
		for(File ff : filenames)
		{          
			if(ff.getName().equals(fileName))
			{
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println(fileName  +" File Found!! in this path \n "  +path);
		}
		else 
		{
			System.out.println("File Not Found");
		}	
		selectBusinessOperation();
	}

	//To Close the Application
	public void closeApplication() throws IOException
	{
		System.out.println("Closed the Application");
		System.exit(0);
	}

	//This is the Business Level Operations Method
	public void selectBusinessOperation() throws IOException
	{
		System.out.println("Enter 2.1 option to add a user specified file to the application");
		System.out.println("Enter 2.2 option to delete a user specified file from the application");
		System.out.println("Enter 2.3 option to search a user specified file from the application");
		System.out.println("Enter 2.4 option to close the current execution context and return to the main context");
		String option = scanner.next();
		switch (option) {
		case "2.1":
			addFile();
			break;
		case "2.2":
			deleteFile();
			break;
		case "2.3":
			searchFile();
			break;
		case "2.4":
			System.out.println("Returning to main context");
			features();
			break;

		default:
			System.out.println("Select the Correct Option");			
			break;
		}	

		selectBusinessOperation();
	}

	//This is Generic features and 3 operations ----> main method
	public void features() throws IOException
	{
		System.out.println("Enter 1 to Retrieving the file names in an ascending order");
		System.out.println("Enter 2 to select Business-level operations");
		System.out.println("Enter 3 to Close the application");
		String operation = scanner.next();
		switch (operation) {
		case "1":
			displayFile();
			break;
		case "2":
			selectBusinessOperation();
			break;
		case "3":
			closeApplication();
			break;
		default:
			System.out.println("Select the Correct Operation");
			break;
		}	

		features();
	}


	public static void main(String[] args) throws IOException {

		System.out.println("**************************************************************************************\n");
		System.out.println("Welcome too Lockers Pvt Ltd \n"+"This application is developed by Santhi Mogili\n");
		System.out.println("**************************************************************************************\n");
		System.out.println();
		
		//calling the class to get features of app
		LockersPvtLtd_Project lockersPvtLtd = new LockersPvtLtd_Project(true);
		lockersPvtLtd.features();
	}
}
