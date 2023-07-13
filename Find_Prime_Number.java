package Pushed;

import java.util.Scanner;

public class Find_Prime_Number {
	
	public static void main(String [] srgs)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :"); //input
		int num = sc.nextInt();
		
		Find_Prime_Number call = new Find_Prime_Number();
		call.find_prime(num); //call method
		}
	
void find_prime(int no) //no = 141
	{
//		int div = 2;
		int count = 0;
		for ( int div=2;div<no;) //		while(div<no) 
		
		{
			if (no%div == 0)
			{System.out.println("Div NO :" + div);
			count++;
			}
			div++;
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
