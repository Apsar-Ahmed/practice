package practice;

public class Bar {
	
	void supply()
	{
		System.out.println("It is Bar And Restuarant");
	}
	void supply(int menulist)
	{
		System.out.println("Number of Items"+"   "+menulist);
	}
	void supply(String name)
	{
		System.out.println("Name of Restuarant"+"   "+name);
	}
	void supply( String name , int price)
	{
		System.out.println("name of Beer is"+"   "+name
				+"   "+"Cost of Beer is"+"   "+price);
	}
	void supply(double cost,String flavour)
	{
		System.out.println("Cost of the Beer is"+"   "+cost
				+"   "+"Flavour of Beer is"+"   "+flavour);
	}
	
	public static void main(String[] args) {
		
		Bar b = new Bar();
		b.supply();
		b.supply(150);
		b.supply("Bar And Restuarant");
		b.supply("Budwiser", 170);
		b.supply(150.0, "Mango");
	}

}
