package java_day4_practice;

public class JumpingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		
		while (i <= 10) {
			if (i == 5) {
				i++;
				continue;
			}
			System.out.println(i);
			i = i + 1;
		}
		 
		
		for(i = 1; i<=10; i++)
		{
			if (i == 5)
			{
				continue;
			}
			System.out.println(i);
			
		}

	}

}
