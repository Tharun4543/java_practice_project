package java_day_33_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamNonTerminalOpPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> scores = Arrays.asList(87, 45, 89, 34, 22, 12, 19); //270 + 38
		//get min value using stream 
		Optional<Integer> min_score = scores.stream().min(Comparator.naturalOrder());
		System.out.println(min_score.get());
		
		//get max value 
		Optional<Integer> max_score = scores.stream().max(Comparator.naturalOrder());
		System.out.println(max_score.get());
		
		//reduce - it will combine all the stream of the objects and return as a single stream 
		
		Optional<Integer> total_scores = scores.stream()
		.reduce((value1, value2) -> 
		value1 + value2);
		
		System.out.println(total_scores.get());
		
		//toArray -- convert stream object to array object
		
		Object[] scores_arr = scores.stream().toArray();
		for(Object value : scores_arr)
		{
			System.out.println(value);
		}
		
		

	}

}
