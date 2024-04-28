package java_day4_practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 121, rev_num = 0;
		int actual_num = num;
		
		while(num>0)
		{
			int digit = num % 10;
			rev_num = rev_num * 10 + digit;
			num = num/10;
					
		}
		if(actual_num == rev_num)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not a palindrome");
		}

	}

}
