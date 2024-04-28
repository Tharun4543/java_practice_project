package java_day11_practice;

public class StaticKeywordPractice {
	
	static int a = 10;
	int b = 40;
	
	static void m1()
	{

		System.out.println(a);
		
	}
	
	void m2()
	{
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticKeywordPractice skp = new StaticKeywordPractice();
		skp.m1();
		System.out.println(a);
		

	}

}
