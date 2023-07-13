package com.learning;

public class BinDec {

	public static void main(String[] args) {
		BinDec bd = new BinDec();
		bd.find_binary_to_decimal(100);
		}
		// TODO Auto-generated method stub
		private void find_binary_to_decimal(int no) {
		    // TODO Auto-generated method stub
		  int pow = 0; //
		  int decimal = 0; 
		  Looping_Practice2 lp = new Looping_Practice2(); //this method call from Looping_practice2 
		  while(no>0)
		  {
		  int rem = no%10; 
		  decimal = decimal + (rem * lp.find_power(2,pow)); 
		  no = no/10; 
		  pow = pow+1; 
		  }
		  System.out.println("Decimal value is "+decimal);
}
}

