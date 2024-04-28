package java_day11_practice;

public class OverLoadingPractice {
	int a = 20, b = 40;
	
	/*
	 * method name should be same 
	 * number of parameters should be different 
	 * data type of parameters should be different 
	 * order of parameters should be different
	 */
	
	void addition()
	{
		System.out.println(a+b);
	}
	void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	void addition(float a, int b)
	{
		System.out.println(a+b);
	}
	void addition(int b, float a)
	{
		System.out.println(b + a);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoadingPractice olp = new OverLoadingPractice();
		olp.addition();  //1 method
		OverLoadingPractice olp1 = new OverLoadingPractice();
		olp.addition(10, 20);  //2 method
		
		OverLoadingPractice olp2 = new OverLoadingPractice();
		olp.addition(10.0f, 20);  //3 method
		
		
		OverLoadingPractice olp3 = new OverLoadingPractice();
		olp.addition(10, 20.0f);  //4 method

	}

}
