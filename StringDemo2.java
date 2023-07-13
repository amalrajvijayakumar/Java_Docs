package com.learning;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "amalraj";
		
		for(int i=0; i<name.length(); i++)
		{
		char letter = name.charAt(i);
		System.out.print((char)(letter-32));
		}
		
		System.out.println();
		
		String name1 = "Amal Raj12345";
		
	    for(int i=0; i<name.length(); i++)
	    {
	    	
	    char letter = name1.charAt(i); //letter = A
	//if the letter is present in between 'a' and 'z':
	    if(letter>='a' && letter<='z')
	    
	      System.out.print((char)(letter-32));
	    else
	      System.out.print(letter);
	  }
	
	}
}
