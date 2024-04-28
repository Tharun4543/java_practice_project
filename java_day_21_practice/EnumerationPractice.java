package java_day_21_practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Enumeration is an interface, which is used to iterate the elements
		/*
		 * It is applicable for only legacy classes from v1.0
		 * HashTable
		 * Vector
		 * Stack
		 * Properties
		 * Dictionary
		 */
		Vector<String> v1 = new Vector<String>();
		v1.add("Tharun");
		v1.add("Mochitha");
		v1.add("Deepika");
		
		//elements is a method which returns enumeration object
		Enumeration<String> vec_ele = v1.elements();
		
		//How to iterate enumeration object
		while(vec_ele.hasMoreElements())
		{
			System.out.println(vec_ele.nextElement());
		}
		//For hash table
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Tharun");
		ht.put(102, "Mochitha");
		ht.put(103, "Deepika");
		
		//System.out.println(ht);
		
		Enumeration<String> ht_values = ht.elements();
		while(ht_values.hasMoreElements())
		{
			System.out.println(ht_values.nextElement());
		}
		
		//Not possible for new version classes 
		ArrayList al = new ArrayList();
		al.add(10);
		
		
		

	}

}
