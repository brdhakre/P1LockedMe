package com.lockedme;

import java.util.List;

public class LockedMe {

	static final String folderpath="D:\\MysimplilearnPhase1Project\\LockedMeFiles";
	
	public static void main(String[] args) {

	
		
		// Get list of files 
		
	 	List<String> filenames = FileManager.getAllFiles(folderpath);
		
		for(String f:filenames)
		{
			System.out.println(f);
		}
    
	}

}
