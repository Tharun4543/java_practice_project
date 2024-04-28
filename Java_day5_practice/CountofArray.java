package Java_day5_practice;

public class CountofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even_arr_values[] = {11, 12, 90, 83, 75, 55};
		int even_count = 0, odd_count = 0;
		for(int i = 0; i<even_arr_values.length; i++)
		{
			if(even_arr_values[i] % 2 == 0)
			{
				even_count = even_count + 1;
			}
			else
			{
				odd_count+= 1;
				
			}
		}
		System.out.println(even_count + "     " + odd_count);

	}

}
