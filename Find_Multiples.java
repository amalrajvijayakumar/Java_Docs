package Pushed;

import java.util.Scanner;

class Find_Multiples{
public static void main(String [] srgs)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :"); //input
	int num = sc.nextInt();
	System.out.println("Until which line do you want to print :"); //how many lines
	int value = sc.nextInt(); 
	Find_Multiples call = new Find_Multiples (); 
	call.print_tables(num,value);
	}


void print_tables(int num,int val)
	{
	int count = 1; 
	for(; count<=val; count++)
	{
	System.out.println(count+" * "+num+" = "+(count * num));
	}
}
}