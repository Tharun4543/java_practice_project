package java_day_33_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProcessMethodsPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> marks = Arrays.asList(10, 34, 22, 9, 8, 7, 6);
		//sort the stream objects in ascending order 
		List<Integer> sort_marks = marks.stream().sorted().collect(Collectors.toList());
		//System.out.println(sort_marks);
		
		//another way to print without using third variable 
		//marks.stream().sorted().forEach(n -> System.out.println(n));
		//marks.stream().sorted().forEach(System.out::println);
		
		//sort strings in ascending order 
		List<String> emp_names = Arrays.asList("Tharun", "Reenu", "Sachin", "Aadhi", "Amal");
		List<String> sorted_e_names = emp_names.stream().sorted().collect(Collectors.toList());
		//System.out.println(sorted_e_names);
		
		//another way to print without using third variable 
		
		//emp_names.stream().sorted().forEach(n -> System.out.println(n));
		//emp_names.stream().sorted().forEach(System.out::println);
		
		//sort the stream objects in reverse order
		List<Integer> desc_marks = marks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc_marks);
		
		//another way to print without using third variable 
		//marks.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));
		//marks.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//sort strings in desceding order
		List<String> rev_e_names = emp_names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//System.out.println(rev_e_names);
		//another way to print without using third variable 
		//emp_names.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));
		emp_names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}
