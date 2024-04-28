package java_day32_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst1 = Arrays.asList(1, 2);
		List<Integer> lst2 = Arrays.asList(3, 4);
		List<Integer> lst3 = Arrays.asList(5, 6);
		
		
		List<List<Integer>> nestead_list = Arrays.asList(lst1, lst2, lst3);
		System.out.println(nestead_list);
		List<Integer> final_list = nestead_list.stream()
		.flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(final_list);
		
		nestead_list.stream().flatMap(list -> list.stream().filter(n->n%2==0)).forEach(System.out::println);
		
		
	}

}
