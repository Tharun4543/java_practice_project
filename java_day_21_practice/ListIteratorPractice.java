package java_day_21_practice;

import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListIteratorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List Iterator is used to only iterate list interface classes like 
		//It does have all the permisions 
		
		Vector<Integer> sc = new Vector<Integer>();
		sc.add(101);
		sc.add(202);
		sc.add(303);
		
		ListIterator<Integer> li = sc.listIterator(sc.size());
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
