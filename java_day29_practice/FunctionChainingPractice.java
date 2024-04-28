package java_day29_practice;

import java.util.function.Function;

public class FunctionChainingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> f1 = n -> n * n;
		Function<Integer, Integer> f2 = n -> n * n * n;
		
		System.out.println(f1.andThen(f2).apply(2));  //it will execute first f1 and then f2 
		System.out.println(f1.compose(f2).apply(2));  //it will execute first f2 then f1 

	}

}
