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
        
        for(File f:listOfFiles)
        {
        	fileNames.add(f.getName());
        }
        
        // retrun the file list.
        
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
			File fl = new File(folderpath,filename);
			FileWriter fw = new FileWriter(fl);
			for(String s:content)
			{
				fw.write(s+"\n");
			}
		 	fw.close();
			return true;
			
		}
		catch( Exception Ex)
		{
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
		//Adding folder path with file name 
		File file = new File(folderpath+"\\"+filename);
		try
		{
			if(file.delete())
			 return true;
			else 
			 return false;	
		}
		catch(Exception ex)
		{
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
		
		File file = new File(folderpath+"\\"+filename);

			if(file.exists() )
			 return true;
			else 
			 return false;	
	}
}
