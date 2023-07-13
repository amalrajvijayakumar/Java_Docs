package Pushed;

	public class swapping_num
	{
	public static void main(String[] args)
	{
	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;
	
	// Printing values of numbers before swapping 
//	System.out.println("Original values before swapping are:");
	System.out.println("Value of number a is " +a); 
	System.out.println("Value of number b is " +b);
	System.out.println("Value of number b is " +c);
	System.out.println("Value of number b is " +d);
	
	a= a+b+c+d;
	b= a-(b+c+d);
	c= a-(b+c+d);
	d= a- (d+b+c);
	a= a-(b+c+d);
	
	// Printing values of numbers after swapping in order to see the change
	System.out.println("Values after swapping are:");
	System.out.println("Value of number a is " + a);
	System.out.println("Value of number b is " + b);
	System.out.println("Value of number b is " + c);
	System.out.println("Value of number b is " + d);
	}
	}

