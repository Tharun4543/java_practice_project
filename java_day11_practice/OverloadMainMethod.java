package java_day11_practice;

public class OverloadMainMethod {
	
	public static void main()
	{
		System.out.println("This is main method with out parameters");
	}
	
	public static void main(int a, int b)
	{
		System.out.println("This is main method with parameters");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadMainMethod olmm = new OverloadMainMethod();
		olmm.main();
		olmm.main(10, 20);

	}

}
