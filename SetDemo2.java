package com.learning;

import java.util.ArrayList;
import java.util.TreeSet;

public class SetDemo2  {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		Players mahi = new Players("MSD",  100);
		Players virat = new Players ("VK",90);
		Players rohit = new Players ("RS", 110);
		
		ArrayList al = new ArrayList();
		
		al.add(mahi);	//hexadecimal value of hashcode
		al.add(virat);
		al.add(rohit);
		
		System.out.println(al);
		
		TreeSet ts = new TreeSet(al);
		System.out.println(ts);
	}
}
