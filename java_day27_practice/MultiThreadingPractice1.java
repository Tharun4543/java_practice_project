package java_day27_practice;

public class MultiThreadingPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread t1 = new Thread();
		//Check how many threads are active
		System.out.println(Thread.activeCount());
		//check name of the active current thread 
		System.out.println(Thread.currentThread().getName());
		//check name of the active current thread id 
		System.out.println(Thread.currentThread().getId());
		//Check priority of the thread 
		System.out.println(Thread.currentThread().getPriority());
		
		
		//How to create a thread 
//		Thread t1 = new Thread();
//		//How to start a thread 
//		t1.start();
//		System.out.println(Thread.activeCount());
		Arthemetic ath = new Arthemetic();
		ath.start();
		Arthemetic1 ath1 = new Arthemetic1("My Thread");
		ath1.start();
		
		
		
	}

}

//with out defined our own thread name 
class Arthemetic extends Thread
{
	
	@Override
	public void run()
	{
		int a = 10, b = 20;
		System.out.println(Thread.currentThread().getName());
		System.out.println("The addition of two numbers is " + (a+b));
	}
	
}

//with out defined our own thread name 
class Arthemetic1 extends Thread
{
	Arthemetic1(String getThreadName)
	{
		super(getThreadName);
	}
	
	@Override
	public void run()
	{
		int a = 10, b = 20;
		System.out.println(Thread.currentThread().getName());
		System.out.println("The subtraction of two numbers is " + (a-b));
	}
	
}


