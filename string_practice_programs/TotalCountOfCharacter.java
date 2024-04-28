package string_practice_programs;

import java.util.Scanner;

class CountOfCharacter
{
	Scanner sc = new Scanner(System.in);
	public int totalCharInString(String str_value)
	{
		System.out.println("Enter the character that you want to know count of it");
		char input_string = sc.next().charAt(0);
		int char_count_string = 0;
		for(int i = 0; i<str_value.length(); i++)
		{
			if(input_string == str_value.charAt(i))
			{
				char_count_string = char_count_string + 1;
			}
		}
		return char_count_string;
	}
}

public class TotalCountOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountOfCharacter coc = new CountOfCharacter();
		int char_count_string_value = coc.totalCharInString("Malayalam");
		System.out.println("The number of characters in given string is " + char_count_string_value);

	}

}
