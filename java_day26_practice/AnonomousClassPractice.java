package java_day26_practice;

public class AnonomousClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DupArthemetic ac = new DupArthemetic();
		ac.add(10, 20);
		ac.diff(20, 10);
		
		//instead of creating one extra class for only to change one method we can define anonomus class
		ArthemeticClass ac1 = new ArthemeticClass() {
			
			public void diff(int a, int b)
			{
				System.out.println("The multiplication of two numbers is " + (a*b));
			}
		
		
		};
		//we cannot mention any access modifer for anoyomous classes
//		ArthemeticClass ac2 = new ArthemeticClass() public or private or protected or static {
//			
//			
//		};
		ac1.diff(10, 20);
		
				
		
	}

}

class ArthemeticClass
{
	public void add(int a, int b)
	{
		System.out.println("The addition of two numbers is " + (a+b));
	}
	
	public void diff(int a, int b)
	{
		System.out.println("The subtraction of two numbers is " + (a-b));
	}
}

class DupArthemetic extends ArthemeticClass
{
	public void diff(int a, int b)
	{
		System.out.println("The difference of two numbers is " + (a-b));
	}
}
