package java_day_33_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamProcessMethodsPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> emp_names = Arrays.asList("Reenu", "Thar", "Aadhi", "Sachin");
		//any match - it will return true if any one object matches the condition 
		Boolean name_status = emp_names.stream().anyMatch(value -> {
			Boolean result = value.startsWith("Ree");
			return result;
		});
		System.out.println(name_status);
		//all match - it will return true if all the objects match the condition 
		Boolean name_all_status = emp_names.stream().allMatch(value -> value.length()>4);
		System.out.println(name_all_status);
		
		//none match - it will return true if none of the objects not match the condition 
		
		Boolean name_none_match = emp_names.stream().noneMatch(value -> value.length()<6);
		System.out.println(name_none_match);
		
		//find any - it will return any of the object from the stream values 
		Optional<String> ran_name = emp_names.stream().findAny();
		System.out.println(ran_name.get());
		
		//findFirst - it will return first value of the stream object
		Optional<String> first_name = emp_names.stream().findFirst();
		System.out.println(first_name.get());
		
		
	}

}
