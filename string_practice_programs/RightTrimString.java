package string_practice_programs;

class RightTrim
{
	
	public String rightTrimStr(String str_data)
	{
		int right_str_trim_count = 0;
		for(int i = str_data.length()-1; i>=0; i--)
		{
			if(str_data.charAt(i) == ' ')
			{
				right_str_trim_count = right_str_trim_count + 1;
			}
			else
			{
				break;
			}
		}
		int length_str = str_data.length();
		String right_trim_string = str_data.substring(0, length_str-right_str_trim_count);
		System.out.println(right_trim_string.length());
		return right_trim_string;
	}
}

public class RightTrimString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RightTrim rt = new RightTrim();
		System.out.println(rt.rightTrimStr("   Sai Pallavi     "));;

	}

}
