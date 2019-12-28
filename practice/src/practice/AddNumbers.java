package practice;

public class AddNumbers {
	
	int add()
	{
		System.out.println("Adding Two Numbers");
		return 0;
	}
	int  add(int a , int b)
	{
		//int c =a+b;
		System.out.println("Addition"+"   "+a+"  "+b);
		return a+b;
	}
	float add(int a , float b)
	{
		//float c = a+b;
		System.out.println("Addition "+"   "+a+"   "+b);
		return a+b;
		
	}
	double add(double a , float b)
	{
		//double c =a+b;
		System.out.println("Addition"+"   "+a+"   "+b);
		return a+b;
		
	}
	
	public static void main(String[] args) {
		AddNumbers a = new AddNumbers();
	//	a.add();
	//	a.add(2, 3);
	//	a.add(2, 8.0f);
	//	a.add(5.0, 7.0f);
		
		System.out.println(a.add());
		System.out.println(a.add(2, 3));
		System.out.println(a.add(5, 7.0f));
		System.out.println(a.add(6.0, 7.0f));
		
	}

}
