package com.learning;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer name = new StringBuffer("Amalraj");
	    
	    StringBuffer name2 = new StringBuffer(); 
	    for(int i=0; i<name.length();i++)
	    {
	      name2.append(name.charAt(i));
	      System.out.println(name2.hashCode());
	    }
	    System.out.println(name2);
	}
}

