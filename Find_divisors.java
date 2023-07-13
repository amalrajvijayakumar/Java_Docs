package Pushed;


import java.util.Scanner;

public class Find_divisors {
public static void main(String [] srgs)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :"); //input
	int num = sc.nextInt();
	
	Find_divisors call = new Find_divisors();
	call.find_divisors(num); //call method
	}

void find_divisors(int no)
	{
	int div=1; 
	for (; div<=no; div++) //for loop 
	
	if(no%div == 0)
	{
	System.out.println ("Divisor Number -"+ div); //printing divisors
	}
	}
}