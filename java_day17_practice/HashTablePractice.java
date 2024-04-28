package java_day17_practice;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht = new Hashtable();
		//cannot store null values in hash table
		//ht.put(null, null);
		
		//it gives output with latest insertion to lowest insertion
		//does not allow the duplicate key, if you mention it will over ride with value
		//add an element
		ht.put(105, "Kohili");
		ht.put(101, "Mochitha");
		ht.put(102, "Katrina");
		ht.put(103, "Puri Jaganadh");
		ht.put(104, "Raviteja");
		ht.put(106, "Kohili");
		
		Hashtable ht2 = new Hashtable();
		ht2.put("Tharun", 22);
		ht2.put("Kamesh", 32);
		//add entire map collection
		ht.putAll(ht2);
		System.out.println(ht);
		
		//retrival keys in a map
		Set s = ht.keySet();
		System.out.println(s);
		//retrival vaues in a map
		
		Collection c = ht.values();
		System.out.println(c);
		
		//get based on a key
//		System.out.println(ht.get("Thar"));   //it does not throw an error if item is not available
//		
//		//remove
//		System.out.println(ht.remove(""));  //it does not throw an error if item is not available
//		System.out.println(ht.get(0));  //index does not support
		
		//System.out.println(ht.remove(102, "Katrina")); 
		
		//update 
		ht.put(103, "Puri Hero");
		ht.putIfAbsent("Puri", 907);  //it adds only if element is not present in map
		ht.replace(104,"Sunil");
		ht.replace(102, "Katrina", "katrina Kaif");
		
		
		//verification of key in a map
		System.out.println(ht.containsKey(109));
		
		//verification of value in a map
		System.out.println(ht.containsValue("Puri Her"));
		
		//Entry set
		
		Set<Entry> s1 = ht.entrySet();   //entry is an interface 
		for(Entry entry : s1)
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
//		
//		ht.clear();
		System.out.println(ht);
		
		
		
		
		

	}

}
