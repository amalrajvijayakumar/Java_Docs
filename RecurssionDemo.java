package com.learning;

public class RecurssionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurssionDemo rd = new RecurssionDemo();
		rd.display(10);}

	private void display(int no) {
		// TODO Auto-generated method stub
		System.out.println(no);
		no =no +10;
		if(no<=50) {
			display(no);
		}	
	}
}
