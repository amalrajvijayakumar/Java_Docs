package com.learning;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringDemo sd = new StringDemo();
//		sd.check_start();
//		sd.check_ends();
		String date = "30/05/2023";
	    String[] ds = date.split("/");
	    
	    for(int i=0;i<ds.length;i++)
	      System.out.println(ds[i]);
	}
	private void check_ends() {
	    // TODO Auto-generated method stub
	String name1 = "sabaribala";
	String name2 = "bala";
	boolean ends = true;
	int len1 = name1.length()-1; 
	
	for(int len2 = name2.length()-1; len2>=0;len2--)
	{
	  if(name1.charAt(len1)== name2.charAt(len2))
	  {
	    len1--;
	    continue; 
	  }
	  else
	  {
	    System.out.println("No, not ends with");
	    ends = false; 
	    break; 
	  }
	}  
	if(ends == true)
	{
	  System.out.println("yes, ends with "+name2);
		}
	}
	
	
private void check_start() {
		    // TODO Auto-generated method stub
		    String name1 = "sabaribala";
		    String name2 = "sab";
		    boolean starts = true; 
		for(int i=0; i<name2.length();i++)  {  
		    if(name1.charAt(i) == name2.charAt(i))
		    {
		      continue;
		    }
		    else
		    {
		      starts = false; 
		      break; 
		    }
		  }
		  if(starts == true)
		  {
		    System.out.println("yes " + name1 + " starts with "+name2);
		  }
		  else
		  {
		    System.out.println("Not starts with "+name2);
		 }
	}
}