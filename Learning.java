package com.learning;

class Learning
{
	public static void main (String []args )
	{
	Learning lp = new Learning();
	
	int power = lp.find_power(3,5);
	System.out.println ("Power =" + power);
	}

int find_power(int base, int power)
{
	int box=1;
	while(power>0)
	{
		box=box*base;
		power= power-1;
	}
return box;
}
}
