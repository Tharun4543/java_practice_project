package java_day_20_practice;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetPractice extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tr = new TreeSet<String>();
		//to add single element in a tree set
		tr.add("Tharun Kumar");
		tr.add("Tharun");
		tr.add("Ganesh");
		
		//to add multiple elements in a tree set 
		HashSet hsp = new HashSet();
		hsp.add("Mochitha");
		hsp.add("Deepika");
		tr.addAll(hsp);
		
		//to remove single element
		System.out.println(tr.remove("Dell"));
		
		//to remove multiple elements
		//System.out.println(tr.removeAll(hsp));
		
		//to know element is present or not 
		System.out.println(tr.contains("Ganesh"));
		
		//to know group of elements is present or not 
		System.out.println(tr.containsAll(hsp));
		
		//Extra methods provided for tree set
		//to fetch lowest value
		System.out.println(tr.first());
		
		TreeSet<Integer> hsp1 = new TreeSet<Integer>();
		hsp1.add(100);
		hsp1.add(500);
		hsp1.add(30);
		hsp1.add(50);
		//TO get lowest element 
		System.out.println(hsp1.first());
		//To get Highest element
		System.out.println(hsp1.last());
		//To remove lowest value
		System.out.println(hsp1.pollFirst());
		System.out.println(hsp1.pollLast());
		System.out.println(tr);
		System.out.println(hsp1);
		System.out.println(hsp1.descendingSet());

	}

}
