package java_day12_practice;


class AdditionOfNumbers
{
	AdditionOfNumbers(int a)
	{
		System.out.println("This is parent constructor");
	}
	

	int c = 30;
	public int result(int a, int b)
	{
		return a + b;
	}
}

class SubtractionOfNumbers extends AdditionOfNumbers
{
	
	SubtractionOfNumbers()
	{
		super(10);
		System.out.println("This is child constructor");
	}
	
	public int result(int a, int b)
	{
		
		
		System.out.println(super.result(20, 40));
		System.out.println(super.c);
		return a-b;
		
	}
}

public class MethodOverRidingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubtractionOfNumbers son = new SubtractionOfNumbers();
		System.out.println(son.result(100, 200));;

	}

}
