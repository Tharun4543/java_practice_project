package java_day31_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id, salary;
	String name;
	
	Product(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class FilterPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//approach 1 to add objects into the array list 
		List<Product> product_obj_list = new ArrayList<Product>();
		product_obj_list.add(new Product(101, "Laptop", 30000));
		product_obj_list.add(new Product(101, "Printers", 23000));
		product_obj_list.add(new Product(101, "Mobile", 32000));
		product_obj_list.add(new Product(101, "Cooler", 38000));
		
		//approach 2 to add objects into the array list
		List<Product> product_list_info = Arrays.asList(new Product(101, "Laptop", 30000),
				new Product(101, "Printers", 23000),
				new Product(102, "Mobile", 32000),
				new Product(103, "Cooler", 38000));
		
		//filter whose salary is greter than 30000 - general approach 
		
		for(Product pr_obj :product_list_info)
		{
			if(pr_obj.salary>30000)
			{
				System.out.println(pr_obj.id + "  " +  pr_obj.name + "  " +  pr_obj.salary);
			}
		}
		
		//using stream 
		
		List<Product> product_list = product_list_info.stream()
		.filter(pr_obj -> pr_obj.salary>30000).collect(Collectors.toList());
	
		product_list_info.stream()
		.filter(pr_obj -> pr_obj.salary>30000)
		.forEach(pr -> System.out.println(pr.id + "  " + pr.name + "  "+  pr.salary));

	}

}
