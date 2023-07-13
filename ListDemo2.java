package com.learning;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList a = new ArrayList(); 
//		  a.add(100);
//		  a.add(101);
//		  a.add(102);
//		  a.add(103);
//		  System.out.println(a);
//		
//		int [] arr = {100,101,102,103};
//		  for(int i = 0; i<array.length; i++)
//		  {
//			  System.out.println(array[i]);
//		  }
		//enhanced for loop - for each loop
//		  for(int aa: arr)
//		  {
//		    System.out.println(aa);
//		  }
//		  ArrayList al = new ArrayList(); 
//		  al.add(100);
//		  al.add(101);
//		  al.add(102);
//		  al.add(103);
//		  System.out.println(al);
//		  for(Object ob:al)
//		  {
//			  Integer no = (Integer)ob;
//			  if(no%2 ==0)
//		    System.out.println(ob);
//		  }
		
		ArrayList a = new ArrayList(); 
		  a.add(10);
		  a.add(20);
		  a.add(30);
		  a.add(40); 
		  
		  ArrayList b = new ArrayList(); 
		  b.add(50);
		  b.add(60);
		  b.add(70);
		  b.add(80); 
		  
		  a.addAll(b);
		  System.out.println(a);
		  a.retainAll(b);
		  System.out.println(a);
		  List c = a.subList(0, 2);
		  System.out.println(c);
		  Object[] ob = a.toArray();
		  for(int i=0; i<a.size();i++)
		  {
		    System.out.println(a.get(i));
		  }
		 for(Object val:ob)
		  {
			 
		    System.out.print(val + " ");
		  }
		 System.out.print(a);
	}
}
