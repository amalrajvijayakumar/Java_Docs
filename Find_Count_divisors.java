package Pushed;

import java.util.Scanner;

class Find_Count_divisors{
public static void main(String [] srgs)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :"); //input
	int number = sc.nextInt();
	
	Find_Count_divisors call =new Find_Count_divisors(); 
	call.count_of_divisors(number);
	
	
	}

void count_of_divisors(int no)
{ 
	int count=0;
	for (int div=2;div<no;)
	{
	if (no%div == 0)
	{
	// System.out.println(div);  //divisor print
	count++;
		}
	div++;
	}
	System.out.println("Count of Divisor =" + count);
}
}