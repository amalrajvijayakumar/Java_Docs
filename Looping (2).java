package com.learning;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping lg = new Looping();
		lg.print1_10();
		}
	
void print1_10() {
	int no1 = 1, no2 = 10;
	while(no1<=5)
	{
	System.out.println(no1 * no2);  
	no1 = no1 + 1; 
	no2 = no2 - 1;
	}
}

}
