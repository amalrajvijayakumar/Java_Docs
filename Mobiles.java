package com.learning;

public class Mobiles  implements Comparable{
	
	public Mobiles(int price, int ram, float screensize, String brand) {
		super();
		this.price = price;
		this.ram = ram;
		this.screensize = screensize;
		this.brand = brand;
	}	
	int price, ram;
	float screensize;
	String brand;

	public String toString()
	{
		return this.brand+ ""+ this.price;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Mobiles mob2 = (Mobiles)this;
		Mobiles mob1 = (Mobiles)o;
		return 0;
	}
}
