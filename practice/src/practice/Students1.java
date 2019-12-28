package practice;

public class Students1 {
	
	void goToSchool(int id , String name)
	{
		System.out.println(id +"   "+name);
	}
	
	public static void main(String[] args) {
		
		Students1 s = new Students1();
		s.goToSchool(1, "Apsar");
		
		Students1 p = new Students1();
		p.goToSchool(2, "Anzar");
	
	
	}
	

}
