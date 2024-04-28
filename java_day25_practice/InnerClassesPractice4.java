package java_day25_practice;

public class InnerClassesPractice4 {
	private String per_name = "Tharun Nagiri";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassesPractice4().new InnerClassAccessDetails().displayName();
	}
	
	class InnerClassAccessDetails
	{
		//How to access the outer class variables when they are duplicated in inner class 
		private String per_name = "Puri Jaganadh";
		public void displayName()
		{
			String per_name = "Subbaraju";
			System.out.println("The name of the person within the inner class method is" + per_name);
			System.out.println("The name of the person within the inner class is" + this.per_name);
			System.out.println("The name of the person within the inner class is" + InnerClassesPractice4.this.per_name);
		}
	}

}
