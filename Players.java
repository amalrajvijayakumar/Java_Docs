package com.learning;

public class Players implements Comparable {
	
	int score;
	String name;
	public Players(int score ) {
		// TODO Auto-generated constructor stub
		this.score = score;
	}

	public Players(String name, int score) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.score = score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return this.name + " " + this.score;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

