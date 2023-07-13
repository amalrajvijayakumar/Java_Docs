package com.learning;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern3 p3 = new pattern3();
//p3.print_C();
//p3.print_E();
//p3.print_f();
//p3.print_o();
p3.print8();
}
	
private void print8() {
		// TODO Auto-generated method stub
	 for(int col=1; col<=7; col++)
     {
     if(col==1)
         System.out.print("  "); 
     else
         System.out.print("* "); 
     }
   System.out.println();
 for(int star=1; star<=7; star++)
     {
     System.out.print("* "); 
     for(int space=1; space<=6;space++)
       {
       System.out.print("  ");
       }
     System.out.println("*"); 
     }
 for(int col=1; col<=7; col++)
     {
      if(col==1)
         System.out.print("  "); 
     else
         System.out.print("* "); 
     }
   System.out.println();
   for(int star=1; star<=7; star++)
     {
     System.out.print("* "); 
     for(int space=1; space<=6;space++)
       {
       System.out.print("  ");
       }
     System.out.println("*"); 
     }
   for(int col=1; col<=7; col++)
     {
      if(col==1)
         System.out.print("  "); 
     else
         System.out.print("* "); 
     }
   
 }

private void print_o() {
		// TODO Auto-generated method stub
	  for(int col=1; col<=7; col++)
      {
      if(col==1)
          System.out.print("  "); 
      else
          System.out.print("* "); 
      }
    System.out.println();
  for(int star=1; star<=7; star++)
      {
      System.out.print("* "); 
      for(int space=1; space<=6;space++)
        {
        System.out.print("  ");
        }
      System.out.println("*"); 
      }
  for(int col=1; col<=7; col++)
      {
       if(col==1)
          System.out.print("  "); 
      else
          System.out.print("* "); 
      }
  }
	

private void print_f() {
		// TODO Auto-generated method stub
	 for(int col=1; col<=7; col++)
     {
     if(col==1)
         System.out.print("  "); 
     else
         System.out.print("* "); 
     }
   System.out.println();
 for(int star=1; star<=7; star++)
     {
     System.out.println("* "); 
     }
 for(int col=1; col<=7; col++)
     {
      if(col==1)
         System.out.print("  "); 
     else
         System.out.print("* "); 
     }
   System.out.println(); 
   for(int star=1; star<=7; star++)
     {
     System.out.println("* "); 
     }
 for(int col=1; col<=7; col++)
     {
      if(col==1)
         System.out.print("  "); 
     else
         System.out.print("* "); 
     }
	}

private void print_E() {
	    // TODO Auto-generated method stub
	    for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println(); 
	    for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
}

	private void print_C() {
		// TODO Auto-generated method stub
		 for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	}

}
