package com.Anzar.Apsar;

public class Conductor {
	
	public Conductor()
	{
		this(20);
		System.out.println("He is this Bus Conductor");
	}
	public Conductor(int price)
	{
		this("KMBT", 5143);
		System.out.println("Cost of Bus Ticket is "+"   "+price);
	}
	public Conductor(String name , int busnum)
	{
		System.out.println("Nmae of bus travels is"+"   "+name
			+"   "+"Bus number is"+busnum);
	}
public static void main(String[] args) {
	
	Conductor c = new Conductor();

	}	

}
