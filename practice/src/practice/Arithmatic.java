package practice;

public class Arithmatic {
	
	void add(int a , int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	void  mul(float a , int b)
	{
		
		float c = a*b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		Arithmatic a = new Arithmatic();
		a.add(2, 3);
		a.mul(2, 3);
		
	}

}
