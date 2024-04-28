package java_day4_practice;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1290, rev_num = 0;
		
		while(num>0)
		{
			int digit = num % 10;
			rev_num = rev_num * 10 + digit;
			num = num /10;
			
			
		}
		System.out.println(rev_num);

	}

}
