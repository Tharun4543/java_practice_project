package java_day_20_practice;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList <Integer>als = new ArrayList<Integer>();
		//add single element in a hash set
		als.add(100);
		als.add(300);
		als.add(10);
		hs.add(10);
		hs.add(30);
		hs.add(90);
		hs.add(10);
		//add multiple elements into hash set
		hs.addAll(als);
		String data = hs.toString();
		System.out.println(data);
		//remove the element in hash set
		System.out.println(hs.remove("Tharun"));
		//remove multiple elements in hash set
		System.out.println(hs.removeAll(als));
		
		//To check element is present or not 
		System.out.println(hs.contains(90));
		
		//To clear all the elements
		hs.clear();
		System.out.println(hs);
		

	}

}
