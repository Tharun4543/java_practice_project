package java_day25_practice;

public class InnerClassesPractice3 {
	private int id = 103;
	String name = "Tharun Nagiri";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we have to create inner class object like below mentioned way
		InnerClass ic = new InnerClassesPractice3().new InnerClass();
		ic.getOuterDetails();
		InnerClass2 ic2 = new InnerClassesPractice3().new InnerClass2();
		

	}
	
	class InnerClass
	{
		//how to access outer class variable in inner class 
		public void getOuterDetails()
		{
			System.out.println(id);
			System.out.println(name);
		}
	}
	class InnerClass2
	{
		//we can create object for inner classes inside another inner class
		InnerClass ic1 = new InnerClass();
	
		
		
	}

}
