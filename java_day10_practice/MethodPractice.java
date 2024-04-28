package java_day10_practice;

public class MethodPractice {
	int a = 200;
	int b = 400;

	//plain method
	//a method with out return type and with out parameters
	void displayGreetings()
	{
		System.out.println("Hey tharun, Be emotional less guy");
	}
	
	//a method with parameters and without return type
	void sumMethod(int a, int b)
	{
		System.out.println("The addition of two numbers is :" + a+b);
	}
	
	//a method with return type and without parameters
		int sumMethod()
		{
			return a + b;
		}
	
	//a method with return type and with parameters
		
		int subMethod(int a , int b)
		{
			return a-b;
		}

}

