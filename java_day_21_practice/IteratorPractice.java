package java_day_21_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iterator is a interface which is used to iterate the collection type of objects
		//It is applicable for all the collection types legacy classes and new classes 
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(240);
		al.add(431);
		al.add(500);
		al.add(111);
		
		Iterator al_ele = al.iterator();
		while(al_ele.hasNext())
		{
			System.out.println(al_ele.next());
		}
		
		//We can able to remove the elements
		
		while(al_ele.hasNext())
		{
			al_ele.remove();
			System.out.println(al_ele.next());
			
		}
		System.out.println(al);
		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(101, "Tharun");
		hp.put(202, "Deepika");
		hp.put(103, "Ganesh");
		
		Iterator il = hp.keySet().iterator();
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
	}
	
	
	

}
