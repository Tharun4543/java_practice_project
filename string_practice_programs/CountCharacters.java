package string_practice_programs;


class CountCharString
{
	public int countchar(String str_value)
	{
		int str_char_count = 0;
		for(int i = 0; i<str_value.length(); i++)
		{
			str_char_count = str_char_count + 1;
		}
		
		return str_char_count;
	}
}

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountCharString ccs = new CountCharString();
		int str_char_count_value = ccs.countchar("Mochitha");
		System.out.println("The total number of characters in given string is " + str_char_count_value);
		

	}
	


}
