package java_day2_practice;

public class operators_practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//increment and decrement operators
		//post increment
		int value = 10;
		value++;
		System.out.println(value);   //11
		int result = value++;
		System.out.println(result); //11
		//-- increment
		int value_1 = 10;
		value_1--;
		System.out.println(value_1);   //9
		int result_1 = value_1--;
		System.out.println(result_1); //9
		
		//pre increment
		int value_3 = 10;
		++value_3;
		System.out.println(value_3);   //11
		int result_3 = ++value_3;
		System.out.println(result_3); //12
		//-- increment
		int value_4 = 10;
		--value_4;
		System.out.println(value_4);   //9
		int result_4 = --value_4;
		System.out.println(result_4); //9
		
		//Assignment operators (=, +=,-=,*=,/=,%=)
		System.out.println(value+=5);
		System.out.println(value-=5);
		System.out.println(value*=5);
		System.out.println(value/=5);
		System.out.println(value%=5);
		
		//ternary operator
		int age_value = 18;
		String result_value = (age_value>18 && result == 14)? "Eligible": "Not elgible";
		System.out.println(result_value);
	}

}
