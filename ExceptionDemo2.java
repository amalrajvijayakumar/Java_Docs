package com.learning;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {98,95,100,94, 99};
		try {
		try {
			ErrorDemo.display(marks);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		catch(ArrayIndexOutOfBoundsException aa)
		{
		  System.out.println("Check array ");
		}
   }
}
