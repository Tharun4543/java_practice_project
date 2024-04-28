package string_practice_programs;

import java.util.Scanner;

public class ReverseString {
	
	Scanner sc = new Scanner(System.in);
	public String reverseString1(String str_value)
	{
	
		String rev_string = "";
		for(int i = 0; i<str_value.length(); i ++)
		{
			rev_string = str_value.charAt(i) + rev_string ;
		}
		return rev_string;
	}
	
	public String reverseString2(String str_value)
	{
		char[] str_char_values = str_value.toCharArray();
		String rev_string = "";
		for(int i = str_char_values.length-1; i>=0; i--)
		{
			rev_string = rev_string + str_char_values[i];
		}
		return rev_string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString rs = new ReverseString();
		String rev_str_data = rs.reverseString1("Mochitha");
		System.out.println("The reversed string is " + rev_str_data);
		
		String rev_str2_data = rs.reverseString2("Sowmya");
		System.out.println("The reversed string is " + rev_str2_data);
		

	}

}
