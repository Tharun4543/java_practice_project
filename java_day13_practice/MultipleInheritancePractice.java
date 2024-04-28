package java_day13_practice;


interface Parent1
{
	String father_name = "Chiranjevi";
	
	String displayParent1();
		
}

interface Parent2
{
	String motherName = "Sunitha";
	
	String displayParent2();
	
		
}

class SuperClass
{
	public int sumNum(int a, int b)
	{
		return a + b;
	}
}

class Child extends SuperClass implements Parent1, Parent2 {

	String childName = "RamCharan";
	public String displayChild()
	{
		return childName;
	}

	@Override
	public String displayParent2() {
		// TODO Auto-generated method stub
		return motherName;
	}

	@Override
	public String displayParent1() {
		// TODO Auto-generated method stub
		return father_name;
	}
	



public class MultipleInheritancePractice
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child cobj = new Child();
		System.out.println(cobj.displayParent2());
		System.out.println(cobj.displayParent1());
		System.out.println(cobj.displayChild());
		System.out.println(cobj.sumNum(10, 40));

	}
}

}


