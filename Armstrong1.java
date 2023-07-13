package com.learning;

import java.util.Scanner;

class Armstrong
{
     public static void main(String[] args)
{
Armstrong ap=new Armstrong();

System.out.println("Enter Number");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

int count=ap.count_ofdigit(1635);
System.out.println(count);
int result=ap.find_arms(num,count);
System.out.println(result);

if(num==result)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not Armstrong");
}
}

int count_ofdigit(int num)
{
int count=0;
while(num>0)
{
//int rem = num%10;
count=count+1;
num=num/10;
}
return count;
}

int find_arms(int num, int count)
{
int sum=0;
while(num>0)
{
int rem=num%10;				//1634 4 is remaing 
sum=sum+power(rem,count); //4,4 --256//3,4--81 //6,4 --1296//1,4--1
num=num/10;
}
return sum;
}

int power(int base,int power)//4,4 //3,4//6,4//1,4
{
int box=1;
while(power>0)
{
box=box*base;
power=power-1;
}
return box;//256//81
}
}
