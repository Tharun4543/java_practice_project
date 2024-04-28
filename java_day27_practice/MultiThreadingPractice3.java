package java_day27_practice;

public class MultiThreadingPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using anonymous class with runnable interface
		Runnable r1 = new Runnable()
				{
					
					@Override
					public void run() {
						
						System.out.println("The total marks of student is " + (92 + 34 + 56 + 34));
						System.out.println(Thread.currentThread().getName());
					}
			
				};
			
			Thread t1 = new Thread(r1);
			t1.start();
			
			//using lambda expressions 
			
			Runnable r2 = () ->
			{
				if(100 == 100)
				{
					System.out.println("Both values are equal");
					System.out.println(Thread.currentThread().getName());
				}
			};
			
			Thread t2 = new Thread(r2);
			t2.start();

	}

}
