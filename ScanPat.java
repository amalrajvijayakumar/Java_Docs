package PatternPrograms;

import java.util.Scanner;

public class ScanPat {
	
	 public static void main(String[] args)
	    {
	        // Create a new Scanner object
	        Scanner scanner = new Scanner(System.in);

	        // Get the number of rows from the user
	        System.out.println("Enter the number of rows to print the pattern ");

	        int rows = scanner.nextInt();

	        System.out.println("** Printing the pattern... **");

	        for (int i = rows; i >= 1; i--)
	        {
	            for (int j = i; j >= 1; j--)
	            {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	        }
	    }

