package java_day12_practice;

//child class can access variables and methods of parent class
/*class Super
{
	 protected int a = 200;
	
	 protected void displaySquare()
	{
		System.out.println(a*a);
	}
}

class Child extends Super
{
	void display()
	{
		System.out.println("This is child class display method");
	}
}*/


//multi level inheritance

/*class GrandParent
{
	int a = 200;
	int b = 500;
	
	void sumTwo()
	{
		System.out.println(a + b);
	}
}

class Parent extends GrandParent
{

	
	void subTwo()
	{
		sumTwo();
		
		System.out.println(a - b);
	}
}

class Child extends Parent
{

	
	void mulTwo()
	{
		System.out.println(a * b);
	}
}

class GrandChild extends Child
{
	
	void divTwo()
	{
		System.out.println(a * b);
	}
}
*/

class ParentFather
{
	int a = 200;
	void display()
	{
		System.out.println("This is class for parent father");
	}
}
class Child1 extends ParentFather
{
	Child1()
	{
		a = 500;

	}
	void displayChild1()
	{
		System.out.println("This is class for child 1 method");
	}
}

class Child2 extends ParentFather
{
	Child2()
	{
		a = 700;

	}
	void displayChild2()
	{
		System.out.println("This is class for child 2");
	}
}
public class InheritancePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Child cobj = new Child(); 
		 * GrandChild gcobj = new GrandChild();
		 * cobj.displaySquare(); cobj.display()
		 * gcobj.sumTwo(); gcobj.subTwo(); gcobj.mulTwo(); gcobj.divTwo();
		 */
		
		Child2 cobj = new Child2(); 
		cobj.displayChild2();
		cobj.display();
		System.out.println(cobj.a);
	
		

	}

}
