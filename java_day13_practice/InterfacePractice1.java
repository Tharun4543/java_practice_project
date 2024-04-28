package java_day13_practice;

interface Person
{
	String color = "Blank";   //variables always final and static variables
	
	int age();   //public abstract method
	String family = "Yes";  
	
	//below method is default method
	default void display()
	{
		System.out.println("This is default method in interface");
	}
	

	 static void show()
	{
		System.out.println("This is static method in interface");
	}
	
}

public class InterfacePractice1 implements Person{
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Person pe = new InterfacePractice1();
		System.out.println(pe.age());;
		pe.display();
		Person.show();
		

	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 15;
	}

}
