package Pushed;

import java.util.Scanner;

public class Reverse_Number {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
	int Num = sc.nextInt();
	
		Reverse_Number rn = new Reverse_Number();
		rn.reverse_number(Num);
	}
void reverse_number(int no) //1234
	{
	    int reverse = 0;
	    for (;no>0;)	   // while(no>0)   //123>0 12>0    1>0 
	    {
	    int rem = no%10; 		//1
	    reverse = (reverse * 10) + rem; //4 43  432 4321
	    no = no/10; //0
	     }
	System.out.println("Reverse is " + reverse);
	}
	}
