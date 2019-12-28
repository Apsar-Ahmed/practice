package com.Anzar.Apsar;

public class Son1 extends Father1 {

	void smokes()
	{
		System.out.println("He smokes Flake");
	}
public static void main(String[] args) {
	
	Son1 s = new Son1();
	s.smokes();
	
	Father1 f = new Father1();
	f.smokes();
}	
}
