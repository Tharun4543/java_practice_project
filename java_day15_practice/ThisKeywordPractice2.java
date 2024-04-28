package java_day15_practice;

//issue 1
class ThisApproach2

{
	int age = 30;
	String name = "Mochitha";
	
	public void setData(int age, String name)
	{
		ThisApproach2 sp = new ThisApproach2();
		sp.age = age;
		sp.name = name;
	}
	
	public void getData()
	{
		System.out.println(age);
		System.out.println(name);
	}
	
	
	
	
}
//issue2

class ThisApproach2Issue2

{
	int age = 30;
	String name = "Mochitha";
	
	public void setData(int age, String name, ThisApproach2Issue2 tai)
	{
		ThisApproach2 sp = new ThisApproach2();
		tai.age = age;
		tai.name = name;
	}
	
	public void getData()
	{
		System.out.println(age);
		System.out.println(name);
	}
	
	
	
	
}

public class ThisKeywordPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisApproach2Issue2 ta = new ThisApproach2Issue2();
		ta.setData(40, "Dinesh", ta);
		ta.getData();

	}

}
