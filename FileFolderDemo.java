package com.learning;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;


public class FileFolderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	File file = new File ("/home/amalraj/Documents/Amal/Raj/");
//	boolean present = file.exists();
//	System.out.println("Folder present : " + present);
//	if(present == false)
//	file.mkdirs(); //folder creation
	
//	File file = new File("/home/amalraj/Documents/Amal/Raj/test.txt");
//	boolean present = file.exists();
//	if (present == false)
//		try {
//			boolean created = file.createNewFile(); //file creation
//			System.out.println("File created " + created);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	
//	File file = new File("/home/amalraj/Documents/Amal/Raj/test.txt");
//	file.delete(); //file deletion
//	boolean present = file.exists();
//	System.out.println("File deleted :" + present);
	
		
//		File file = new File("/home/amalraj/Documents/Amal/Raj/test.txt");
//	try {
//		file.createNewFile();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	File newName = new File ("/home/amalraj/Documents/Amal/Raj/Hk.txt");
//	
//	boolean renameSuccess = file.renameTo(newName); //Rename the file
//	
//	System.out.println("Rename " + renameSuccess);
//
//	//file name 
//		System.out.println("File  name "+ newName.getName());
//		System.out.println(file.canExecute());
		
//		
//		File file = new File ("/home/amalraj/Desktop");
//		String [] listofFilesFolders= file.list(); //list the files in whole folder
//		
//		for(int i= 0; i<listofFilesFolders.length; i++)  //for loop
//			System.out.println(listofFilesFolders[i]);
//
//		for(String s: listofFilesFolders)	//for each loop
//			System.out.println(s );
//		
	
//		File file = new File ("/home/amalraj/Documents");
//		File[] fileFolderList = file.listFiles();
//		for(File f: fileFolderList)
//			if(f.isFile())
//				System.out.println(f);
//			if(f.isDirectory())
//			System.out.println(f);
		
		//Printing only particular format file like HTML
//		File file = new File ("/home/amalraj/Documents/js");
//		File[] fileFolderArray = 	file.listFiles();
//		for(File f :fileFolderArray)
//		{
//			if(f.isFile()) 
//			{
//		String fileName = f.getName();	
//		int lastDot = fileName.lastIndexOf(".");
//		String extension = fileName.substring(lastDot+1);
//		if(extension.equals("jpg"))
//		System.out.println(fileName);
		
		//Printing only particular format file like HTML with Size
		File file = new File ("/home/amalraj/Documents/js");
		File[] fileFolderArray = 	file.listFiles();
		for(File f :fileFolderArray)
		{
			if(f.isFile()) 
			{
		String fileName = f.getName();	
		int lastDot = fileName.lastIndexOf(".");
		String extension = fileName.substring(lastDot+1);
		if(extension.equals("txt"))
			if(f.length()>50000)
			//	f.delete(); //delete particular file extenion
		System.out.println(fileName + "Size : "+f.length());
			}	
	}
	}
}