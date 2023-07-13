package com.learning;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String match = "-";
		   String input = "03-July-2023";
		        Pattern patternObj = Pattern.compile(match);
		        String[] items = patternObj.split(input);
		        for(int i=0;i<items.length;i++)
		        {
		        	System.out.println(items[i]);
		        }
		
		
//		String mobile = "+91 9884012810"; //Country code 
//		Pattern patternObj = Pattern.compile("(0|91)?[0-9]{9}"); //(0|91)? for find country code 
//				Matcher matcherObj = patternObj.matcher(mobile);
//				while(matcherObj.find())
//				{
//					System.out.print(matcherObj.group());
//				}
		
//		String mobile = "9884012810";
//		  Pattern patternObj = Pattern.compile("[6-9][0-9]{9}");
//		    Matcher matcherObj = patternObj.matcher(mobile);
//		    while(matcherObj.find())
//		    {
//		      System.out.print(matcherObj.group());
//		    }
//		
		
//		String password = "Chennai 600001";
//		  Pattern patternObj = Pattern.compile("\\D");
//		    Matcher matcherObj = patternObj.matcher(password);
//		    int count = 0;
//		    while(matcherObj.find())
//		    {
//		      count++;
//		      System.out.print(matcherObj.group());
//		    }
//		    System.out.println(count);
		    
//		String input = "amal@amal123.com";
//		Pattern patternObj = Pattern.compile("[^0123456789 a-z A-Z. ]");
//		Pattern patternObj = Pattern.compile("[^a-zA-Z0-9]");
//		Pattern patternObj = Pattern.compile("[0-9]");
//		Pattern patternObj = Pattern.compile("\\d{10}");
//	    Matcher matcherObj = patternObj.matcher(input);
	   
//	    while(matcherObj.find())
//	    {
//	      System.out.print(matcherObj.group());
//	      System.out.println(matcherObj.start());
//	      System.out.println(matcherObj.end());

	    }
	}


