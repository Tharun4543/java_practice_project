package java_day24_practice;

public class GarbageCollectorPractice {
	
	public void finalize()
	{
		System.out.println("This is clean up object variables");
	}
	public void display()
	{
		System.out.println("Tharun is a waste fellow, he does not have focus on doing thing ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to perform manually
		GarbageCollectorPractice gcp = new GarbageCollectorPractice();
		gcp = null;
		
		new GarbageCollectorPractice().display();
		
		System.gc();
		Runtime.getRuntime().gc();
		

	}

}
