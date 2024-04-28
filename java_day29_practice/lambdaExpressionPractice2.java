package java_day29_practice;

public class lambdaExpressionPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cases through inheritance
		@FunctionalInterface
		interface inter2
		{
			public void display();
		}
		//this is valid 
		@FunctionalInterface
		interface inter3 extends inter2
		{
			
		}
		//invalid case
//		@FunctionalInterface
//		interface inter3 extends inter2
//		{
//			public void m2();
//		}
		 
		//case 2
		@FunctionalInterface
		interface inter4
		{
			public void show();
		}
		@FunctionalInterface
		interface inter5 extends inter4
		{
			public void show();
			
		}
		
		@FunctionalInterface
		interface inter6
		{
			public void show();
		}
	
		@FunctionalInterface
		interface inter7 extends inter6
		{
			public void show();
			//public void view();
		}
					
	}

}
