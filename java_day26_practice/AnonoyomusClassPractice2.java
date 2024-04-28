package java_day26_practice;

public class AnonoyomusClassPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArthemeticAbstract a1 = new ArthemeticAbstract() {

			@Override
			public void diff(int a, int b) {
				System.out.println("The subtraction of two numbers is " +  (a-b));
				
			}
			
		};
		
		Relational rl = new Relational() {

			@Override
			public void checkValueLesser(int a, int b) {
				System.out.println(a<b);
				
			}
			
		};
		
		a1.diff(10, 20);
		rl.checkValueGreater(10, 20);
		rl.checkValueLesser(10, 40);
		
		
	

	}

}

abstract class ArthemeticAbstract
{
	public void add(int a, int b)
	{
		System.out.println("The addition of two numbers is " + (a+b));
	}
	abstract public void diff(int a, int b);
	
}

interface Relational
{
	public default void checkValueGreater(int a, int b)
	{
		System.out.println(a>b);
	}
	
	public void checkValueLesser(int a, int b);
}
