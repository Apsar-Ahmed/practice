package com.Anzar.Apsar;

public class Additions {
	int a;
	int b;
	void add(int a , int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a+"   "+this.b);
		
	}
	public static void main(String[] args) {
		Additions a = new Additions();
		a.add(2, 5);
	}

}
