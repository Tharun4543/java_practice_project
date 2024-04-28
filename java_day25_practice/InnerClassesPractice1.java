package java_day25_practice;

public class InnerClassesPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method of inner classes1");

	}

}

class InnerClasses2
{
	//we can have main method from each class but we need to select which class should be executed at runtime 
	public static void main(String args[])
	{
		System.out.println("This is main method of inner classes1");
	}
	public void show()
	{
		System.out.println("This is show method");
	}
}
class InnerClasses3
{
	public static void main(String args[])
	{
		System.out.println("This is main method of inner classes2");
	}
	public void display()
	{
		System.out.println("This is display method");
	}
}
