package com.learning;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Iterator it = al.iterator(); 
		while(it.hasNext()) //Do you have next value?
		{
			int no = (int) it.next(); 
			if(no==40)
			{
				it.remove();
			}
		}
		System.out.println(al);
		
//		System.out.println(it.next()); 
//		System.out.println(it.next()); 
//		System.out.println(it.next());
//		System.out.println(it.next());}
	}
}
