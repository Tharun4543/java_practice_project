package java_day2_practice;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic operators perform only on numbers i.e integer and float
		int first_value = 15, second_value = 2, third_value = 10, fourth_value = 20;
		System.out.println(first_value + second_value);
		System.out.println(first_value - second_value);
		System.out.println(first_value * second_value);
		System.out.println(first_value / second_value);   //it will give quoitent as a integer value
		System.out.println(first_value % second_value);   //it will give remainder
		
		//Relational operators perform only on numbers i.e integer and float (return boolean values)
		System.out.println(first_value > second_value);
		System.out.println(first_value < second_value);
		System.out.println(first_value >= second_value);
		System.out.println(first_value <= second_value);   //it will give quoitent as a integer value
		System.out.println(first_value != second_value);
		System.out.println(first_value == second_value); 
		
		//Logical operators (&&, ||, !)  //perform based on two boolean values
		System.out.println(first_value<second_value && third_value>fourth_value);
		System.out.println(first_value<second_value || third_value>fourth_value);
		System.out.println( ! true);
		
		
	}

}
