package java_day11_practice;

public class ConstructorOverloading {
	
	/*
	 * method name should be same 
	 * number of parameters should be different 
	 * data type of parameters should be different 
	 * order of parameters should be different
	 */
	
	int a, b;
	
	ConstructorOverloading()
	{
		System.out.println(a+b);
	}
	ConstructorOverloading(int a, int b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading(float a, int b)
	{
		System.out.println(a+b);
	}
	ConstructorOverloading(int a, float b)
	{
		System.out.println(a+b);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading col = new ConstructorOverloading();
		ConstructorOverloading col1 = new ConstructorOverloading(10, 20);
		ConstructorOverloading col2 = new ConstructorOverloading(10.0f, 20);
		ConstructorOverloading col3 = new ConstructorOverloading(10, 20.0f);

	}

}
