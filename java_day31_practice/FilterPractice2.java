package java_day31_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> emp_names = Arrays.asList("Tharun", "Sai Kumar", "Raj kumar", "Roopesh");
		//filter the employee name whose name's length more than 5 and less than 9 characters 
		//normal approach 
		for(String name : emp_names)
		{
			if(name.length()>5 && name.length()<9)
			{
				System.out.println(name);
			}
		}
		
		//using stream - approach 
		
		List<String> filter_emp_names = emp_names.stream()
				.filter(name -> name.length()>5 && name.length()<9)
				.collect(Collectors.toList());
		
		System.out.println(filter_emp_names);
		
		//print without using third variable 
		
		emp_names.stream().filter(name -> name.length()>5 && name.length()<9).forEach(name -> System.out.println(name));
		emp_names.stream().filter(name -> name.length()>5 && name.length()<9).forEach(System.out::println);

	}

}
