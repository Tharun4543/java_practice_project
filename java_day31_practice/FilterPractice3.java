package java_day31_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> colors_list = Arrays.asList("Black", "Pink", null, "Blue", null, null, "Green");
		
		//general approach to print except null values 
		for(String color : colors_list)
		{
			if(color!=null)
			{
				System.out.println(color);
			}
		}
		//using streams 
		
		List<String> filter_clr_list = colors_list.stream()
				.filter(name -> name!= null)
				.collect(Collectors.toList());
		
		System.out.println(filter_clr_list);
		
		//another way to print without using third variable 
		
		colors_list.stream()
		.filter(name -> name!= null)
		.forEach(name -> System.out.println(name));
		
		
		//approach 2
		colors_list.stream()
		.filter(name -> name!= null)
		.forEach(System.out::println);
		

	}

}
