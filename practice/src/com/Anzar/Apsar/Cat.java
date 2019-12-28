package com.Anzar.Apsar;

public class Cat  extends Animal{

	void eat()
	{
		System.out.println("Cat is Meowing");
	}
	
public static void main(String[] args) {
	
	Animal a = new Animal();
	a.eat();
	
	Dog d = new Dog();
	d.eat();
	
	Cat c = new Cat();
	c.eat();
	
	BabyDog m = new BabyDog();
	m.eat();
	m.weep();
	 
	
	
	
	
}
	
}
