package com.Anzar.Apsar;

public class Son2 extends Father2 {

	void eat()
	{
		System.out.println("son follows Dad");
	}
	void Smokes()
	{
		System.out.println("Son learn from Dad");
	}
public static void main(String[] args) {
	
	Father2 f = new Son2();
	f.drink();
	f.eat();
	f.smokes();
}	
}
