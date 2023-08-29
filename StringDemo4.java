package com.learning;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1 = "amal";
	String s2 = "amal";
	
//	for(int i=s1.length()-1; i>=0; i--) {
//		s2 = s2 + s1.charAt(i);
//	}
	System.out.println(s2);

	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
	}

}
