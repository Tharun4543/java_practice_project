package java_day4_practice;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		/*
		 * while(i<=5) { System.out.println(i); i++; }
		 */
		/*
		 * while(i<=5) { System.out.println("Hey I like you"); i++; }
		 */
		//To print even numbers
		int j = 10;
		i = 2;
		/*
		 * while(i<=10) { if(i%2 == 0) { System.out.println(i + "  " + "Even"); i+= 2; }
		 * }
		 */
		i = 1;
		/*
		 * while(i<=10) { if(i%2 != 0) { System.out.println(i + "  " + "Odd"); i+= 2; }
		 * }
		 */
		
		j = 5;
		while(j>0)
		{
			System.out.println(j);
			j--;
		}
		

	}

}
