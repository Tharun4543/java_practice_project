package Java_day5_practice;

import java.util.Arrays;

public class SingleDimensionArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* How to declare an array
		 * How to know size of the array
		 * Read single value in array
		 * Read entire data in array
		 */
		
		//declare an array approach 1
		int array_data[] = new int[3];
		//assign a values 
		array_data[0] = 20;
		array_data[1] = 40;
		array_data[2] = 100;
		//array_data[3] = 34;
		//know the size of array
		System.out.println(array_data.length);
		//to read single value
		System.out.println(array_data[2]);
		//to read entire data in a array
		//approach1
		System.out.println(Arrays.toString(array_data));
		//approach2
		for(int i = 0; i<array_data.length;i++)
		{
			System.out.println(array_data[i]);
		}
		//approach 3
		for(int array_value : array_data)
		{
			System.out.println(array_value);
		}
		
		//declare an array approach 2
		String []str_data = {"Tharun", "Sagar", "Sai kumar"};   //flexible(add or update new elements easily and preferable method
		System.out.println(Arrays.toString(str_data));

	}

}
