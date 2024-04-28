package java_day16_practice;

import java.util.Arrays;
import java.util.Vector;

public class VectorClassPractice {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
//		//approach 1 to create a vector without mentioning the size
//		Vector vc = new Vector();
//		vc.add(10);
//		
//		//approach 2 to create a vector without mentioning the size
//		Vector vc2 = new Vector(20);
//		vc.add(100);
//		
//		System.out.println(vc);
//		
//		//Adding the single object at end of the vector
//		vc2.add(20);
//		
//		//Adding the single object at specified index of the vector
//		vc2.add(1,20);   //index, value 
//		System.out.println(vc2);
		
		//Adding Another collection elements into existing list
		//approach 1
//		for(int i = 0; i<vc2.size(); i++)
//		{
//			vc.add(vc2.get(i));
//		}
//		System.out.println(vc);
		//approach 2
		
//		/*vc.addAll(vc2);
//		System.out.println(vc);
//		
//		
//		// add vector list values at specified position
//		vc.addAll(0, vc2);
//		System.out.println(vc);
//		
//		//Retrival list
//		
//		System.out.println(vc.get(1));
//		
//		
//		//remove method with index
//		vc.remove(0);
//		System.out.println(vc);
//		//remove with value
//		//vc.remove(100);    // we wont get any error if mentioned string is not present in vector
//		//System.out.println(vc);
//		
//		//remove all 
//		vc.removeAll(vc2);
//		System.out.println(vc);
//		
//		vc.clear();
//		System.out.println(vc);
//		
//		//contains and containsAll 
//		
//		vc.add("Tharun");
//		vc.add("Mochitha");
//		
//		System.out.println(vc.contains("Tharun"));
//		System.out.println(vc.containsAll(vc2));   // order is not important 
//		
//		//updation of elements
//		vc.set(0, "Deepika");
//		System.out.println(vc);*/
		
		
//		Vector names = new Vector();
//		names.add("Tharun");
//		names.add("Deepika");
//		System.out.println(names);
//		names.set(0, "Mochitha");
//		System.out.println(names);
//		System.out.println(names.indexOf("Mochitha"));
//		System.out.println(names.lastIndexOf(4));
//		System.out.println(names.firstElement());
//		System.out.println(names.lastElement());
//		Object arr[] = names.toArray();
//		System.out.println(Arrays.toString(arr));
		
		//How to convert object to vector
//		Object arr[] = new Object[] {"Tharun", "Mochitha", "Lalitha"};
//		Vector names_gf = new Vector(Arrays.asList(arr));
//		System.out.println(names_gf);
		
		//Generics - 1.5 version
		Vector <String>colors = new Vector<String>();
		//Vector colors<String> = new Vector<>(); //invalid
		//Vector colors<str> = new Vector<>(); //invalid
		
		colors.add("Black");
		colors.add("Blue");
		colors.add(null);
		System.out.println(colors);
		
		
		
	}

}
