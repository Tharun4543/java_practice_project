package java_day25_practice;

public class StaticInnerClassesPractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticInnerClassesPractice6.StaticInnerClass1.CollegeName());
		new StaticInnerClassesPractice6().new InnerClassPractice7().addition();
		

	}
	
	class StaticInnerClass1
	{
		public static String CollegeName()
		{
			return "JNTHUH College Hyderabad";
			
		}
	}
	class InnerClassPractice6
	{
		public int additionOfNumbers(int a, int b)
		{
			return a + b;
		}
	}
	class InnerClassPractice7
	{
		InnerClassPractice6 icp = new InnerClassPractice6();

		public void addition()
		{
			System.out.println(icp.additionOfNumbers(100, 200));
		}
	}

}
