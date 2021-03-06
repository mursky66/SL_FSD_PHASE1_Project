package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeProject
{
	static final String folderpath="G:\\Lerning\\SL Mattirial\\Course-2\\Project work self\\LockedMeFiles";
	public static void main(String[] args) 
	{
		int proceed=1;
		
		do
		{
			
		//Variable Declaration
		Scanner obj = new Scanner(System.in);
		int ch;
		
		//Menu
		displayMenu();
		System.out.println("Enetr your choice:");
		ch=Integer.parseInt(obj.nextLine());
		
		
		switch(ch)
		{
		case 1 : getAllFiles();
					break;
		case 2 : createFiles();
					break;
		case 3 : deleteFiles();
					break;
		case 4 : searchFiles();
					break;
		case 5 : System.exit(0);
					break;
		default : System.out.println("Invalid Option");			
		}
		
		
		}while(proceed>0);
	}
	
	public static void displayMenu()
	{
		System.out.println("******************************************************************************");
		System.out.println("\t\t\tComapany Lockers Pvt. Ltd.");
		System.out.println("******************************************************************************");
		System.out.println("1. Display All files");
		System.out.println("2. Add new file");
		System.out.println("3. Delete a file");
		System.out.println("4. Search a file");
		System.out.println("5. Exit");
		System.out.println("******************************************************************************");
		
	}
	/**
	 * This is GetAll files method
	 */
	public static void getAllFiles()
	{
//Get File names
		List<String> fileNames = FileManager.getAllFiles(folderpath);

		for(String f:fileNames)
			System.out.println(f);
	}
	/**
	 * This is Creating files method
	 */
	public static void createFiles()
	{

				Scanner obj = new Scanner(System.in);
				String fileName;
				int lineCount;
				List<String> content = new ArrayList<String>();
				
				//Read file name from user
				System.out.println("Enter File Name :");
				fileName=obj.nextLine();
				
				//Read number of line from user 
				System.out.println("Enter how many line in the file:");
				lineCount=Integer.parseInt(obj.nextLine());
				
				//Read Lines from user
				for(int i=1;i<=lineCount;i++)
				{
					System.out.println("Enter line "+i+":");
					content.add(obj.nextLine());
				}
				
				//Save the content into the file
				boolean isSaved = FileManager.createFiles(folderpath, fileName, content);
				
				if(isSaved)
					System.out.println("File and data saved succesufull");
				else
					System.out.println("Some error occured. please contact admin@mayur.com");
				
	}
	/**
	 * This is delete file method
	 */
	public static void deleteFiles()
	{
		//Code for deleting file
				String fileName;
				Scanner obj = new Scanner(System.in);
				
				//Read file name from user 
				System.out.println("Enter file name to be deleted:");
				fileName=obj.nextLine();
				
				//Delete the file 
				boolean isDeleted = FileManager.deleteFile(folderpath, fileName);
				
				if(isDeleted)
					System.out.println("File deleted successfully");
				else
					System.out.println("Either file not there or some access issue");
	}
	/**
	 * This is search file method
	 */
	public static void searchFiles()
	{
		String fileName;
		Scanner obj = new Scanner(System.in);
		
		//Read file name from user 
		System.out.println("Enter file name to be searched:");
		fileName=obj.nextLine();
		
		//Search the file 
		boolean isFound = FileManager.searchFile(folderpath, fileName);
		
		if(isFound)
			System.out.println("File is present");
		else
			System.out.println("File is not present");
	}

}
