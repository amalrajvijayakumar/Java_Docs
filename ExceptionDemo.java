package com.learning;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo ed =  new ExceptionDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		ed.divide(no1, no2);
		ed.subtract(no1, no2);
	}
	private void subtract(int no1, int no2) {
	    // TODO Auto-generated method stub
	    System.out.println(no1-no2);
	  }

	  private void divide(int no1, int no2) {
	    // TODO Auto-generated method stub
		 try {
			 //Exception Possible Area
			 System.out.println(no1/no2);
			 int[] ar = new int[no1];
			 System.out.println(ar.length);
			 for(int i=0; i<ar.length;i++)
			 {
			   System.out.println(ar[i]);
			 }
		    }
		  catch(ArithmeticException ae)
		  {
		 //Exception Handling Area
	     System.out.println("Check no2");
		 //no1, no2: 
		 //divide(no1, no2); 
		  }
		  catch(NegativeArraySizeException 
				  | ArrayIndexOutOfBoundsException ae)
		   {
		  System.out.println("Check Array length. ");
		   }
		 catch(Exception e)
			{
			 System.out.println("Something went wrong ");
			 }
		 finally {
			//will get executed always irrespective of Exception occurs or not
		 System.out.println("Check me ");
			}
}
}
