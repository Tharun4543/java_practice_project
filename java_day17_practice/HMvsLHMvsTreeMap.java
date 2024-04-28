package java_day17_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HMvsLHMvsTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap<String, String> hm = new HashMap<>();
//		
//		//it takes one null key and n no of null values
//		hm.put(null, null);
//		hm.put("Tharun", null);
//		hm.put("Mochitha", null);
//		
//		
//		HashMap<String, String> hm1 = new HashMap<>();
//		
//		//it does not follow insertion order and does not allow duplicate values as keys and values can be allowed
//		hm1.put("Tharun", "Waste fellow");
//		hm1.put("Mochitha", "Beautiful");
//		hm1.put("Amir khan", "Actor");
//		hm1.put("Katrina", "Actress");
//		hm1.put("Tharu", "Waste fellow");
//		hm1.put("Mochitha", "Goregeous");
//		hm1.put("Amir kha", "Actor");
//		hm1.put("Katri", "Actress");
//		System.out.println(hm1);
//		
//		
//		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
//		
//		//it takes one null key and n no of null values
//		lhm.put(null, null);
//		lhm.put("Tharun", null);
//		lhm.put("Mochitha", null);
//		
//		
//		LinkedHashMap<String, String> lhm1 = new LinkedHashMap<>();
//		
//		//it follows insertion order and does not allow duplicate values as keys and values can be allowed
//		lhm1.put("Tharun", "Waste fellow");
//		lhm1.put("Mochitha", "Beautiful");
//		lhm1.put("Amir khan", "Actor");
//		lhm1.put("Katrina", "Actress");
//		lhm1.put("Tharu", "Waste fellow");
//		lhm1.put("Mochitha", "Goregeous");
//		lhm1.put("Amir kha", "Actor");
//		lhm1.put("Katri", "Actress");
//		System.out.println(lhm1);
//		
		
		TreeMap<String, String> tm = new TreeMap<>();

		//It does not take null key and n no of null values
		//tm.put(null, null);
		tm.put("Tharun", null);
		tm.put("Mochitha", null);
		
		System.out.println(tm);

		TreeMap<String, String> tm1 = new TreeMap<>();

		// it does not follow insertion order and does not allow duplicate values as keys and
		// values can be allowed
		tm1.put("Tharun", "Waste fellow");
		tm1.put("Mochitha", "Beautiful");
		tm1.put("Amir khan", "Actor");
		tm1.put("Katrina", "Actress");
		tm1.put("Tharu", "Waste fellow");
		tm1.put("Mochitha", "Goregeous");
		tm1.put("Amir kha", "Actor");
		tm1.put("Katri", "Actress");
		System.out.println(tm1);
	}

}
