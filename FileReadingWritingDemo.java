package com.learning;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingWritingDemo {
	public static void main(String[] args) {
		File file = new File("/home/amalraj/Documents/Amal/abc.txt");
		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			writer.write(65);
			writer.write(" How are you");
			
			writer.flush();  
			writer.close();
			
			
			
			//find the length of the file
			FileReader fileReader = new FileReader(file);
			 char[]  ch = new char[(int) file.length()];
			 System.out.println(ch.length);
			 fileReader.read(ch);
			 for (char ch1 : ch )
				 System.out.print(ch1);
				 
			 //printing characters
//			FileReader fileReader = new FileReader(file);
//			int output = fileReader.read();
//			while(output!=-1)
//			{
//				System.out.print((char) output);
//				output = fileReader.read();
//
//			}
//			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
		
	}

}
