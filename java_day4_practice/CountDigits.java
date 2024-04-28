package java_day4_practice;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9, count = 0;
		while(num>0)
		{
			//int digit = num % 10;
			
			num = num / 10;
			count = count + 1;
			
		}
		System.out.println(count);

	}

}
