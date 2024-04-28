package java_day15_practice;

class Variables
{
	
	int age = 10;
	String name = "Tharun";
	boolean is_married = false;
	
	public void setData(int age, String name, boolean is_married)
	{
		this.age = age;
		this.name = name;
		this.is_married = is_married;
	}
	public void displayData()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(is_married);
		
	}
}

public class ThisKeywordPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variables vr = new Variables();
		vr.setData(15, "Mochitha", true);
		vr.displayData();

	}

}
