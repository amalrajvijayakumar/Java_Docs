package forGit;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number"); 
		Scanner sc = new Scanner(System.in); //Scanner class
		int number = sc.nextInt();   //It is the number to calculate factorial   
		
		Factorial ff = new Factorial();
		ff.find_factorial(number);
	}
	
void find_factorial(int number)		//Method 
{
		int no, fact=1;				//variables
	 
		for (no=
				1;no<=number;no++)   //while loop
		{   
	      fact=fact*no;}    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	}
}