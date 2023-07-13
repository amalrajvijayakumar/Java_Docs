package Pushed;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
			
		ArmstrongNumber fa = new ArmstrongNumber();
		int count=	fa.count_of_digits(number);
		int result= fa.find_arms(number, count);
//		System.out.println(result);
	
	
if(number==result)
	{
	System.out.println("Armstrong number");
	}
	else
	{	System.out.println("Not Armstrong");
	}
}

int count_of_digits(int num)
	{
		//int count=0; 
		int count=0; 
		for (;num>0; count++)  //	while(num>0)
		{
		int rem = num%10;
		num=num/10; //count=count+1;
		}
		return count;
		}

int find_arms(int num, int count)
		{
		int sum=0;

		for (;num>0;) 					//		while(num>0)
		{
		int rem=num%10;					//1634 4 is remaing 
		sum=sum+find_power(rem,count); //4,4 --256//3,4--81 //6,4 --1296//1,4--1
		num=num/10;
		}
		return sum;
		}

int find_power(int base,int power)//4,4 //3,4//6,4//1,4
		{
		int box=1;
		for(;power>0; power--) //while(power>0)
		{
		box=box*base;	//power=power-1;
		}
		return box;//256//81
		}
}
