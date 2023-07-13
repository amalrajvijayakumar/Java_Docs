package com.learning;

public class Logical {
public  static void main (String[]args){
	Logical lp = new Logical();
	lp.find_divisors(100);
//	lp.find_multiples(7);	
//	lp.test();
//	lp.count_of_divisors(150);
	lp.find_Prime(121);
//	lp.sum_of_digits (12345);
	lp.find_palindrome (121);
}
void find_palindrome (int cake)
{
	int no2 = cake;
	int reverse = 0;
	while (cake>0)
	{
	int rem = cake%10;
	reverse = (reverse * 10)+ rem;
	cake = cake/10;
	}
	{
//	System.out.println (reverse);
//	System.out.println (cake);
	}
	if (reverse == no2)
	{System.out.println("Its a Palindrome");
}
	else
	{
		System.out.println("Not a Palindrome");
	}
	}

void sum_of_digits (int no)
{
	int sum = 0;
	while (no>0)
	{System.out.println(no%10);
	sum = sum + 1;
	no = no/10;
	}
	{
		System.out.println("Sum of digits = " +sum);
	}
}

void test()
{
	System.out.println("1" + " 1 " +" 1 "+ " 1 "+ " 1 ");
}

void find_divisors(int no)
	{
	int div=1;
	while (div<=no) {
	if(no%div == 0)
	{
	System.out.println ("No of divisors -"+ div);
	}
	div = div + 1;
	}
   }

void find_multiples(int no)
{
	int no1=1;
	while(no1<=10)
		{
		System.out.println (no1 + " *7 =" + (no1 * no));
		no1 = no1+1;
		}
	}

void count_of_divisors(int no)
	{int div=2;
	int count=0;
	while(div<no)
	{
		if (no%div == 0)
	{System.out.println(div);
		count= count + 1;
	}
		div = div + 1;}
	System.out.println("Count of Divisor =" + count);
	}

void find_Prime(int no) //no = 141
{
	int div = 2;
	int count = 0;
	while(div<no)
	{
		if (no%div == 0)
		{System.out.println("Div NO :" + div);
		count = count +1;
		}
		div= div + 1;
	}
	{
	System.out.println ("count of div=" + count);
	}
if (count == 0)
	{System.out.println ("It is Prime Number");
	}
else
	{System.out.println ("It is not a Prime Number");
	}
	}
	}
