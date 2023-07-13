package Pushed;

import java.util.Scanner;

public class Sum_of_digits {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	//scanner object
	System.out.println("Enter the Number");	
	int number = sc.nextInt();	//input number
	
	Sum_of_digits fs = new Sum_of_digits(); //object
	fs.find_sum_of_digits(number);	//call method
}
void find_sum_of_digits(int no)	//method definition
	{
		int sum=0;  		//variable
		for (;no>0;)		//for loop
		
		{	int rem = no%10;
//			System.out.println(no%10);	//modulo
			sum = sum + rem;
			no=no/10;}	
		
		System.out.println("Sum of digits =" + sum);
	}
	}
