package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMe {

	static final String folderpath="D:\\MysimplilearnPhase1Project\\LockedMeFiles";
	
	public static void main(String[] args) 
	{
		
		// Veriable declaration 
		Scanner obj = new Scanner(System.in);
		int ch;
		
		// Manu 
		displayMenu();
		System.out.println("Enter your choice : ");
		ch=Integer.parseInt(obj.nextLine());
		
		switch(ch)
		{
		case 1 : getallFiles();
			     break;
		case 2 : createFile();
			     break;
		case 3 : deleteFile();
			     break;
		case 4 : searchFile();
			     break;
		case 5 : System.exit(0);
			     break;
		 default: System.out.println("Invalid Option");
	             break;
		}
		
	}

	/**
	 * 
	 */
	
	public static void displayMenu()
	{
		
		System.out.println("***********************************************************");
		System.out.println("\t\tCompany Lockers Pvt. Ltd ");
		System.out.println("***********************************************************");
		System.out.println("1. Display all files");
		System.out.println("2. Add new file");
		System.out.println("3. Delete a file");
		System.out.println("4. Search a file");
		System.out.println("5. Exit");
		System.out.println("***********************************************************");


	}
	
	/**
	 * 
	 */
	
	public static void getallFiles()
	{
		
		// Get list of files 
		
	 	   List<String> filenames = FileManager.getAllFiles(folderpath);
			
			for(String f:filenames)
			{
				System.out.println(f);
			}
	      
	}
	
	/**
	 * 
	 */
	
	public static void createFile()
	{
		
		  // Call create file 
		
			//Variable Declaration
			
			Scanner obj = new Scanner(System.in);
			String fileName ;
			int linesCount;
			List<String> content = new ArrayList<String>();
			
			// Read Filename from user.
			System.out.println("Enter the File Name : ");
			fileName = obj.nextLine();
			
			// Read number of lines from the user 
			System.out.println("Enter how many lines in the files : ");
			linesCount=Integer.parseInt(obj.nextLine());
			
			//Read lines from user 
			for(int i =1; i <= linesCount ; i++)
			{
				System.out.println("Enter Lines "+i+":");
				content.add(obj.nextLine());
			}
			
			// Save the content into the files 
			 
			boolean isSaved = FileManager.createFiles(folderpath, fileName, content);
			
					if(isSaved) 
					{
						System.out.println("File and data saved Successfully.");
					}
					 else {
							
						 System.out.println("Some error occurred. Please contact admin@abc.com");
					}
			
				// Close Scanner Objects 
					obj.close();
					
	}
	
	/**
	 * 
	 */
	
	
	public static void deleteFile()
	{

		// Code for delete a file 
		//Variable declaration 
		String filename;
		Scanner obj = new Scanner(System.in);
		
		// Get the file name from the user 
		System.out.println("Enter File name to be delete : ");
		filename = obj.nextLine();
		
		// Call delete method to delete the file.
		boolean isDeleted = FileManager.deleteFile(folderpath, filename);
		
		if(isDeleted)
		{
			System.out.println("File Deleted Successfully.");
		}
		else
		{
			System.out.println("Either File not there or some access issue.");
		}
		
	}
	
	/**
	 * 
	 */
	
	public static void searchFile()
	{

		// Code for Search a file 
		//Variable declaration 
		String filename;
		Scanner obj = new Scanner(System.in);
		
		// Get the file name from the user 
		System.out.println("Enter File name to be delete : ");
		filename = obj.nextLine();
		
		// Call delete method to delete the file.
		boolean isFound = FileManager.searchFile(folderpath, filename);
		
		if(isFound)
		{
			System.out.println("File is Present in the folder.");
		}
		else
		{
			System.out.println("File is not present int the folder.");
		}
				
	}
}
