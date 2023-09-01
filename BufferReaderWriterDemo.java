package com.learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/amalraj/Documents/Amal/abc.txt");
		
		FileWriter fWriter;
		try {
			fWriter = new FileWriter(file, true);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write("Tamil");	
			bWriter.newLine();
			bWriter.write("English");
			bWriter.newLine();
			bWriter.write("Mathematics");
			bWriter.flush();
			bWriter.close();
			
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			String line = bReader .readLine();
			int linecount = 0;
			int sentenceCount = 0;
			int wordCount =0;
			int charCount =0;
			while(line!= null)
			{
				String[] sentence = line.split("[.]");
				sentenceCount = sentenceCount + sentence.length;
				String[] words = line.split(" ");
				wordCount = wordCount + words.length;
				System.out.println(line);
				charCount = charCount + line.length();
				linecount++;
				
				line = bReader.readLine();
			}
			System.out.println("No. of Lines " +  linecount);		
			System.out.println(" No of Sentences "+ sentenceCount);
			System.out.println(" No of Words "+ wordCount);
			System.out.println("No of characters " + charCount);
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 

}
