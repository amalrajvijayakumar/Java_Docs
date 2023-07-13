package forGit;

import java.util.*;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int power = sc.nextInt();
		Power fp = new Power();
		fp.find_power(base,power);}

	private void find_power(int base, int power) {
		// TODO Auto-generated method stub
		while(power<=0) 
		{
		int box=1;
		while (power>0)
		{
		box= box*base;
		power= power-1;
		}
	System.out.println(box);
		}
		}
}