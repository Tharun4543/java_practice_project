package string_practice_programs;

class ChangeWords
{
	public void ChangeWordsUpperLower(String str_data)
	{
		String str_arr[] = str_data.split(" ");
		for(int i = 1;i<=str_arr.length; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(str_arr[i-1].toUpperCase());
			}
			else
			{
				System.out.println(str_arr[i-1].toLowerCase());
			}
		}
		
	}
}
public class ChangeWordsCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChangeWords cw = new ChangeWords();
		cw.ChangeWordsUpperLower("Mochitha is a beautiful girl");

	}

}
