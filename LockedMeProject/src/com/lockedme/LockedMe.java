package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMe {

	static final String folderpath="D:\\MysimplilearnPhase1Project\\LockedMeFiles";
	
	public static void main(String[] args) 
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
