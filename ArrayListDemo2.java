package com.learning;
import java.util.ArrayList;
import java.util.HashMap;
t;
import java.util.regex.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer> ();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("abcd");
		al.add(false);
		ArrayListDemo2 ald = new ArrayListDemo2(); 
		ald.add_All_items(al);
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put(123, "abcd");
	}

	private void add_All_items(ArrayList al<? extends Number>) {
		// TODO Auto-generated method stub
		int total = 0; 
		for(Object ob:al)
		{
			total = total + (int) ob;
		}
		System.out.println(total);
	}

}
