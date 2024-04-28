package java_day9_practice;

class FirstRepeatCharacter
{
	public void FirstRepeatedNonRepeatedChar(String str_data)
	{
		int count = 0;
		char ch_arr[] = str_data.toCharArray();
		for(int i = 0; i<ch_arr.length; i++)
		{
			for(int j = 0; j<str_data.length(); j++)
			{
				if(ch_arr[i] == str_data.charAt(j))
				{
					count = count + 1;
				}
			}
			if(count > 1)
			{
				System.out.println(ch_arr[i]);
				break;
			}
		}
	}
}
public class FirstReatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstRepeatCharacter frnc = new FirstRepeatCharacter();
		frnc.FirstRepeatedNonRepeatedChar("mochitha");

	}

}
