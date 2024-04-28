package java_day29_practice;

import java.util.function.Predicate;

public class PredicatorPractice {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PredicatorPractice pp = new PredicatorPractice();
		Predicate<Integer> p1 = i -> i% 2 == 0;
		Predicate<Integer> p2 = i -> i > 50;
		System.out.println(p1.test(100));
		System.out.println(p1.test(60));
		
		String[] names = {"Sidhu", "Vijay", "Rahul", "Priyadhrashi", "Pavani"};
		Predicate<String> p3 = str -> str.length()>5;
		Predicate<String> p4 = str -> str.startsWith("P");
		
		for(String name : names)
		{
			if(p3.and(p4).test(name))
			{
				System.out.println(name);
			}
		}
		
		for(String name : names)
		{
			if(p3.or(p4).test(name))
			{
				System.out.println(name);
			}
		}
		System.out.println("*** **** ");
		for(String name : names)
		{
			if(p3.negate().test(name))
			{
				System.out.println(name);
			}
		}
		
		

	}

}
