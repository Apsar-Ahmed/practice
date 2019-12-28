package com.Anzar.Apsar;

public class Addition2 extends Addition {
	public int add(int a , int b)
	{ 
		//System.out.println("Addition is");
		return a+b;	
	}
public static void main(String[] args) {
	
	Addition2 a = new Addition2();
	System.out.println(a.add(5, 3));
	
	Addition1 b = new Addition1();
	System.out.println(a.add(9, 8));
	
	Addition m = new Addition();
	System.out.println(a.add(1, 2));
	
}	

}
