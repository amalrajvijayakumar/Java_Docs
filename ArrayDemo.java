package Oops_Learning;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
	
		ArrayDemo ad = new ArrayDemo();
		
//		ad.learn_array1();
		ad.learn_array2();
//		ad.calculate_percentage();
	}

	
	private void calculate_percentage() {
		// TODO Auto-generated method stub
	System.out.println("Enter Subject count");
	Scanner sc = new Scanner(System.in);
	int sub_count = sc.nextInt();
	
	int[] marks = new int[sub_count];
	int total=0;
	int i =0;
	while(i<marks.length)
	{
		System.out.println("Enter Mark");
		marks[i] = sc.nextInt();
		total = total + marks[i];
		i++;
	}
	System.out.println("Total Mark is = "  + total);
	float percentage = total/sub_count;
	System.out.println(percentage);
}


private void learn_array2() {
		// TODO Auto-generated method stub
		int []  Nandini= {87,90, 100, 67, 56, 65};
		int i = 0;
		while(i<Nandini.length)
		{
//			if(Nandini[i]%2 == 0);
			System.out.println(Nandini[i]);
		i= i+2;
		}
//		System.out.println(Nandini[1]);
//		System.out.println(Nandini[2]);
//		System.out.println(Nandini[3]);
//		System.out.println(Nandini[4]);
//		System.out.println(Nandini[5]);
}


private void learn_array1() {
	int[] marks = new int[6];
	System.out.println(marks.length);
	
	marks[0]=100;
	marks[1]= 96;
	marks[2]= 89;
	marks[5]=99;
	System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);
    System.out.println(marks[5]);
    System.out.println(marks[5]);
	}
	}
