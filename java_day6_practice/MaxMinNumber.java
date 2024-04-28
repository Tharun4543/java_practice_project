package java_day6_practice;

public class MaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array_data[] = {10, 4, 22, 90, 88};
		/*
		 * int max_value = array_data[0]; for(int i = 0; i<array_data.length; i++) {
		 * if(array_data[i]>max_value) { max_value = array_data[i]; } }
		 * System.out.println(max_value);
		 */
		
		int min_value = array_data[0];
		for(int i = 0; i<array_data.length; i++)
		{
			if(array_data[i]<min_value)
			{
				min_value = array_data[i];
			}
		}
		System.out.println(min_value);

	}

}
