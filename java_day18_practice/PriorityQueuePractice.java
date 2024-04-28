package java_day18_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Comparator.reverseOrder();
		//System.out.println(pq.peek());
		//pq.remove(20);
		//Adding the elements into priority queue 
		//offer
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		pq.offer(10);
		pq.add(90);
		pq.offer(10);
		pq.add(90);
		pq.offer(10);
		pq.add(90);
		pq.offer(10);
		pq.add(90);
		pq.offer(10);
		pq.add(90);
		pq.offer(10);
		pq.add(90);
		pq.addAll(al);
		
		//Retrieval element of priority queue
//		System.out.println(pq.peek());  // we can only retrieve head element in priority queu
//		System.out.println(pq.poll());
		System.out.println(pq);
		
		//Removal element of priority queue
//		pq.add(85);
//		System.out.println(pq);
//		pq.remove(85);
//		pq.poll();
//		System.out.println(pq);
		
		
		//How to iterate elements using for each - It does not give in priority order
//		for(Integer ie : pq)
//		{
//			System.out.println(ie);
//		}
//		
		//Iterate using while loop - It gives in priority order
//		while(!pq.isEmpty())
//		{
//			System.out.println(pq.poll());
//		}
		
		//How to print in reverse order
//		Comparator.reverseOrder();
//	
//		
//		
//		//How to clear elements in priority queue
//		pq.clear();
//		
//		System.out.println(pq);
		pq.add(null);   // we cannot able to null values into priority queue 
		System.out.println(pq);
		
		

	}

}
