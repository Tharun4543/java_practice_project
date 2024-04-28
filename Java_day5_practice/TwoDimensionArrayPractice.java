package Java_day5_practice;

import java.util.Arrays;

public class TwoDimensionArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* How to declare an array
		 * How to know size of the array
		 * Read single value in array
		 * Read entire data in array
		 */
		
		//To declare an 2-D-array approach 1
		int two_dim_array[][] = new int[2][2];
		two_dim_array[0][0] = 40;
		two_dim_array[0][1] = 30;
		two_dim_array[1][0] = 100;
		two_dim_array[1][1] = 50;
		//to find size of 2-d array
		//how to know row size
		System.out.println(two_dim_array.length);
		//how to know column size
		System.out.println(two_dim_array[0].length);
		//read single value
		System.out.println(two_dim_array[1][0]);
		//read all values approach1
		for(int row = 0; row<two_dim_array.length; row++)
		{
			for(int col = 0; col<two_dim_array[row].length; col++)
			{
				System.out.print(two_dim_array[row][col] + "  ");
			}
			System.out.println();
		}
		//read all values approach 2
		for(int array_values[] : two_dim_array)
		{
			for(int value : array_values)
			{
				System.out.print(value);
			}
			System.out.println();
		}
		
		//to declare 2-d array approach 2
		int[][] array_values_data = {
										{10, 20},
										{30, 40},
										{50, 60}
									};
		System.out.println(Arrays.deepToString(array_values_data));
		

	}

}
