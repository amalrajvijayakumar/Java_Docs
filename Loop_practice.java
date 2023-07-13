package com.learning;

public class Loop_practice {

	public static void main(String[] args) {
		Loop_practice lp = new Loop_practice();
//lp.print_reverse(4321);
//		lp.count_of_digits(12345);
		lp.sum_of_digits(54321);
//		lp.reverse_a_no(1234);
//		lp.find_palindrome(131);
	}
	void find_palindrome(int cake) //12321
	{
	     int no2 = cake;
	    int reverse = 0;
	    while(cake>0)   //123>0 12>0    1>0 
	    {
	    int rem = cake%10; //1
	    reverse = (reverse * 10) + rem; //4 43  432 4321
	    cake = cake/10; //0
	     }
	//System.out.println (reverse);
	//System.out.println(cake);
	if(reverse == no2)
	    {
	    System.out.println("Palindrome"); 
	    }
	else
	    {
	    System.out.println("Not Palindrome"); 
	    }
	}
	
	
	
	
void print_reverse (int no)
{ 
	while(no>0)
	{System.out.println(no%10);
	no = no/10;
	}
}

void count_of_digits (int no)
{ 
	int count = 0;
	while(no>0) {
//		System.out.print(no%10);
	count = count + 1;
	no = no/10;
	}
	{System.out.println("count of digits = " + count);
	}
}

void sum_of_digits(int no)
{int sum = 0;
while (no>0){
//	System.out.println(no%10);
	sum = sum + 1;
	no = no/10; }
{System.out.println("Sum of Digits= " + sum);
	
}
	}

void reverse_a_no(int cake) //1234
{
    int reverse = 0;
    while(cake>0)   //123>0 12>0    1>0 
    {
    int rem = cake%10; //1
    reverse = (reverse * 10) + rem; //4 43  432 4321
    cake = cake/10; //0
     }
System.out.println("Reverse is " + reverse);
}
}
