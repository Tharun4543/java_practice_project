package java_day26_practice;

public class LocalInnerClasses {

	LocalInnerClasses()
	
	{
		System.out.println("This is constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateArthemetic da = new DuplicateArthemetic();
		
		class LocalClass   // local class, it is applicable for only this main method 
		{
			public void display()
			{
				System.out.println("This is local class, can be accessiable with in method ");
			}
		}
		LocalClass lc = new LocalClass();
		lc.display();
		
		//we cannot define access modifers to local inner classes
//		public LocalClass1
//		{
//			
//		}
//		private LocalClass2
//		{
//			
//		}
//		protected LocalClass3
//		{
//			
//		}
		
		
		//we can define only abstract and final methods for a local class
		abstract class LocalClass4
		{
			public void display()
			{
				System.out.println("This is display method ");
			}
		}
		final class LocalClass5
		{
			public void show()
			{
				System.out.println("This is show method ");
			}
		}
		
		

	}

}

class Arthemetic
{
	public void sum(int a, int b)
	{
		System.out.println("The addition of two numbers is " + (a+b));
	}
	
	public void sub(int a , int b)
	{
		System.out.println("The subtraction of two numbers is " + (a-b));
	}
}

//Now i want to change the implemention of sub and want to access sum in new class

class DuplicateArthemetic extends Arthemetic
{
	
	public void sub(int a , int b)
	{
		System.out.println("The difference of two numbers is " + (a-b));
	}
	
}

