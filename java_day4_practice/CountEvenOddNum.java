package java_day4_practice;

public class CountEvenOddNum {

	public static void main(String[] args) {
		int num = 8879, even_count = 0, odd_count = 0;
		
		while(num>0)
		{
			int digit = num % 10;
			if(digit % 2 == 0)
			{
				even_count+= 1;
			}
			else
			{
				odd_count+= 1;
			}
			num = num / 10;
			
		}
		System.out.println(even_count + " " + odd_count);

	}

}
