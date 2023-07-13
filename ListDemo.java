package com.learning;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList grocery = new ArrayList();
//		grocery.add("Shampoo");
//		grocery.add("Soap");
//		grocery.add("toothpaste");
//		grocery.add("tooth brush");
//		System.out.println(grocery);
//		
//		ArrayList veg = new ArrayList();
//		veg.add("tomato");
//		veg.add("brinjal");
//		veg.add("apple");
//		veg.add("banana");
//		veg.add("tomato");
//		
//		System.out.println(veg);
//		
//		grocery.addAll(veg);
//		System.out.println(grocery);
//		
//		System.out.println(grocery.contains("tomato"));
//		grocery.removeAll(veg);
//		System.out.println();
	

	int[] a = {10,20,30,40}; 
    int[] b = {50,60,70,80}; 
    int len1 = a.length;
    int len2 = b.length;
    int[] c = new int[len1+len2];
    int j =0; 
    for(int i=0;i<c.length;i++)
    {
      if(i<a.length)
      c[i] = a[i]; 
      else
        {
        c[i] = b[j];
        j++;
        }
    }
    for(int i=0; i<c.length;i++)
    {
      System.out.println(c[i]);
    }
      }
}
