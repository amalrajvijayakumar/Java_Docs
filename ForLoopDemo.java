package com.learning;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
	    int[] a = {10,20,30};
	    int[] b = {40,50,60};
	    int[] c = new int[a.length+b.length];
	    
	    for(i= 0;i<a.length;  i++)
	    {
	      System.out.println("hi"); 
	    }
	    while(i<c.length){
	      c[i] = b[a.length-i];
	      i++; 
	      
	    }
	}

}
