package java_day25_practice;

public class MainInnerClassPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	//we can extends non abstract class for inner class
	class MainInnerClass extends InnerClassesPractice5
	{
		MainInnerClass ic5 = new MainInnerClass();
	
		
	}
	//we can extend abstract class in inner class but we need to provide
	//implemention for un implemented methods
	class MainInnerClass2 extends Operations
	{

		@Override
		public void subtraction() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	//can we implement interface in inner class 
	class MainInnerClass3 implements Condition
	{

		@Override
		public void eligibleForVote() {
			int age = 18;
			if(age>=18)
			{
				System.out.println("Person is eligible for vote");
			}
			
		}
		
	}
	//we can extend another inner class
	class MainInnerClass4 extends MainInnerClass3
	{
		public void show()
		{
			System.out.println("Extending another inner class4");
		}
	}
	

}
