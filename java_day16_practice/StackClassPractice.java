package java_day16_practice;

import java.util.Stack;

public class StackClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Stack is a class in java which implements the list interface and extends the vector
		 * class and also represents the LIFO principle
		 * 
		 */
		/*
		 * push - add the element
		 * pop - remove the element
		 * peek - return the last element
		 * search - it searches element at end with index of 1
		 */
		
		Stack<String> philosphers = new Stack<String>();
		philosphers.push("Puri Jaganadh");
		philosphers.push("Subba Raju");
		philosphers.push("Raviteja");
		System.out.println(philosphers);
		System.out.println(philosphers.peek());
		System.out.println(philosphers.search("Puri Jaganadh"));  //1
		System.out.println(philosphers.pop());

	}

}
