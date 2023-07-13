package Pushed;

import java.util.Scanner;

public class Average {
	public static void main(String[] args)
	{Average ad = new Average();
	ad.calculate_percentage();
	}

private void calculate_percentage() {
	// TODO Auto-generated method stub
System.out.println("Enter Match count");
Scanner sc = new Scanner(System.in);
int match_count = sc.nextInt();

int[] runs = new int[match_count];
int total=0;
int i =0;
while(i<runs.length)
	{
	System.out.println("Enter Runs");
	runs[i] = sc.nextInt();
	total = total + runs[i];
	i++;
	}
	System.out.println("Total score is = "  + total);
	float percentage = total/match_count;
	System.out.println("Average" + percentage);
	}
}
