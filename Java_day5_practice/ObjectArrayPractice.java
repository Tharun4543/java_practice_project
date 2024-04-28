package Java_day5_practice;

import java.util.Arrays;

public class ObjectArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object array_stu_data[] = new Object[4];
		
		array_stu_data[0] = "10ABD";
		array_stu_data[1] = "Tharun Nagiri";
		array_stu_data[2] = "CSE";
		array_stu_data[3] = true;
		
		System.out.println(Arrays.toString(array_stu_data));
		
		for(int i = 0; i<array_stu_data.length; i++)
		{
			System.out.println(array_stu_data[i]);
		}
		for(Object value : array_stu_data)
		{
			System.out.println(value);
		}
		
		Object employee_info[][] = 
			{
				{
					"Mark juker berg",
					9012,
					"A",
					true	
				},
				{
					"Sundhar",
					9012,
				}
			};
		System.out.println(Arrays.deepToString(employee_info));
		System.out.println(employee_info[1][1]);
	}
	

}
