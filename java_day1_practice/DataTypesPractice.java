package java_day1_practice;

public class DataTypesPractice {

	public static void main(String[] args) {
		// To declare integer values
		byte byte_value = 127;
		short short_value = 32767;
		int int_value = 2147483647;
		long long_value = 3901022222222l;
		System.out.println(byte_value);
		System.out.println(short_value);
		System.out.println(int_value);
		System.out.println(long_value);
		
		//To declare float values
		float float_value = 13.80122292244444999922F;
		double double_value = 13.80122292244444999922222F;
		System.out.println(float_value);
		System.out.println(double_value);
		
		//To declare boolean values
		boolean true_value = true, false_value = false; //valid
		System.out.println(true_value + " " + false_value);
		
		//To declare char value
		char ch_value = 'A'; //valid
		//char ch_value = 'AB'; //invalid
		//char ch_value = "AB"; //invaid
		System.out.println(ch_value);
		
		//To declare string value
		String str_value = "Tharun Nagiri"; //valid
		String str_value_1 = "T"; //valid
		//String str_value_2 = 'data'; //valid
		//String str_value_3 = 's'; //valid
		System.out.println(str_value);
				
		

	}

}
