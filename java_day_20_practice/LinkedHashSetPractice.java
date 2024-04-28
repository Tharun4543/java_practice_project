package java_day_20_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ojr[] = new Object[] {"Tharun", "Umasankar", 20};
		LinkedHashSet lhs = new LinkedHashSet(Arrays.asList(ojr));
		ArrayList alh = new ArrayList();
		//to add single element 
		alh.add(200);
		alh.add(112);
		alh.add(90);
		lhs.add(10);
		lhs.add(100);
		lhs.add(322);
		lhs.add(91);
		lhs.add(91);
		//to add multiple elements 
		lhs.addAll(alh);
		
		//to remove single element
		System.out.println(lhs.remove(91));
		
		//to remove multiple elements 
		System.out.println(lhs.removeAll(alh));
		
		//to check element is present or not
		System.out.println(lhs.contains(10));
		System.out.println(lhs.containsAll(alh));
		Object oj[] = lhs.toArray();
		System.out.println(Arrays.toString(oj));
		lhs.clear();
		System.out.println(lhs);
		

	}

}
