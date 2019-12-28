package com.Anzar.Apsar;

public class Employee {
	public Employee()
	{
		System.out.println("He is our Employee");
	}
	protected Employee(String name)
	{
		System.out.println("Company Name is"+"   "+name);
	}
	private Employee(String name , int salary)
	{
		System.out.println("Employee name is"+"   "+name
				+"   "+"Company paying Salary to him is "+"   "+salary);
	}
public static void main(String[] args) {
	 Employee e = new Employee();
	 Employee e1 = new Employee("BYJUS");
	 Employee e2 = new Employee("Apsar", 50000);
}	
}
