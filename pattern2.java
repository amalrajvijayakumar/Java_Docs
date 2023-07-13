package com.learning;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern2 p2 = new pattern2();
		p2.pattern1 ();
		p2.pattern2();
		p2.pattern3();
	}
	
private void pattern3() {
		// TODO Auto-generated method stub
	 for(int row = 5; row>=1; row--)
	    {
	      for(int star=1; star<=5-row; star++)
	        {
	        System.out.print("* ");
	        }
	    for(int col=1; col<=row; ++col)
	        {
	        System.out.print(col+" "); 
	        }
	    System.out.println(); 
	    } 
	  }

private void pattern1() {
	    // TODO Auto-generated method stub
	    for(int no = 5; no>=1; no--)  //no-row
	    {
	     for(int star = 1; star<=no; star++) //printing star 
	       {   
	        System.out.print("");
	        	}
	         for (int num=1; num<=6-no; num++) //numb-column
	        {
	        System.out.print(num+ " ");  //printing number
	        }
	        System.out.println( );
	    }
	  }
private void pattern2() {
    // TODO Auto-generated method stub
    for(int last = 1; last<=5; last++)
    {
        for(int no = 1; no<=6-last; no++) // 1
        {
        System.out.print(no+" "); 
        }
        System.out.println();
    }
    
  }
}
