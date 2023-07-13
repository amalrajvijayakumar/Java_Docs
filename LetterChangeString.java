package com.learning;

public class LetterChangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "   I came to Chennai   ";
	    String name2 = "";
	    boolean alphabet_came = false;
	    char[] ch = name.toCharArray();
	    for(int i=0; i<ch.length;i++)
	    {
	      char letter = ch[i];
	      if (letter==' ' && alphabet_came == false)
	      {
	    	  
	      }
	      else {
	        alphabet_came = true; 
	      //System.out.print(ch[i]);
	      name2 = name2 + letter; //amal
	      }
	    }
	    System.out.println(name2);
	    }
    }
