package java_day32_practice;

import java.util.Arrays;
import java.util.List;

class Student
{
	int id;
	String name;
	char grade;
	
	Student(int id, String name, char grade)
	{
		this.id = id; 
		this.name = name;
		this.grade = grade;
	}
}
public class FlatMapPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> student_list1 = Arrays.asList(new Student(101, "Tharun", 'C'),
				new Student(102, "Reenu", 'C'),
				new Student(103, "Aadhi", 'A'),
				new Student(104, "Sachin", 'D'));
		
		List<Student> student_list2 = Arrays.asList(new Student(105, "Sai", 'A'),
				new Student(106, "Raj Kumar", 'C'),
				new Student(107, "Bhavesh", 'A'));
		
		List<List<Student>> final_stu_list = Arrays.asList(student_list1, student_list2);
		for(List<Student> s : final_stu_list)
		{
			for(Student stu_obj : s)
			{
				System.out.println(stu_obj.name);
			}
			
		}
		//using streams approach 2
		final_stu_list.stream()
		.flatMap(stu_obj -> stu_obj.stream())
		.map(stu_obj -> stu_obj.name).forEach(System.out::println);


	}

}
