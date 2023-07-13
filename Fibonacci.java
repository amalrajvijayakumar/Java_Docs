package com.learning;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Fibonacci ld = new Fibonacci();
			ld.print_fibo();
//			ld.print_fibo_without_third();
			}
	
private void print_fibo() {
	    // TODO Auto-generated method stub
	    int n1 = 0, n2 =1; 
	    while(n1<=22)
	    {
	    System.out.println(n1);
	    n2 = n1 + n2; 
	    n1 = n2 - n1; 
	    
	    }
	  }
/*private void print_fibo_without_third() {
    // TODO Auto-generated method stub
    int n1 = 0, n2 =1; 
    LogicalPrograms lp = new LogicalPrograms();
    while(n1<=89)
    {
    boolean result = lp.find_Prime(n1);
    if(result==true)
      System.out.println(n1);
    n2 = n1 + n2; 
    n1 = n2 - n1; 
    
    }
  }*/
}
