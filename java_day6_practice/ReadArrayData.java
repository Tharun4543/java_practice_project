package java_day6_practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArrayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*
		 * int array_data[] = new int[5];
		 * 
		 * 
		 * for(int i = 0; i<array_data.length; i++) { array_data[i] = sc.nextInt(); }
		 * 
		 * System.out.println(Arrays.toString(array_data));
		 */
		
		int array_two_dim_data[][] = new int[2][3];
		for(int i = 0; i<array_two_dim_data.length; i ++)
		{
			for(int j = 0; j<array_two_dim_data[0].length; j++)
			{
				array_two_dim_data[i][j] = sc.nextInt();			}
		}
		
		System.out.println(Arrays.deepToString(array_two_dim_data));
	}

}
