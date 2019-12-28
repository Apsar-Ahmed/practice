package com.Anzar.Apsar;

public class Runner {
	public static void main(String[] args) {
		Bikes b = new Bikes();
		b.setId(8897);
		System.out.println(b.getId());
		
		b.setName("ZR");
		System.out.println(b.getName());
		
		b.setPrice(150000);
		System.out.println(b.getPrice());
		
		
	}
}
