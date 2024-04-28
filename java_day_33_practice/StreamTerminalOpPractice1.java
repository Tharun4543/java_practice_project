package java_day_33_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOpPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(10, 2, 2, 5, 6, 7, 8, 9, 10, 3, 1, 1, 6);
		//distinct  - Remove duplicate values, provide stream of unique values 
		
		List<Integer> unique_nums = nums.stream().distinct().collect(Collectors.toList());
		//System.out.println(unique_nums);
		
		//print unique values with out using third variable 
		
		//nums.stream().distinct().forEach(n -> System.out.println(n));
		//nums.stream().distinct().forEach(System.out::println);
		
		List<String> names = Arrays.asList("Tharun", "Renu", "Renu", "Aadhi", "Aadhi", "Sachin");
		//names.stream().distinct().forEach(System.out::println);
		
		//System.out.println(names.stream().distinct());  -- wrong syntax
		
		//count - it will return count value with type of long for stream of objects
		
		long nums_count = nums.stream().count();
		System.out.println(nums_count);
		
		//limit - it returns mentioned count of streams based on the limit value 
		List<Integer> lim_nums = nums.stream().limit(4).collect(Collectors.toList());
		//System.out.println(lim_nums);
		//another way to print 
		nums.stream().limit(3).forEach(n -> System.out.println(n));
		nums.stream().limit(2).forEach(System.out::println);
		
		

	}

}
