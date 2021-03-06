package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager
{
	/**
	 * This method will return the file names from the folder 
	 * @param folderpath
	 * @return List<String>
	 */
	public static List<String> getAllFiles(String folderpath)
	{
		//Creatinf File Object
		File fl = new File(folderpath);
		
		//Getting all the files into fileArray
		File[] listOfFiles = fl.listFiles();
		
		//Declare list to store file name 
		List<String> fileNames = new ArrayList<String>();
		
		for(File f:listOfFiles)
			fileNames.add(f.getName());
			
			//return the list
			return fileNames;
	}
	
	/**
	 * This method will create or append contend into the file specified
	 * @param folderpath
	 * @param filename
	 * @param content
	 * @return boolean
	 */
	public static boolean createFiles(String folderpath,String filename, List<String> content)
	{
		try
		{
			File fl = new File(folderpath,filename);
					FileWriter fw = new FileWriter(fl);
					for(String s: content)
					{
						fw.write(s+ "\n");
					}
					fw.close();
					return true;
		}
		catch(Exception Ex)
		{
			return false;
		}
	}
	
	
	/**
	 * This method will delete file name if it exists.
	 * @param folderpath
	 * @param fileName
	 * @return
	 */
	public static boolean deleteFile(String folderpath, String fileName)
	{
		//adding folderpath with file name and creating file object
		File file = new File(folderpath+"\\"+fileName);
		
		try
		{
			if(file.delete())
			return true;
			else
				return false;
		}
		catch(Exception Ex)
		{
			return false;
		}
	}
	
	/**
	 * This method will searchh file from the folder
	 * @param folderpath
	 * @param fileName
	 * @return
	 */
	public static boolean searchFile(String folderpath, String fileName)
	{
		//adding folderpath with file name and creating file object
				File file = new File(folderpath+"\\"+fileName);
				if(file.exists())
					return true;
				else
					return false;
	}
}
