package java_day24_practice;

public class MemoryManagementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10;
		//StackOverflowError if stack memory is full 
		
		//new MemoryManagementPractice().add(1);
		
		//OutofMemoryError - Heap space 
		for(int i = 0; i<Integer.MAX_VALUE; i++)
		{
			int[] arr = new int[size];
			size *= 2;
			System.out.println(size);
		}

	}
//	public void add(int i)
//	{
//		System.out.println(i);
//		i++;
//		add(i);
//	}
	
	

}
