package com.learning;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Pattern p1 = new Pattern();
	p1.pattern1();
	p1.pattern2(); //1-25 by line
	p1.pattern3();
	p1.pattern4();
	p1.pattern5(); //54321
	p1.pattern6();  //54321
	p1.pattern7();
	
	}		

	private void pattern7() {
		 int count =5; 
		    int num = 1; 
		    while(count>=1)
		    {
		    for(int no=1; no<=count; no++)
		    { 
		      System.out.print(num + "\t");
		      num++; 
		    }
		    System.out.println(); 
		    count--; 
		    }
		  }
		

	private void pattern6() {
		// TODO Auto-generated method stub
		for (int count=5; count>=1; count--)
		{
			for(int no=count; no>=1; no--)
			{
				System.out.print(no + " ");}
			System.out.println();
		}
	}

	private void pattern5() {
		      // TODO Auto-generated method stub
		      int count = 1; 
		      while(count<=5)
		      {
		          for(int no=5; no>=count; no--) {
		          System.out.print(no+" "); 
		          }
		          System.out.println(); 
		      count++; 
		      }
		    }
	

	private void pattern4() {
	    // TODO Auto-generated method stub
	    int count = 5; 
	    while(count>=0)
	    {
	        for(int no=1; no<=count; no++) {
	        System.out.print(no+" "); 
	        }
	        System.out.println(); 
	    count--; 
	    }	    
	  }
	

private void pattern3() {
		// TODO Auto-generated method stub
	for(int no=1; no<=5; no++) {
		System.out.print(no+" "); 
		}
		System.out.println();
		for(int no=1; no<=4; no++) {
		System.out.print(no+" "); 
		}
		System.out.println(); 
		for(int no=1; no<=3; no++) {
		System.out.print(no+" "); 
		}
		System.out.println();

		for(int no=1; no<=2; no++) {
		System.out.print(no+" "); 
		}
		System.out.println();
}

private void pattern1(){
		    // TODO Auto-generated method stub
		        for(int no = 1; no<5; no++)
		        {
		        System.out.print(no+" "); 
		        }
		        System.out.println(); 
		    	    
		    for(int no = 5; no<10; no++)
	        {
	        System.out.print(no+" "); 
	        }
	        System.out.println();

		for(int no = 10; no<15; no++)
			{
		System.out.print(no+" "); 
		}
		System.out.println();
			
			for(int no = 15; no<20; no++)
		{
			System.out.print(no+" "); 
		}
		System.out.println();
			
			for(int no = 20; no<=25; no++)
		{
		System.out.print(no+" "); 
		}
		System.out.println();}
		

private void pattern2() {
    // TODO Auto-generated method stub
    for(int no=1; no<=25; no++)
    {
    System.out.print(no+" ");
    if(no%5==0)
      {
      System.out.println();
      }
     }   
  }
}