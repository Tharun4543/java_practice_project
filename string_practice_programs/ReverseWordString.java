package string_practice_programs;


class ReverseWord
{
	public void reverseWord(String text_value)
	{
		String rev;
		String str_arr[] = text_value.split(" ");
		for(int i = 0; i<str_arr.length; i++)
		{
			rev = "";
			for(int j = 0; j<str_arr[i].length(); j++)
			{
				rev = str_arr[i].charAt(j) + rev;
			}
			System.out.println(rev);
		}
	}
}

public class ReverseWordString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseWord rw = new ReverseWord();
		rw.reverseWord("Mochitha is a beautiful girl");

	}

}
