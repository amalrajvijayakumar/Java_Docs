package com.learning;

public class CountGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CountGivenString cg = new CountGivenString();
//	cg.check_count_of_character();
	cg.check_count_of_character2();
	}
	
	
	private void check_count_of_character2() {
		// TODO Auto-generated method stub
		String n = "sivasabaribala";
	    int[] cc = new int[n.length()];
	    int big =-1;
	    char position = ' ';
	  for(int j = 0; j<n.length()-1; j++)
	  {
	    int count = 1; 
	    char ch = n.charAt(j); 
	    for(int i=j+1; i<n.length();i++)
	    {
	      if(ch == n.charAt(i))
	      {
	        cc[i] = -1; 
	        count++; 
	      }
	    }
	    if(cc[j]!=-1) 
	    {
	      cc[j] = count;
	      if(count>big)
	      {
	    	  big = count;
	    	  position = n.charAt(j);
	      }
	    }
	    if(cc[j]>0) {
	    System.out.println(ch + " appears for " + cc[j] + 
	        " times");
	    }
	  }   System.out.println(position + " appears " + big);
	  	  }
	

	private void check_count_of_character() {
	    // TODO Auto-generated method stub
		    String n = "sivasabaribala";
		    int count = 1; 
		    char ch = n.charAt(0);
		    for(int i=1; i<n.length();i++)
		    {
		      if(ch == n.charAt(i))
		      {
		        count++; 
		      }
		    }
		    System.out.println(ch + " appears for " + count + 
		        " times");		
	}
}
