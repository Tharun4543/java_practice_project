package java_day27_practice;

public class MultiThreadingPractice5 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//problem with multi threading
		CountClass cc = new CountClass();
		Runnable r1 = () ->
		{
			for(int i = 0; i<2000;i+=50)
			{
				cc.increaseCountValue();
			}
		};
		
		Runnable r2 = () ->
		{
			for(int i = 0; i<3000;i+=50)
			{
				cc.increaseCountValue();
			}
			
		};
		
		Runnable r3 = () ->
		{
			for(int i = 0; i<1500;i+=50)
			{
				cc.increaseCountValue();
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
		t3.join();
		System.out.println(cc.count);
		

	}

}

class CountClass
{
	int count = 0;
	public synchronized void increaseCount()
	{
		count = count + 50;
	}
	
	public void increaseCountValue()
	{
		synchronized(this){
			count = count + 50;
		};
		System.out.println("Successfully completed the count operation");
		
	}
}
