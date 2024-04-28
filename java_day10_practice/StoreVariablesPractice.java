package java_day10_practice;

public class StoreVariablesPractice {
	
	//store variables data after object creation  -- approach1
	int a, b;
	void display()
	{
		System.out.println(a+b);
	}
	
	//using method -- approach2
	void displayNum(int firstValue, int secondValue)
	{
		a = firstValue;
		b = secondValue;
	}
	
	//approach 3 using constructor
	
	StoreVariablesPractice(int firstValue, int secondValue)
	{
		a = firstValue;
		b = secondValue;
	}

}
