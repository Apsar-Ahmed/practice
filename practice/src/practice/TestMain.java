package practice;

public class TestMain {
	
	public static void main(String[] args) {
		
		TestMain t = new TestMain();
		System.out.println("Hi All ");
		TestMain.main("Jspiders");
	}
	
	public static void main(String s1) {
		TestMain m = new TestMain();
		System.out.println("Welcome to"+"   "+s1);
		TestMain.main("Java", "Class");
		
	}
	
	public static void main(String s1 ,String s2) {
		
		TestMain p = new TestMain();
		System.out.println("This is"+"   "+s1+"   "+s2);
		
	}

}
