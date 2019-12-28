package com.Anzar.Apsar;

public class Company extends Employee4 {
	
	public static void main(String[] args) {
		
		Company c = new Company();
		 
		c.setId(487488);
		System.out.println(c.getId());
		
		c.setName("Anzar");
		System.out.println(c.getName());
		
		c.setSalary(25000);
		System.out.println(c.getSalary());
	}

}
