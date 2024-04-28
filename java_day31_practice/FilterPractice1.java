package java_day31_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//General Method
		ArrayList<Integer> num_values = new ArrayList<Integer>();
		num_values.add(10);
		num_values.add(23);
		num_values.add(42);
		num_values.add(13);
		num_values.add(11);
		
		//Modern Method
		List<Integer> num_values1 = Arrays.asList(10, 20, 30, 23, 45);
		System.out.println(num_values1);
		
		//System.out.println(num_values);
		
		//fetch only even numbers from the list using general approach
//		for(Integer value : num_values1)
//		{
//			if(value % 2 == 0)
//			{
//				System.out.println(value);
//			}
//		}
		
		//using stream - filter approach 
		
		List<Integer> even_list = num_values1.stream().filter(n->n % 2 == 0).collect(Collectors.toList());
		System.out.println(even_list);
		
		//another way to display output without using third variable - approach 1
		num_values1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		//another way to display output without using third variable - approach 1
		num_values1.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		

	}

}
