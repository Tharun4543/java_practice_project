package string_practice_programs;

class RemoveSpaces
{
	public String removeSpaceString(String str_value)
	{
		return str_value.trim();
		
	}
	public String removeLeftSpaceString(String str_value)
	{
		return str_value.stripLeading();
		
	}
	public String removeRightSpaceString(String str_value)
	{
		return str_value.stripTrailing();
		
	}
	
	public String removeLeftSpacesUserMeth(String str_value)
	
	
	{
		for(int i = 0; i<str_value.length(); i ++)
		{
			if(str_value.charAt(i) == ' ')
			{
				str_value = str_value.replace(" ", "");
			}
			else
			{
				System.out.println(str_value.charAt(i));
				break;
			}
		}
		return str_value;
	}
}

public class RemoveSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveSpaces rs = new RemoveSpaces();
		String trim_string = rs.removeSpaceString("      Mochitha is a beautiful girl      ");
		System.out.println("The trimmed string is " + trim_string);
		String left_trim_string = rs.removeLeftSpaceString("      Mochitha is a beautiful girl      ");
		System.out.println(left_trim_string.length());
		System.out.println("The left trimmed string is " + left_trim_string);
		String right_trim_string = rs.removeRightSpaceString("      Mochitha is a beautiful girl      ");
		System.out.println(right_trim_string.length());
		System.out.println("The right trimmed string is " + right_trim_string);
		String left_trim_user_meth = rs.removeLeftSpacesUserMeth("       Mochitha    ");
		System.out.println(left_trim_user_meth.length());

	}

}
