package java_day_33_practice;

import java.util.Arrays;
import java.util.List;

class Student
{
	int score;
	String name;
	
	Student(String name, int score)
	{
		this.name = name;
		this.score = score;
		
	}
	public String getName()
	{
		return this.name;
	}
	public int getScore()
	{
		return this.score;
	}
}

public class ParallelStreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> stu_list_obj = Arrays.asList(new Student("Tharun", 55),
				new Student("Deepu", 85),
				new Student("Reenu", 75),
				new Student("Lakshmi", 95),
				new Student("Anjali", 57));
		
//		stu_list_obj.stream()
//		.filter(s -> s.getScore()>60)
//		.forEach(stu_obj-> System.out.println(stu_obj.getName() + "   " + stu_obj.getScore()));
//		
		//using parallel stream 
//		
//		stu_list_obj.parallelStream()
//		.filter(s -> s.getScore()> 60)
//		.forEach(stu_obj -> System.out.println(stu_obj.getName() + "   " + stu_obj.getScore()));
		
		//perform parallel stream after performing normal stream 
		stu_list_obj.stream()
		.parallel()
		.filter(s -> s.getScore()>60)
		.forEach(stu_obj -> System.out.println(stu_obj.getName() + "   " + stu_obj.getScore()));

	}

}
