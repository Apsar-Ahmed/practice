package com.Anzar.Apsar;

public class Addition3 extends Addition {
	
	private int add(int a, int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Addition3 p = new Addition3();
		System.out.println(p.add(10, 20));
		
		Addition2 a = new Addition2();
		System.out.println(a.add(5, 3));
		
		Addition1 b = new Addition1();
		System.out.println(a.add(9, 8));
		
		Addition m = new Addition();
		System.out.println(a.add(1, 2));
		
	}		

}
