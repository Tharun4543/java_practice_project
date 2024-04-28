package string_practice_programs;


class CountWords
{
	public int lengthWords(String str_value)
	{
		int str_words_count = 1;
		for(int i = 0; i< str_value.length(); i++)
		{
			if(str_value.charAt(i) == ' ')
			{
				str_words_count = str_words_count + 1;
			}
		}
		return str_words_count;
	}
	
	public int lengthOfWords(String string_value)
	{
		String arr_str_values[] = string_value.split(" ");
		return arr_str_values.length;
	}
}

public class CountWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountWords cw = new CountWords();
		int str_words_len = cw.lengthWords("Dani danials is a pretteist girl in the world");
		System.out.println("Number of words present in string is " + str_words_len);
		int str_words_len_arr = cw.lengthOfWords("Puri jaganadh is my inspiration");
		System.out.println("Number of words present in string is " + str_words_len_arr);
	}

}
