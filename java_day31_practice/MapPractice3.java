package java_day31_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int id, salary; 
	String emp_name;
	
	Employee(int id, int salary, String emp_name)
	{
		this.id = id;
		this.emp_name = emp_name;
		this.salary = salary;
		
		
	}
}

public class MapPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add object elements into two ways 
		List<Employee> emp_obj = new ArrayList<Employee>();
		emp_obj.add(new Employee(101, 12000, "Tharun"));
		emp_obj.add(new Employee(102, 90000, "Sachin"));
		emp_obj.add(new Employee(101, 122000, "Aadhi"));
		
		//another approach 
		List<Employee> emp_obj_list = Arrays.asList(new Employee(101, 12000, "Tharun"),
		new Employee(102, 90000, "Sachin"),
		new Employee(101, 100000, "Aadhi"));
		
		//using general approach 
		
		for(Employee e : emp_obj_list)
		{
			if(e.salary>15000)
			{
				System.out.println(e.salary + 10000);
			}
		}
		
		//using streams 
		List<String> emp_filter_list = emp_obj_list.stream()
		.filter(e -> e.salary>15000)
		.map(e -> e.emp_name + "   " +  (e.salary + 5000))
		.collect(Collectors.toList());
		
		System.out.println(emp_filter_list);
		
		//print values with out using variable 
		emp_obj_list.stream()
		.filter(e -> e.salary>15000)
		.map(e -> e.emp_name + "  " + (e.salary + 5000))
		.forEach(System.out::println);
		
		//approach 3
		emp_obj_list.stream()
		.filter(e -> e.salary>15000)
		.map(e -> e.emp_name + "  " + (e.salary + 5000))
		.forEach(sal -> System.out.println(sal));
		
		

	}

}
