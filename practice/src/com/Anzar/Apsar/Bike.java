package com.Anzar.Apsar;

public class Bike {
	
	public Bike()
	{
		System.out.println("This is Bike constructor");
	}
	public Bike(int price)
	{
		System.out.println("Cost of bike is"+"   "+price);
	}
	public Bike(int speed , String name)
	{
		System.out.println("Speed of Bike is"+"   "+speed
				+"   "+"Name of Bike"+"   "+name);
	}
public static void main(String[] args) {
	
	Bike b = new Bike();
	Bike b1 = new Bike(150000);
	Bike b2 = new Bike(150 , "KTM");
	
}	

}
