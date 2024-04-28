package java_day_33_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProcessMethodsPractice3 {

	public static void main(String[] args) {
		
		//Stream Concatenation 
		List<String> names = Arrays.asList("Tharun", "Reenu", "Aadhi", "Sachin");
		List<Integer> scores = Arrays.asList(10, 20, 30);
		List<Integer> scores1 = Arrays.asList(10, 20, 30);
		Stream<String> stream1 = names.stream();
		Stream<Integer> stream2 = scores.stream();
		Stream<Integer> stream3 = scores1.stream();
		//Stream.concat(stream1, stream2).forEach(n -> System.out.println(n));
		//Stream.concat(stream1, stream2).forEach(System.out::println);
		List<Object> str_con_list = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(str_con_list);
		

	}

}
