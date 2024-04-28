package java_day31_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> int_values = Arrays.asList(10, 5, 4, 2, 19);
		//general approach to multiply each value into 3
		for(int value : int_values)
		{
			System.out.println(value + "  " + value * 3);
		}
		//using streams 
		List<Integer> map_int_values =  int_values.stream()
		.map(n -> n * 3)
		.collect(Collectors.toList());
		System.out.println(map_int_values);
		
		

	}

}
