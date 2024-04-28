package java_day6_practice;

public class SearchValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array_data[] = {10, 12, 8, 9, 11};
		int search_number = 111;
		boolean result = false;
		for(int i = 0; i<array_data.length; i++)
		{
			if(array_data[i] == search_number)
			{
				System.out.println("Search element is found i.e " + search_number);
				result = true;
				break;
			}
		}
		if(result == false)
		{
			System.out.println("Search element is not found i.e " + search_number);
		}

	}

}
