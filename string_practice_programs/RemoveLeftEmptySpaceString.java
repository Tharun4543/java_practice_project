package string_practice_programs;

class RemoveLeftSpaces
{
	
		int left_trim_count = 0;
		
		public String leftTrimString(String str_data)
		{
			for(int i = 0; i<str_data.length(); i++)
			{
				if(str_data.charAt(i) == ' ')
				{
					left_trim_count = left_trim_count + 1;
				}
				else
				{
					break;
				}
			}
			
			String left_trim_str = str_data.substring(left_trim_count);
			return left_trim_str;
			
		}
	
	
}

public class RemoveLeftEmptySpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveLeftSpaces rls = new RemoveLeftSpaces();
		System.out.println(rls.leftTrimString("    Mochitha     "));;


	}
}

