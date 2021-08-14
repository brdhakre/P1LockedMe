package com.lockedme;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	/**
	 * This method will return all the file names from the folder.
	 * @param folderpath
	 * @return String array
	 */
	public static List<String> getAllFiles(String folderpath)
	{
		
		//Creating file object. 
		
        File fl = new File(folderpath);
        
        //Getting all the files into file array.
   
        File[] listOfFiles = fl.listFiles();
        
        //Declare a list to store file name 
        List<String> fileNames = new ArrayList<String>();
        
        for(File f:listOfFiles)
        {
        	fileNames.add(f.getName());
        }
        
        // retrun the file list.
        
		return fileNames;
		
	}
}
