package com.Anzar.Apsar;

public class Dogs extends Animals {
	void eat()
	{
		System.out.println(super.name+"   "+"is Eating");
	}
	
	
public static void main(String[] args) {
	
	Dog d = new Dog();
	d.eat();
	
}	

}
