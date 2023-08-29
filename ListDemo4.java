package com.learning;

import java.util.ArrayList;

public class ListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add("priyanka");
	    al.add("ashwini");
	    al.add("balaji");
	    al.add("jayasurya");
	    System.out.println(al);
	    
	    for (Object ob: al)
	    {
	    	String s= (String) ob;
	    	if (s.charAt(0)=='a')
	    	
	    	System.out.println(ob);
	    }
	    
	    ListDemo4 s1 = new ListDemo4(); 
	    ListDemo4 s2 = new ListDemo4(); 
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1.equals(s2));
	  System.out.println(s1.toString());
	  }
	  public int hashCode()
	  {
	    return -123;
	    }
	    
//	  //Class Cast Exception  
//	    Collections.sort(al);
//	    //int result = Collections.binarySearch(al, 200);
//	    int result = Collections.binarySearch(al, "balaji");
//	    System.out.println(result);
//	    System.out.println(al);
	    
	}
	
