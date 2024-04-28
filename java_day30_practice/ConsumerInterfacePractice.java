package java_day30_practice;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerInterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> s1 = s -> System.out.println("My name is " + s);
		s1.accept("Tharun Nagiri");
		
		Consumer<String> s2 = s -> {
			System.out.println("The string name is" + s);
			System.out.println(s.length());
		};
		s1.accept("Tharun Nagiri");
		s2.accept("Virat Kohli");
		
		
		//Consumer Chaining
		Consumer<String> s3 = s -> {
			System.out.println(s + "He is a director");
			System.out.println("He is a writer");
		};
		Consumer<String> s4 = s -> {
			System.out.println(s + "He is a good human being");
			System.out.println("He is a philosopher");
		};
		
		Consumer<String> s5 = s -> {
			System.out.println(s + "He is a creator");
			System.out.println("He is honest");
		};
		
		s3.andThen(s4).andThen(s5).accept("Puri Jaganadh");
		Consumer<String> s6 = s3.andThen(s4).andThen(s5);
		s6.accept("Puri Jaganadh");
	}

}
