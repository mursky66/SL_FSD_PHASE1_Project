package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeProject
{
	static final String folderpath="G:\\Lerning\\SL Mattirial\\Course-2\\Project work self\\LockedMeFiles";
	public static void main(String[] args) 
	{
		//Variable Declaration 
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
		
		//Close scanner object
		obj.close();
	}

}
