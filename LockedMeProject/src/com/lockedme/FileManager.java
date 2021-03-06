package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	/**
	 * This method will return all the file names from the folder.
	 * @param folderpath
	 * @return List<String>
	 */
	public static List<String> getAllFiles(String folderpath)
	{
		
		//Creating file object. 
		
        File fl = new File(folderpath);
        
        //Getting all the files into file array.
   
        File[] listOfFiles = fl.listFiles();
        
        //Declare a list to store file name 
        
        List<String> fileNames = new ArrayList<String>();
        
        // Adding file names in the list.
        for(File f:listOfFiles)
        {
        	fileNames.add(f.getName());
        }
        
        // Return the file names list.
        
		return fileNames;
		
	}
	
	/**
	 * This method will create or append content into the file specified
	 * @param folderpath
	 * @param filename
	 * @param content
	 * @return boolean
	 */
	
	public static boolean createFiles(String folderpath,String filename,List<String> content)
	{
		
		try
		{
			// Creating file object 
			
			File fl = new File(folderpath,filename);
			
			// Creating file write object.
			FileWriter fw = new FileWriter(fl);
			
			// Write content to the file.
			for(String s:content)
			{
				fw.write(s+"\n");
			}
			
			// Close file write.
		 	fw.close();
		 	
		 	// retrun true 
			return true;
			
		}
		catch( Exception Ex)
		{
			// if any exception to write the file , return false.
			return false;
		}

		
	}
	
	/**
	 * This method will delete the filename if it exists.
	 * @param folderpath
	 * @param filename
	 * @return boolean
	 */
	public static boolean deleteFile(String folderpath,String filename)
	{
		// Create the file object.
		// Adding folder path with file name 
		File file = new File(folderpath+"\\"+filename);
		
		try
		{
			
			// Delete the file 
			if(file.delete())
				
			// return true if delete file is successful. 
			 return true;
			else 
			
		    // return false if delete file failed. 
			 return false;	
		}
		catch(Exception ex)
		{
			
			// return false if any error during delete file.
			
			return false;
		}
		 
	}

	/**
	 * This method will search the filename from the folder.
	 * @param folderpath
	 * @param filename
	 * @return boolean
	 */
	public static boolean searchFile(String folderpath,String filename)
	{

		// Create the file object.
		// Adding folder path with file name 
		File file = new File(folderpath+"\\"+filename);

			if(file.exists())

        // return true if file present 
			 return true;
			else 
			
			// return false if file not present 
			 return false;	
	}
}
