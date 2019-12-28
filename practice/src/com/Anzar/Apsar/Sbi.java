package com.Anzar.Apsar;

public class Sbi extends Rbi {
	
	public void RateofInterest()
	{
		System.out.println("Rate of interest of SBI is 8");
	}
	
public static void main(String[] args) {
	
	Rbi r = new Rbi();
	r.RateofInterest();
	
	Axis a = new Axis();
	a.Rateofinterest();
	 
	Sbi s = new Sbi();
	s.RateofInterest();
	
	
}	

}
