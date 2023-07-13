package Pushed;

import java.util.Scanner;

class finding_power{
	
public static void main(String[]args){
	
	System.out.println("Base Number");
	Scanner sc = new Scanner(System.in);
	int base =	sc.nextInt();
	
	System.out.println("Power Number");
	int power = sc.nextInt();
	
	finding_power lp = new finding_power();
	int Result = lp.find_power(base,power);

	System.out.println("Answer =" + Result);
}

private int find_power (int base, int power)
	{
	int ans=1;
	for(; power>0; power--)
	{
	ans= ans*base;
	}
	return ans;
	}
}