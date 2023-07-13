package Pushed;

import java.util.Scanner;

public class Reverse_Printing {
	public static void main(String [] srgs)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :"); //input
	int num = sc.nextInt();
	
	Reverse_Printing call = new  Reverse_Printing();
	call.reverse_printing(num); //call method
	}
void reverse_printing(int no)
	{
//		while(no>0)	
		for (; no>0;)
	{System.out.println(no%10);
	no = no/10;
		}
	}
}
