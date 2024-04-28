package java_day6_practice;

public class FindDuplicateCountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_data[] = {9, 11, 32, 43, 43, 43, 43, 111};
		int element_count = 0, search_number = 1190;
		for(int i = 0; i<array_data.length; i++)
		{
			if(array_data[i] == search_number)
			{
				element_count = element_count + 1;
			}
		}
		if(element_count == 0)
		{
			System.out.println("Search number is not present in array");
		}
		else
		{
			System.out.println("Search number count is " + element_count);
		}

	}

}
