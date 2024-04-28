package java_day32_practice;

import java.util.Arrays;
import java.util.List;

public class FlatMapPractice2 {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Amal", "Sachi");
		List<String> teamB = Arrays.asList("Reenu", "Karthika");
		List<String> teamC = Arrays.asList("Aadhi", "Suban");
		
		List<List<String>> final_team = Arrays.asList(teamA, teamB, teamC);
		
		//general approach to print all the names 
		
		for(List<String> names : final_team)
		{
			for(String name : names)
			{
				System.out.println(name);
			}
		}
		//Using streams 
		System.out.println("********  ************");
		final_team.stream().flatMap(names -> names.stream())
		.filter(name_len -> name_len.length()>7).forEach(System.out::println);

	}

}
