package Java_day5_practice;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array_values[] = {10, 3, 12, 19, 18};
		int array_sum = 0;
		for(int i = 0; i<array_values.length; i++)
		{
			array_sum = array_sum + array_values[i];
		}
		System.out.println(array_sum);
	}

}
