package Pushed;

import java.util.Scanner;

public class Palindrome { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
	
		Palindrome fp = new Palindrome();
		fp.find_palindrome(number);
	}

void find_palindrome(int no)
	{
	
		int reverse = 0;
		for (;no>0;) 				//  while(no>0)   //123>0 12>0    1>0 
	    {
	    int rem = no%10; //1
	    reverse = (reverse * 10) + rem; 	//4 43  432 4321
	    no = no/10; //0
	     }
	//System.out.println (reverse);  //if want to print
	//System.out.println(cake);
	if(reverse == no)
	    {
	    System.out.println("Palindrome"); 
	    }
	else
	    {
	    System.out.println("Not Palindrome"); 
	    }
	}
	}