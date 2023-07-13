package com.learning;

import java.util.Scanner;

public class Factnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		Factnumber fn = new Factnumber();
		int square = fn.find_power(number,2);
		int sum = fn.find_sum(square);
		fn.find_factorial(number);
	
	if (sum == number)
	{
		System.out.println("Given number is Neon Number");
	}
	else
	{
		System.out.println("Not a Neon Number");
	}
	}
	
int find_sum(int num)
{
	int sum=0, rem;
	while(num>0)
	{
		rem=num%10;
		sum = sum +rem;
		num=num/10;
	}
	return sum;
}

	
int find_power(int base, int power)
{
	int box=1; 
	for (;power>0; power--) //while(power>0)
	{
	box=base * power;
	//power=power-1;
	}
return box;
}

void find_factorial(int no)
{
	for(int fact=1; no<=1; no--)
	{System.out.println(fact);}
}
}
