package java_day14_practice;

class StaticPractice
{
	
	public void show()
	{
		System.out.println("This is show method");
	}
	public void display()
	{
		System.out.println("This is display method");
	}
	static
	{
		System.out.println("This is static method");
	}
	
	{
		System.out.println("This is non static method");
	}
	
	
}

public class StaticAndNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticPractice sp = new StaticPractice();
		sp.display();
		sp.show();
		
		StaticPractice sp1 = new StaticPractice();
		sp1.display();
		sp1.show();
		
	

	}
	
	 
	
	
	

}
