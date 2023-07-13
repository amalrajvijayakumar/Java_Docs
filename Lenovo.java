package com.learning;

public class Lenovo extends Laptop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lenovo len = new Lenovo();
		len.Browse();
		len.playgames();
		len.touch_screen();
		System.out.println(len.harddisk);
	}
	void touch_screen()
	  {
	    System.out.println("Touch Screen");
	  }
}
