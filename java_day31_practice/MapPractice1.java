package java_day31_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Tharun", "Subhan", "Reenu", "Aadhi", "Sachin");
		
		//to convert names lower case to upper case using general approach 
//		for(String name : names)
//		{
//			System.out.println(name.toUpperCase());
//		}
//		//using streams - approach 2
//		List<String> map_names = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
//		System.out.println(map_names);
//		
//		//print values with out using third variable 
//		names.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
//		//approach 2
//		names.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
//		

		//Example 2
		//to get the size of the name for name list using general approach 
		for(String name : names)
		{
			System.out.println(name + "        " +   name.length());
		}
		
		//Using streams 
		List<Integer> name_size_list = names.stream()
		.map(n -> n.length())
		.collect(Collectors.toList());
		
		System.out.println(name_size_list);
	}

}
