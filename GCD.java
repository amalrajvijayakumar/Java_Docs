package Pushed;

import java.util.*;

class GCD{
	public static void main(String [] args)
	{
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();				//number 1
		int number2 = sc.nextInt();				//number 2
	
		GCD gc = new GCD();
		gc.find_greatest_cdivisors(number1, number2);
	}
	
private void find_greatest_cdivisors(int no1, int no2) {
	int div = 2,								//divisor variable
	small,cd=0;									//variable for small number
    small = no1>no2 ? no1:no2;					//terenery operator
	   while(div<=small)
		    {
		    	if ((no1%div ==0) && (no2%div ==0))  //if condition
		    	{cd=div;
		    	}
		    	{div++;
		    	}
		    }
		    System.out.println("Greatest Common Divisor = " + cd);
		}
}
