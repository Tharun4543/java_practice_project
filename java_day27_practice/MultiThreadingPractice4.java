package java_day27_practice;

public class MultiThreadingPractice4 {
	int count = 0;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//problem with multi threading
		MultiThreadingPractice4 mtp = new MultiThreadingPractice4();
		Runnable r1 = () ->
		{
			for(int i = 0; i<=2000;i+=50)
			{
				mtp.count = mtp.count + 50;
			}
		};
		
		Runnable r2 = () ->
		{
			for(int i = 0; i<=3000;i+=50)
			{
				mtp.count = mtp.count + 50;
			}
			
		};
		
		Runnable r3 = () ->
		{
			for(int i = 0; i<=1500;i+=50)
			{
				mtp.count = mtp.count + 50;
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		System.out.println(mtp.count);
		

	}

}
