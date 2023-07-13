package Pushed;

import java.util.Scanner;

public class Count_Digits {
	
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number");
		int num = sc.nextInt();

		Count_Digits fc = new Count_Digits();
		fc.find_count_of_digits(num); 
}

void find_count_of_digits(int no)
{ 
	int count = 0;
	for (;no>0; )
//		while(no>0) 
		{
//		System.out.print(no%10); //to reverse the number
		count++;
		no = no/10;
	}
	System.out.println("count of digits = " + count);
}
}