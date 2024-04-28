package java_day8_practice;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "malayalam", rev = "";
		for(int i = s1.length()-1; i>=0; i--)
		{
			rev = rev + s1.charAt(i);
		}
		System.out.println(s1);
		System.out.println(rev);
		if(s1.equals(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}

	}

}
