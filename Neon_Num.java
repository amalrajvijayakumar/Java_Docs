package Pushed;

import java.util.Scanner;

public class Neon_Num {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		Neon_Num fn = new Neon_Num();
		int square = fn.find_power(number,2);
		int sum = fn.find_sum(square);
	
	if (sum == number)
	{
		System.out.println("Given number is Neon Number");
	}
	else
	{
		System.out.println("Not a Neon Number");
	}
	}
	
int find_sum(int num)
{
	int sum=0, rem;
	while(num>0)
	{
		rem=num%10;
		sum = sum +rem;
		num=num/10;
	}
	return sum;
}

	
int find_power(int base, int power)
{
	int ans=1;
	for (;power>0; power--) //while(power>0)
	{
	ans=base*power;
	//power=power-1;
	}
return ans;
}
}