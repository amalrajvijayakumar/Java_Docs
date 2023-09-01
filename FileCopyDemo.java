package com.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				
				InputStream input = new FileInputStream("/home/amalraj/Downloads/wallpaperbetter.jpg");
				OutputStream output = new FileOutputStream("/home/amalraj/Downloads/wallpaper.jpg");
			int content = input.read();
			while(content !=-1) {
				output.write(content);
				content = input.read();
			}
			output.flush();
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
