package java_day29_practice;

public class LambdaExpressionPractice1 {
	
	//example 1
	interface inter1{
		public void sayHello();
	}
	
	//example 2
	//to print a +b 
	interface inter2
	{
		public void addition(int a, int b);
	
	}
	//example 3
	//to print your name
	interface inter3
	{
		public void displayName(String name);
	}
	
	interface inter4
	{
		public void lengthStr(String name_per);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter1 in = () ->
		{
			System.out.println("Hey Tharun, You are waste fellow. You do not how to control emotions");
			System.out.println("Welcome to java tutorials");
		};
		in.sayHello();
		
		inter2 in2 = (int a, int b) ->
		{
			System.out.println("The addition of two numbers is " + (a+b));
		};
		in2.addition(200, 300);
		
		
	  inter3 i3 = name ->
	  {
		  System.out.println("The name of the person is " + name);
	  };
	  
	  i3.displayName("Tharun Nagiri");
	  
	  inter4 i4 = (name) -> 
	  {
		System.out.println(name.length());
	  
	  };
	  i4.lengthStr("Tharun Nagiri");
		

	}

}
